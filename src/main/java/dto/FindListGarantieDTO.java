package dto;

import java.io.Serializable;

public class FindListGarantieDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UniteBancaireDTOmin uniteBancaire;
	private AgenceDTOmin agence;
	private SousTypeGarantieDTOmin sousType;
	private Double montant;
	private String code; 
	private String codeGarant;
	private String nomGarant;
	private String codeClient;
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
	public SousTypeGarantieDTOmin getSousType() {
		return sousType;
	}
	public void setSousType(SousTypeGarantieDTOmin sousType) {
		this.sousType = sousType;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeGarant() {
		return codeGarant;
	}
	public void setCodeGarant(String codeGarant) {
		this.codeGarant = codeGarant;
	}
	public String getNomGarant() {
		return nomGarant;
	}
	public void setNomGarant(String nomGarant) {
		this.nomGarant = nomGarant;
	}
	public String getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
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
