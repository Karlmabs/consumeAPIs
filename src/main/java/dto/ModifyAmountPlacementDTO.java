package dto;

import java.io.Serializable;
import java.util.List;

public class ModifyAmountPlacementDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idPlacement;
	private String codeEvenement;
	private Double montant;
	private List<Long> commissions;
	private String logingUser;
	public Long getIdPlacement() {
		return idPlacement;
	}
	public void setIdPlacement(Long idPlacement) {
		this.idPlacement = idPlacement;
	}
	
	public String getCodeEvenement() {
		return codeEvenement;
	}
	public void setCodeEvenement(String codeEvenement) {
		this.codeEvenement = codeEvenement;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public List<Long> getCommissions() {
		return commissions;
	}
	public void setCommissions(List<Long> commissions) {
		this.commissions = commissions;
	}
	public String getLogingUser() {
		return logingUser;
	}
	public void setLogingUser(String logingUser) {
		this.logingUser = logingUser;
	}
	

}
