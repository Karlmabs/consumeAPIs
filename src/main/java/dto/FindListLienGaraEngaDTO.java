package dto;

import java.io.Serializable;

public class FindListLienGaraEngaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UniteBancaireDTOmin uniteBancaire;
	private AgenceDTOmin agence;
	private String CodeEnga;
	private String CodeGarantie;
	private int firstResult;
	private int maxResult;
	public UniteBancaireDTOmin getUniteBancaire() {
		return uniteBancaire;
	}
	public void setUniteBancaire(UniteBancaireDTOmin uniteBancaire) {
		this.uniteBancaire = uniteBancaire;
	}
	public AgenceDTOmin getAgence() {
		return agence;
	}
	public void setAgence(AgenceDTOmin agence) {
		this.agence = agence;
	}
	public String getCodeEnga() {
		return CodeEnga;
	}
	public void setCodeEnga(String codeEnga) {
		CodeEnga = codeEnga;
	}
	public String getCodeGarantie() {
		return CodeGarantie;
	}
	public void setCodeGarantie(String codeGarantie) {
		CodeGarantie = codeGarantie;
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
