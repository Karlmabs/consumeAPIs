package dto;

import java.io.Serializable;

public class FindListTiersDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomTiers;
	private String prenomTiers;
	private String lieuNaissance;
	private String dateNaissance; 
	private String typeTiers;
	private String codeTiers; 
	private String adresse;
	private String telephone;
	private Character etabFinancier; 
	private NationaliteDTOmin nationalite;
	private String numpieceIdentite; 
	private String numRegistreCommerce;
	private UniteBancaireDTOmin uniteBancaire; 
	private AgenceDTOmin agence;
	private PaysDTOmin paysResidence;
	private ProfessionDTOmin professTiers; 
	private SecteurActiviteDTOmin activiteTiers;
	private Character suspendu;
	private int firstResult;
	private int maxResult;
	public String getNomTiers() {
		return nomTiers;
	}
	public void setNomTiers(String nomTiers) {
		this.nomTiers = nomTiers;
	}
	public String getPrenomTiers() {
		return prenomTiers;
	}
	public void setPrenomTiers(String prenomTiers) {
		this.prenomTiers = prenomTiers;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getTypeTiers() {
		return typeTiers;
	}
	public void setTypeTiers(String typeTiers) {
		this.typeTiers = typeTiers;
	}
	public String getCodeTiers() {
		return codeTiers;
	}
	public void setCodeTiers(String codeTiers) {
		this.codeTiers = codeTiers;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Character getEtabFinancier() {
		return etabFinancier;
	}
	public void setEtabFinancier(Character etabFinancier) {
		this.etabFinancier = etabFinancier;
	}
	public NationaliteDTOmin getNationalite() {
		return nationalite;
	}
	public void setNationalite(NationaliteDTOmin nationalite) {
		this.nationalite = nationalite;
	}
	public String getNumpieceIdentite() {
		return numpieceIdentite;
	}
	public void setNumpieceIdentite(String numpieceIdentite) {
		this.numpieceIdentite = numpieceIdentite;
	}
	public String getNumRegistreCommerce() {
		return numRegistreCommerce;
	}
	public void setNumRegistreCommerce(String numRegistreCommerce) {
		this.numRegistreCommerce = numRegistreCommerce;
	}
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
	public PaysDTOmin getPaysResidence() {
		return paysResidence;
	}
	public void setPaysResidence(PaysDTOmin paysResidence) {
		this.paysResidence = paysResidence;
	}
	public ProfessionDTOmin getProfessTiers() {
		return professTiers;
	}
	public void setProfessTiers(ProfessionDTOmin professTiers) {
		this.professTiers = professTiers;
	}
	public SecteurActiviteDTOmin getActiviteTiers() {
		return activiteTiers;
	}
	public void setActiviteTiers(SecteurActiviteDTOmin activiteTiers) {
		this.activiteTiers = activiteTiers;
	}
	public Character getSuspendu() {
		return suspendu;
	}
	public void setSuspendu(Character suspendu) {
		this.suspendu = suspendu;
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
