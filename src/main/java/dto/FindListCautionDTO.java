package dto;

import java.io.Serializable;
import java.util.Date;

public class FindListCautionDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codeUnite;
	private String codeAgence; 
	private String numeroDossier;
	private String numeroCaution;
	private Date dateEmission; 
	private Double montantCaution; 
	private int firstResult;
	private int maxResult;
	public String getCodeUnite() {
		return codeUnite;
	}
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}
	public String getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}
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
	public Date getDateEmission() {
		return dateEmission;
	}
	public void setDateEmission(Date dateEmission) {
		this.dateEmission = dateEmission;
	}
	public Double getMontantCaution() {
		return montantCaution;
	}
	public void setMontantCaution(Double montantCaution) {
		this.montantCaution = montantCaution;
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
