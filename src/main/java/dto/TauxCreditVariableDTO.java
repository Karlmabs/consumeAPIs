package dto;

import com.afrikbrain.banque.corebanking.administration.structures.entities.UniteBancaire;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Taux;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.TauxCreditVariable;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.ETypeTaux;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.List;

public class TauxCreditVariableDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String codeUnite;
	private Integer numeroDebut;
	private Integer numeroFin;
	private Double tauxInteret;
	private String typeTaux;
	private String codeTauxReference;
	
	public void toDTO(TauxCreditVariable tauxCreditVariable){
		setId(tauxCreditVariable.getId());
		setCodeUnite(tauxCreditVariable.getUnite().getCode());
		setNumeroDebut(tauxCreditVariable.getNumeroDebut());
		setNumeroFin(tauxCreditVariable.getNumeroFin());
		setTauxInteret(tauxCreditVariable.getTauxInteret());
		setTypeTaux(tauxCreditVariable.getTypeTaux().toString());
		setCodeTauxReference(tauxCreditVariable.getTauxReference().getCode());
	}
	
	public TauxCreditVariable toEntity() throws Exception{
		initContext();
		TauxCreditVariable tauxCreditVariable = new TauxCreditVariable();
		tauxCreditVariable.setId(getId());
		List<UniteBancaire> uniteBancaireList = administrationBean.findUniteBancaire(getCodeUnite(), null, null, null, null, null, 0, 1);
		UniteBancaire uniteBancaire = null;
		if(!uniteBancaireList.isEmpty()){
			uniteBancaire = uniteBancaireList.get(0);
		}
		tauxCreditVariable.setUnite(uniteBancaire);
		tauxCreditVariable.setNumeroDebut(getNumeroDebut());
		tauxCreditVariable.setNumeroFin(getNumeroFin());
		tauxCreditVariable.setTauxInteret(getTauxInteret());
		tauxCreditVariable.setTypeTaux(ETypeTaux.valueOf(getTypeTaux()));
		Taux taux = engagementBean.findTaux(null, null, null, getCodeTauxReference(), null);
		tauxCreditVariable.setTauxReference(taux);
		
		return tauxCreditVariable;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeUnite() {
		return codeUnite;
	}
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}
	public Integer getNumeroDebut() {
		return numeroDebut;
	}
	public void setNumeroDebut(Integer numeroDebut) {
		this.numeroDebut = numeroDebut;
	}
	public Integer getNumeroFin() {
		return numeroFin;
	}
	public void setNumeroFin(Integer numeroFin) {
		this.numeroFin = numeroFin;
	}
	public Double getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	

	public String getTypeTaux() {
		return typeTaux;
	}


	public void setTypeTaux(String typeTaux) {
		this.typeTaux = typeTaux;
	}


	public String getCodeTauxReference() {
		return codeTauxReference;
	}
	public void setCodeTauxReference(String codeTauxReference) {
		this.codeTauxReference = codeTauxReference;
	}
	
	

}
