package dto;

import com.afrikbrain.banque.corebanking.engagement.placement.entites.Placement;

import java.io.Serializable;
import java.util.Date;

public class PlacementDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date dateEffet;
	private Integer duree;
	private Date dateEcheance;
	private Double montant;
	private Double montantInitial;
	private Double interet;
	private String numeroImprime;
	private String numero;
	private String numeroSouscription;
	private Double montantEnDevPlacem;
	private Double montantDansDeviseCompte;
	private String capitalisationInterets;
	private String prelevementLiberatoire;
	private Date dateExecution;
	private Date dateComptable;
	private Double commission;
	private Double taxe;
	private Double tauxInteret;
	private Double tauxPenalite;
	private Double penalitePrecompte;
	private String nanti;
	private Date dateNantissement;
	private String userNanti;
	private String nantiSystem;
	private String destination;
	private String interetsPrecomptes;
	private String interetsCapitalises;
	private String periodiciteReglementInteret;
	private String interetPeriodique;
	private String taciteReconduction;
	private String modeRenouvellement;
	private String nomBeneficiaire;
	private String prenomBeneficiaire;
	private String origineFonds;
	private String nominatif;
	private String eNaturePlacem;
	private Double provisions;
	private Double interetMensuel;
	
	
	public void toDTO(Placement placement){
		setId(placement.getId());
		setDateEffet(placement.getDateEffet());
		setDuree(placement.getDuree());
		setDateEcheance(placement.getDateEcheance());
		setMontant(placement.getMontant());
		setMontantInitial(placement.getMontantInitial());
		setInteret(placement.getInteret());
		setNumeroImprime(placement.getNumeroImprime());
		setNumero(placement.getNumero());
		setNumeroSouscription(placement.getNumeroSouscription());
		setMontantEnDevPlacem(placement.getMontantEnDevPlacem());
		setMontantDansDeviseCompte(placement.getMontantDansDeviseCompte());
		setCapitalisationInterets(placement.getCapitalisationInterets());
		setPrelevementLiberatoire(placement.getPrelevementLiberatoire().toString());
		setDateExecution(placement.getDateExecution());
		setDateComptable(placement.getDateComptable());
		setCommission(placement.getCommision());
		setTaxe(placement.getTaxe());
		setTauxInteret(placement.getTauxInteret());
		setTauxPenalite(placement.getTauxPenalite());
		setPenalitePrecompte(placement.getPenalitePrecompte());
		setNanti(placement.getNanti().toString());
		setDateNantissement(placement.getDateNantissement());
		setUserNanti(placement.getUserNanti());
		setNantiSystem(placement.getNantiSystem().toString());
		setDestination(placement.getDestination().toString());
		setInteretsPrecomptes(placement.getInteretsPrecomptes().toString());
		setInteretsCapitalises(placement.getInteretsCapitalises().toString());
		setPeriodiciteReglementInteret(placement.getPeriodiciteReglementInteret().toString());
		setInteretPeriodique(placement.getInteretPeriodique().toString());
		setTaciteReconduction(placement.getTaciteReconduction().toString());
		setModeRenouvellement(placement.getModeRenouvellement().toString());
		setNomBeneficiaire(placement.getNomBeneficiaire());
		setPrenomBeneficiaire(placement.getPrenomBeneficiaire());
		setOrigineFonds(placement.getOrigineFonds());
		setNominatif(placement.getNominatif().toString());
		seteNaturePlacem(placement.getENaturePlacem().toString());
		setProvisions(placement.getProvisions());
		setInteretMensuel(placement.getInteretMensuel());
		
	
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateEffet() {
		return dateEffet;
	}
	public void setDateEffet(Date dateEffet) {
		this.dateEffet = dateEffet;
	}
	public Integer getDuree() {
		return duree;
	}
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	public Date getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Double getMontantInitial() {
		return montantInitial;
	}
	public void setMontantInitial(Double montantInitial) {
		this.montantInitial = montantInitial;
	}
	public Double getInteret() {
		return interet;
	}
	public void setInteret(Double interet) {
		this.interet = interet;
	}
	public String getNumeroImprime() {
		return numeroImprime;
	}
	public void setNumeroImprime(String numeroImprime) {
		this.numeroImprime = numeroImprime;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumeroSouscription() {
		return numeroSouscription;
	}
	public void setNumeroSouscription(String numeroSouscription) {
		this.numeroSouscription = numeroSouscription;
	}
	public Double getMontantEnDevPlacem() {
		return montantEnDevPlacem;
	}
	public void setMontantEnDevPlacem(Double montantEnDevPlacem) {
		this.montantEnDevPlacem = montantEnDevPlacem;
	}
	public Double getMontantDansDeviseCompte() {
		return montantDansDeviseCompte;
	}
	public void setMontantDansDeviseCompte(Double montantDansDeviseCompte) {
		this.montantDansDeviseCompte = montantDansDeviseCompte;
	}
	public String getCapitalisationInterets() {
		return capitalisationInterets;
	}
	public void setCapitalisationInterets(String capitalisationInterets) {
		this.capitalisationInterets = capitalisationInterets;
	}
	public String getPrelevementLiberatoire() {
		return prelevementLiberatoire;
	}
	public void setPrelevementLiberatoire(String prelevementLiberatoire) {
		this.prelevementLiberatoire = prelevementLiberatoire;
	}
	public Date getDateExecution() {
		return dateExecution;
	}
	public void setDateExecution(Date dateExecution) {
		this.dateExecution = dateExecution;
	}
	public Date getDateComptable() {
		return dateComptable;
	}
	public void setDateComptable(Date dateComptable) {
		this.dateComptable = dateComptable;
	}
	public Double getCommission() {
		return commission;
	}
	public void setCommission(Double commission) {
		this.commission = commission;
	}
	public Double getTaxe() {
		return taxe;
	}
	public void setTaxe(Double taxe) {
		this.taxe = taxe;
	}
	public Double getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	public Double getTauxPenalite() {
		return tauxPenalite;
	}
	public void setTauxPenalite(Double tauxPenalite) {
		this.tauxPenalite = tauxPenalite;
	}
	public Double getPenalitePrecompte() {
		return penalitePrecompte;
	}
	public void setPenalitePrecompte(Double penalitePrecompte) {
		this.penalitePrecompte = penalitePrecompte;
	}
	public String getNanti() {
		return nanti;
	}
	public void setNanti(String nanti) {
		this.nanti = nanti;
	}
	public Date getDateNantissement() {
		return dateNantissement;
	}
	public void setDateNantissement(Date dateNantissement) {
		this.dateNantissement = dateNantissement;
	}
	public String getUserNanti() {
		return userNanti;
	}
	public void setUserNanti(String userNanti) {
		this.userNanti = userNanti;
	}
	public String getNantiSystem() {
		return nantiSystem;
	}
	public void setNantiSystem(String nantiSystem) {
		this.nantiSystem = nantiSystem;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getInteretsPrecomptes() {
		return interetsPrecomptes;
	}
	public void setInteretsPrecomptes(String interetsPrecomptes) {
		this.interetsPrecomptes = interetsPrecomptes;
	}
	public String getInteretsCapitalises() {
		return interetsCapitalises;
	}
	public void setInteretsCapitalises(String interetsCapitalises) {
		this.interetsCapitalises = interetsCapitalises;
	}
	public String getPeriodiciteReglementInteret() {
		return periodiciteReglementInteret;
	}
	public void setPeriodiciteReglementInteret(String periodiciteReglementInteret) {
		this.periodiciteReglementInteret = periodiciteReglementInteret;
	}
	public String getInteretPeriodique() {
		return interetPeriodique;
	}
	public void setInteretPeriodique(String interetPeriodique) {
		this.interetPeriodique = interetPeriodique;
	}
	public String getTaciteReconduction() {
		return taciteReconduction;
	}
	public void setTaciteReconduction(String taciteReconduction) {
		this.taciteReconduction = taciteReconduction;
	}
	public String getModeRenouvellement() {
		return modeRenouvellement;
	}
	public void setModeRenouvellement(String modeRenouvellement) {
		this.modeRenouvellement = modeRenouvellement;
	}
	public String getNomBeneficiaire() {
		return nomBeneficiaire;
	}
	public void setNomBeneficiaire(String nomBeneficiaire) {
		this.nomBeneficiaire = nomBeneficiaire;
	}
	public String getPrenomBeneficiaire() {
		return prenomBeneficiaire;
	}
	public void setPrenomBeneficiaire(String prenomBeneficiaire) {
		this.prenomBeneficiaire = prenomBeneficiaire;
	}
	public String getOrigineFonds() {
		return origineFonds;
	}
	public void setOrigineFonds(String origineFonds) {
		this.origineFonds = origineFonds;
	}
	public String getNominatif() {
		return nominatif;
	}
	public void setNominatif(String nominatif) {
		this.nominatif = nominatif;
	}
	public String geteNaturePlacem() {
		return eNaturePlacem;
	}
	public void seteNaturePlacem(String eNaturePlacem) {
		this.eNaturePlacem = eNaturePlacem;
	}
	public Double getProvisions() {
		return provisions;
	}
	public void setProvisions(Double provisions) {
		this.provisions = provisions;
	}
	public Double getInteretMensuel() {
		return interetMensuel;
	}
	public void setInteretMensuel(Double interetMensuel) {
		this.interetMensuel = interetMensuel;
	}
	
	
}
