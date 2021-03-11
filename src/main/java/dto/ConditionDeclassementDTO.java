package dto;

import com.afrikbrain.banque.corebanking.engagement.credit.declassement.entities.ConditionDeclassement;

import java.io.Serializable;

public class ConditionDeclassementDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String codeUnite;
	private String etatCreanceAvant;
	private String etatCreanceApres;
	private String nature;
	private Double tauxProvisionEngagement;
	private Double tauxProvisionEngagementNonCouvert;
	
	public void toDTO(ConditionDeclassement conditionDeclassement){
		setId(conditionDeclassement.getId());
		setCodeUnite(conditionDeclassement.getUnite().getCode());
		setEtatCreanceAvant(conditionDeclassement.getEtatCreanceAvant().toString());
		setEtatCreanceApres(conditionDeclassement.getEtatCreanceApres().toString());
		setNature(conditionDeclassement.getNature().toString());
		setTauxProvisionEngagement(conditionDeclassement.getTauxProvisionEngagement());
		setTauxProvisionEngagementNonCouvert(conditionDeclassement.getTauxProvisionEngagementNonCouvert());
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCodeUnite() {
		return codeUnite;
	}

	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}

	public String getEtatCreanceAvant() {
		return etatCreanceAvant;
	}
	public void setEtatCreanceAvant(String etatCreanceAvant) {
		this.etatCreanceAvant = etatCreanceAvant;
	}
	public String getEtatCreanceApres() {
		return etatCreanceApres;
	}
	public void setEtatCreanceApres(String etatCreanceApres) {
		this.etatCreanceApres = etatCreanceApres;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public Double getTauxProvisionEngagement() {
		return tauxProvisionEngagement;
	}
	public void setTauxProvisionEngagement(Double tauxProvisionEngagement) {
		this.tauxProvisionEngagement = tauxProvisionEngagement;
	}
	public Double getTauxProvisionEngagementNonCouvert() {
		return tauxProvisionEngagementNonCouvert;
	}
	public void setTauxProvisionEngagementNonCouvert(Double tauxProvisionEngagementNonCouvert) {
		this.tauxProvisionEngagementNonCouvert = tauxProvisionEngagementNonCouvert;
	}



}
