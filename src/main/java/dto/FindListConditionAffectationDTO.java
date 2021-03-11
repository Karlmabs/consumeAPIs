package dto;

import java.io.Serializable;

public class FindListConditionAffectationDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UniteBancaireDTOmin uniteBancaire;
	private TypeEngagementDTO typeEnga; 
	private String code;
	private String intitule; 
	private String commission; 
	private String Obligatoire;
	private String codeTypEnga; 
	private int firstResult; 
	private int maxResult;
	public UniteBancaireDTOmin getUniteBancaire() {
		return uniteBancaire;
	}
	public void setUniteBancaire(UniteBancaireDTOmin uniteBancaire) {
		this.uniteBancaire = uniteBancaire;
	}
	public TypeEngagementDTO getTypeEnga() {
		return typeEnga;
	}
	public void setTypeEnga(TypeEngagementDTO typeEnga) {
		this.typeEnga = typeEnga;
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
		return Obligatoire;
	}
	public void setObligatoire(String obligatoire) {
		Obligatoire = obligatoire;
	}
	public String getCodeTypEnga() {
		return codeTypEnga;
	}
	public void setCodeTypEnga(String codeTypEnga) {
		this.codeTypEnga = codeTypEnga;
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
