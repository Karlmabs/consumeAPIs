package dto;

import java.io.Serializable;

public class FindListLienGaraCautionDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UniteBancaireDTOmin uniteBancaire;
	private AgenceDTOmin agence;
	private String NumCaution;
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
	public String getNumCaution() {
		return NumCaution;
	}
	public void setNumCaution(String numCaution) {
		NumCaution = numCaution;
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
