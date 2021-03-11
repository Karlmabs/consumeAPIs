package dto;

import com.afrikbrain.banque.corebanking.administration.structures.entities.UniteBancaire;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Taux;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.TauxParDate;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.VariationTaux;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.ETypeParamTaux;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TauxDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String libelle;
	private String typeTaux;
	private Double minimaVariation;
	private String codeUnite;
	private Set<VariationTauxDTO> marges = new HashSet<VariationTauxDTO>();
	private Set<TauxParDateDTO> tauxDate = new HashSet<TauxParDateDTO>();
	
	public void toDTO(Taux taux){
		Set<VariationTauxDTO> margeList = new HashSet<VariationTauxDTO>();
		Set<TauxParDateDTO> tauxDateList = new HashSet<TauxParDateDTO>();
		setId(taux.getId());
		setCode(taux.getCode());
		setLibelle(taux.getCode());
		setTypeTaux(taux.getTypeTaux().toString());
		setMinimaVariation(taux.getMinimaVariation());
		setCodeUnite(taux.getUnite().getCode());
		
		for(VariationTaux temp : taux.getMarges()){
			VariationTauxDTO margeDTO = new VariationTauxDTO();
			margeDTO.toDTO(temp);
			margeList.add(margeDTO);
		}
		for(TauxParDate temp : taux.getTauxDate()){
			TauxParDateDTO tauxDTO = new TauxParDateDTO();
			tauxDTO.toDTO(temp);
			tauxDateList.add(tauxDTO);
		}
		
		setMarges(margeList);
		setTauxDate(tauxDateList);
		
	}
	
	public Taux toEntity() throws Exception{
		initContext();
		Taux taux = new Taux();
		Set<VariationTaux> margeList = new HashSet<VariationTaux>();
		Set<TauxParDate> tauxDateList = new HashSet<TauxParDate>();
		List<UniteBancaire> uniteBancaireList = administrationBean.findUniteBancaire(codeUnite, null, null, null, null, null, 0, -1);
		UniteBancaire uniteBancaire = null;
		if(!uniteBancaireList.isEmpty()){
			uniteBancaire = uniteBancaireList.get(0);
		}
		taux.setId(getId());
		taux.setCode(getCode());
		taux.setLibelle(getLibelle());
		taux.setTypeTaux(ETypeParamTaux.valueOf(getTypeTaux()));
		taux.setMinimaVariation(getMinimaVariation());
		taux.setUnite(uniteBancaire);
		
		for(VariationTauxDTO marge : getMarges()){
			margeList.add(marge.toEntity());
		}
		
		for(TauxParDateDTO temp : getTauxDate()){
			tauxDateList.add(temp.toEntity());
		}
		taux.setMarges(margeList);
		taux.setTauxDate(tauxDateList);
		
		return taux;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getTypeTaux() {
		return typeTaux;
	}
	public void setTypeTaux(String typeTaux) {
		this.typeTaux = typeTaux;
	}
	public Double getMinimaVariation() {
		return minimaVariation;
	}
	public void setMinimaVariation(Double minimaVariation) {
		this.minimaVariation = minimaVariation;
	}
	public String getCodeUnite() {
		return codeUnite;
	}
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}
	public Set<VariationTauxDTO> getMarges() {
		return marges;
	}
	public void setMarges(Set<VariationTauxDTO> marges) {
		this.marges = marges;
	}

	public Set<TauxParDateDTO> getTauxDate() {
		return tauxDate;
	}

	public void setTauxDate(Set<TauxParDateDTO> tauxDate) {
		this.tauxDate = tauxDate;
	}
	

}
