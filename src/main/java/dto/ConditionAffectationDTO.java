package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.ConditionAffectation;
import com.afrikbrain.banque.corebanking.engagement.garantie.entities.SousTypeGarantie;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.EPeriodiciteET;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConditionAffectationDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	private String intitule;
	private String renouvellementAuto;
	private String periodicite;
	private String perceptionCommission;
	private String obligatoire;
	private UniteBancaireDTOmin unite;
	private List<SousTypeGarantieDTOmin> sousTypeGarantie = new ArrayList<SousTypeGarantieDTOmin>();
	private TypeEngagementDTO typeEngagement;
	private CompteDTOmin compte;
	
	public void toDTO(ConditionAffectation conditionAffectation){
		setId(conditionAffectation.getId());
		setVersion(conditionAffectation.getVersion());
		setCode(conditionAffectation.getCode());
		setIntitule(conditionAffectation.getIntitule());
		setRenouvellementAuto(conditionAffectation.getRenouvellementAuto().toString());
		setPeriodicite(conditionAffectation.getPeriodicite().toString());
		setPerceptionCommission(conditionAffectation.getPerceptionCommission().toString());
		setObligatoire(conditionAffectation.getObligatoire().toString());
	}
	
	public ConditionAffectation toEntity() throws Exception{
		ConditionAffectation conditionAffectation = new ConditionAffectation();
		conditionAffectation.setId(getId());
		conditionAffectation.setVersion(getVersion());
		conditionAffectation.setCode(getCode());
		conditionAffectation.setIntitule(getIntitule());
		conditionAffectation.setRenouvellementAuto(EYesNo.valueOf(getRenouvellementAuto()));
		conditionAffectation.setPeriodicite(EPeriodiciteET.valueOf(getPeriodicite()));
		conditionAffectation.setPerceptionCommission(EYesNo.valueOf(getPerceptionCommission()));
		conditionAffectation.setObligatoire(EYesNo.valueOf(getObligatoire()));
		conditionAffectation.setUnite(getUnite().toEntity());
		conditionAffectation.setTypeEngagement(getTypeEngagement().toEntity());
		conditionAffectation.setCompte(getCompte().toEntity());
		List<SousTypeGarantie> sousTypeGarantieList = new ArrayList<SousTypeGarantie>();
		for(SousTypeGarantieDTOmin temp : getSousTypeGarantie()){
			sousTypeGarantieList.add(temp.toEntity());
		}
		conditionAffectation.setSousTypeGarantie(sousTypeGarantieList);
		
		return conditionAffectation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getRenouvellementAuto() {
		return renouvellementAuto;
	}
	public void setRenouvellementAuto(String renouvellementAuto) {
		this.renouvellementAuto = renouvellementAuto;
	}
	public String getPeriodicite() {
		return periodicite;
	}
	public void setPeriodicite(String periodicite) {
		this.periodicite = periodicite;
	}
	public String getPerceptionCommission() {
		return perceptionCommission;
	}
	public void setPerceptionCommission(String perceptionCommission) {
		this.perceptionCommission = perceptionCommission;
	}
	public String getObligatoire() {
		return obligatoire;
	}
	public void setObligatoire(String obligatoire) {
		this.obligatoire = obligatoire;
	}
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}
	public List<SousTypeGarantieDTOmin> getSousTypeGarantie() {
		return sousTypeGarantie;
	}
	public void setSousTypeGarantie(List<SousTypeGarantieDTOmin> sousTypeGarantie) {
		this.sousTypeGarantie = sousTypeGarantie;
	}
	public TypeEngagementDTO getTypeEngagement() {
		return typeEngagement;
	}
	public void setTypeEngagement(TypeEngagementDTO typeEngagement) {
		this.typeEngagement = typeEngagement;
	}
	public CompteDTOmin getCompte() {
		return compte;
	}
	public void setCompte(CompteDTOmin compte) {
		this.compte = compte;
	}
	
	
}
