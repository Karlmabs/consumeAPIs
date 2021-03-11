package dto;

import java.io.Serializable;

public class FilterCautionDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numeroDossier; 
	private String numeroCaution;
	private String codeAgenceSaisi;
	private String numeroCompteClient; 
	private String cleCompteClient; 
	private String libelleCompteClient; 
	private String codeTypeCaution;
	private String codeUniteBancaire; 
	private String etat; 
	private int beginIndex;
	private int lineNumbers;
	public String getNumeroDossier() {
		return numeroDossier;
	}
	public void setNumeroDossier(String numeroDossier) {
		this.numeroDossier = numeroDossier;
	}
	public String getNumeroCaution() {
		return numeroCaution;
	}
	public void setNumeroCaution(String numeroCaution) {
		this.numeroCaution = numeroCaution;
	}
	public String getCodeAgenceSaisi() {
		return codeAgenceSaisi;
	}
	public void setCodeAgenceSaisi(String codeAgenceSaisi) {
		this.codeAgenceSaisi = codeAgenceSaisi;
	}
	public String getNumeroCompteClient() {
		return numeroCompteClient;
	}
	public void setNumeroCompteClient(String numeroCompteClient) {
		this.numeroCompteClient = numeroCompteClient;
	}
	public String getCleCompteClient() {
		return cleCompteClient;
	}
	public void setCleCompteClient(String cleCompteClient) {
		this.cleCompteClient = cleCompteClient;
	}
	public String getLibelleCompteClient() {
		return libelleCompteClient;
	}
	public void setLibelleCompteClient(String libelleCompteClient) {
		this.libelleCompteClient = libelleCompteClient;
	}
	public String getCodeTypeCaution() {
		return codeTypeCaution;
	}
	public void setCodeTypeCaution(String codeTypeCaution) {
		this.codeTypeCaution = codeTypeCaution;
	}
	public String getCodeUniteBancaire() {
		return codeUniteBancaire;
	}
	public void setCodeUniteBancaire(String codeUniteBancaire) {
		this.codeUniteBancaire = codeUniteBancaire;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public int getBeginIndex() {
		return beginIndex;
	}
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	public int getLineNumbers() {
		return lineNumbers;
	}
	public void setLineNumbers(int lineNumbers) {
		this.lineNumbers = lineNumbers;
	}
	
}
