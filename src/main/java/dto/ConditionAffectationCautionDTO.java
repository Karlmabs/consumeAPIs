package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.ConditionAffectationCaution;
import com.afrikbrain.banque.corebanking.engagement.garantie.entities.SousTypeGarantie;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.EPeriodiciteET;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConditionAffectationCautionDTO implements Serializable{

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
	private TypeCautionDTOmin typeCaution;
	private CompteDTOmin compte;
	
	public void toDTO(ConditionAffectationCaution condition){
		setId(condition.getId());
		setVersion(condition.getVersion());
		setCode(condition.getCode());
		setIntitule(condition.getIntitule());
		setRenouvellementAuto(condition.getRenouvellementAuto().toString());
		setPeriodicite(condition.getPeriodicite().toString());
		setPerceptionCommission(condition.getPerceptionCommission().toString());
	}
	
	public ConditionAffectationCaution toEntity(){
		ConditionAffectationCaution condition = new ConditionAffectationCaution();
		condition.setId(getId());
		condition.setVersion(getVersion());
		condition.setCode(getCode());
		condition.setIntitule(getIntitule());
		condition.setRenouvellementAuto(EYesNo.valueOf(getRenouvellementAuto()));
		condition.setPeriodicite(EPeriodiciteET.valueOf(getPeriodicite()));
		condition.setPerceptionCommission(EYesNo.valueOf(getPerceptionCommission()));
		condition.setObligatoire(EYesNo.valueOf(getObligatoire()));
		condition.setUnite(getUnite().toEntity());
		condition.setTypeCaution(getTypeCaution().toEntity());
		condition.setCompte(getCompte().toEntity());
		List<SousTypeGarantie> sousTypeGarantieList = new ArrayList<SousTypeGarantie>();
		for(SousTypeGarantieDTOmin temp : getSousTypeGarantie()){
			sousTypeGarantieList.add(temp.toEntity());
		}
		condition.setSousTypeGarantie(sousTypeGarantieList);
		
		return condition;
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
	public TypeCautionDTOmin getTypeCaution() {
		return typeCaution;
	}
	public void setTypeCaution(TypeCautionDTOmin typeCaution) {
		this.typeCaution = typeCaution;
	}
	public CompteDTOmin getCompte() {
		return compte;
	}
	public void setCompte(CompteDTOmin compte) {
		this.compte = compte;
	}
	
}
