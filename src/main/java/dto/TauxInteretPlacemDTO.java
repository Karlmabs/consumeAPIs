package dto;

import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.DeviseUnite;
import com.afrikbrain.banque.corebanking.administration.structures.entities.UniteBancaire;
import com.afrikbrain.banque.corebanking.engagement.placement.ENaturePlacement;
import com.afrikbrain.banque.corebanking.engagement.placement.entites.TauxInteretPlacem;
import com.afrikbrain.banque.corebanking.engagement.placement.entites.TypeDePlacem;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Taux;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.List;

public class TauxInteretPlacemDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String codeTauxInteret;
	private String codeTypeDePlacem;
	private String codeUnite;
	private Long idDeviseUnite;
	private String eNaturePlacem;
	
	public void toDTO(TauxInteretPlacem tauxInteretPlacem){
		setId(tauxInteretPlacem.getId());
		setCodeTauxInteret(tauxInteretPlacem.getTauxInteret().getCode());
		setCodeTypeDePlacem(tauxInteretPlacem.getTypeDePlacem().getCode());
		setCodeUnite(tauxInteretPlacem.getUnite().getCode());
		setIdDeviseUnite(tauxInteretPlacem.getDeviseUnite().getId());
		seteNaturePlacem(tauxInteretPlacem.getENaturePlacem().toString());
	}
	
	public TauxInteretPlacem toEntity() throws Exception{
		initContext();
		TauxInteretPlacem tauxInteretPlacem = new TauxInteretPlacem();
		Taux tauxInteret = engagementBean.findTaux(null, null, null, getCodeTauxInteret(), null);
		tauxInteretPlacem.setCodeTauxInteret(tauxInteret);
		List<TypeDePlacem> typeDePlacemList = iplacement.findTypeDePlacem(null, getCodeTypeDePlacem(), null, null, null, 0, -1);
		if(!typeDePlacemList.isEmpty()){
			tauxInteretPlacem.setTypeDePlacem(typeDePlacemList.get(0));
		}
		List<UniteBancaire> uniteBancaireList = administrationBean.findUniteBancaire(getCodeUnite(), null, null, null, null, null, 0, -1);
		if(!uniteBancaireList.isEmpty()){
			tauxInteretPlacem.setUnite(uniteBancaireList.get(0));
		}
		DeviseUnite deviseUnite = administrationBean.findByPrimaryKey(DeviseUnite.class, getIdDeviseUnite(), null);
		tauxInteretPlacem.setDeviseUnite(deviseUnite);
		tauxInteretPlacem.seteNaturePlacem(ENaturePlacement.valueOf(eNaturePlacem));
		return tauxInteretPlacem;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCodeTauxInteret() {
		return codeTauxInteret;
	}
	public void setCodeTauxInteret(String codeTauxInteret) {
		this.codeTauxInteret = codeTauxInteret;
	}
	public String getCodeTypeDePlacem() {
		return codeTypeDePlacem;
	}
	public void setCodeTypeDePlacem(String codeTypeDePlacem) {
		this.codeTypeDePlacem = codeTypeDePlacem;
	}
	public String getCodeUnite() {
		return codeUnite;
	}
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}
	public Long getIdDeviseUnite() {
		return idDeviseUnite;
	}
	public void setIdDeviseUnite(Long idDeviseUnite) {
		this.idDeviseUnite = idDeviseUnite;
	}
	public String geteNaturePlacem() {
		return eNaturePlacem;
	}
	public void seteNaturePlacem(String eNaturePlacem) {
		this.eNaturePlacem = eNaturePlacem;
	}
	
	

}
