package dto;

import java.io.Serializable;

public class FindListConditionAffectationCautionDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UniteBancaireDTOmin uniteBancaire;
	private TypeCautionDTOmin typeCaution;
	private String code;
	private String intitule; 
	private String commission; 
	private String obligatoire;
	private String codeTypeCaution; 
	private int firstResult;
	private int maxResult;
	public UniteBancaireDTOmin getUniteBancaire() {
		return uniteBancaire;
	}
	public void setUniteBancaire(UniteBancaireDTOmin uniteBancaire) {
		this.uniteBancaire = uniteBancaire;
	}
	public TypeCautionDTOmin getTypeCaution() {
		return typeCaution;
	}
	public void setTypeCaution(TypeCautionDTOmin typeCaution) {
		this.typeCaution = typeCaution;
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
	public String getCommission() {
		return commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}
	public String getObligatoire() {
		return obligatoire;
	}
	public void setObligatoire(String obligatoire) {
		this.obligatoire = obligatoire;
	}
	public String getCodeTypeCaution() {
		return codeTypeCaution;
	}
	public void setCodeTypeCaution(String codeTypeCaution) {
		this.codeTypeCaution = codeTypeCaution;
	}
	public int getFirstResult() {
		return firstResult;
	}
	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}
	public int getMaxResult() {
		return maxResult;
	}
	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}
	
	
}
