package dto;

import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.DeviseUnite;
import com.afrikbrain.banque.corebanking.engagement.caution.constant.EEtatCaution;
import com.afrikbrain.banque.corebanking.engagement.caution.constant.EPeriodicite;
import com.afrikbrain.banque.corebanking.engagement.caution.entities.Caution;
import com.afrikbrain.util.enumeration.EYesNo;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.Date;

public class CautionDTO extends BaseWebserviceBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String numeroDossier;
	private String numeroImprime;
	private String numeroCaution;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agenceSaisi;
	private TypeCautionDTOmin typeCaution;
	private Long idDeviseCaution;
	private AgenceDTOmin agenceCompteClient;
	private CompteDTOmin compteClient;
	private CompteDTOmin compteEngagement;
	private CompteDTOmin compteGarantie;
	private AgenceDTOmin agenceBeneficiaire;
	private CompteDTOmin compteBeneficiaire;
	private String nomBeneficiaire;
	private String numCpteBenef;
	private String objetCaution;
	private Date dateEmission = new Date();
	private Date dateEffetCalcul;
	private Date dateEcheance;
	private Double montantCaution;
	private Double cumulLevees;
	private Double cumulMiseEnJeu;
	private Integer dureeEnJours;
	private Double valeurCommissionPeriodique;
	private Double tauxRetenueGarantie;
	private Double tauxCommission;
	private Double cumulDepotGarantie;
	private String prelevPeriodiqueGarantie;
	private Double tauxPeriodiqueGarantie;
	private String periodicitePrelevementFrais;
	private Date dateProchainCom;
	private String periodiciteRetenueGarantie;
	private Date dateProchainRetenu;
	private String leveeAutomatique;
	private String suspensionEcheance;
	private String etat;
	private Date dateCptableCre;
	private int dureeEnMois;
	private String classifier;
	private String utiClassif;
	private Date dteClassif;
	
	public Caution toEntity() throws Exception{
		initContext();
		Caution caution = new Caution();
		DeviseUnite deviseUnite = administrationBean.findByPrimaryKey(DeviseUnite.class, getIdDeviseCaution(), null);
		caution.setId(getId());
		caution.setVersion(getVersion());
		caution.setNumeroDossier(getNumeroDossier());
		caution.setNumeroImprime(getNumeroImprime());
		caution.setNumeroCaution(getNumeroCaution());
		caution.setUnite(getUnite().toEntity());
		caution.setAgenceSaisi(getAgenceSaisi().toEntity());
		caution.setTypeCaution(getTypeCaution().toEntity());
		caution.setDeviseCaution(deviseUnite);
		caution.setAgenceCompteClient(getAgenceCompteClient().toEntity());
		caution.setCompteClient(getCompteClient().toEntity());
		caution.setCompteEngagement(getCompteEngagement().toEntity());
		caution.setCompteGarantie(getCompteGarantie().toEntity());
		caution.setAgenceBeneficiaire(getAgenceBeneficiaire().toEntity());
		caution.setCompteBeneficiaire(getCompteBeneficiaire().toEntity());
		caution.setNomBeneficiaire(getNomBeneficiaire());
		caution.setNumCpteBenef(getNumCpteBenef());
		caution.setObjetCaution(getObjetCaution());
		caution.setDateEmission(getDateEmission());
		caution.setDateEffetCalcul(getDateEffetCalcul());
		caution.setDateEcheance(getDateEcheance());
		caution.setMontantCaution(getMontantCaution());
		caution.setCumulLevees(getCumulLevees());
		caution.setCumulMiseEnJeu(getCumulMiseEnJeu());
		caution.setDureeEnJours(getDureeEnJours());
		caution.setValeurCommissionPeriodique(getValeurCommissionPeriodique());
		caution.setTauxRetenueGarantie(getTauxRetenueGarantie());
		caution.setTauxCommission(getTauxCommission());
		caution.setCumulDepotGarantie(getCumulDepotGarantie());
		caution.setPrelevPeriodiqueGarantie(EYesNo.valueOf(getPrelevPeriodiqueGarantie()));
		caution.setTauxPeriodiqueGarantie(getTauxPeriodiqueGarantie());
		caution.setPeriodicitePrelevementFrais(EPeriodicite.valueOf(getPeriodicitePrelevementFrais()));
		caution.setDateProchainCom(getDateProchainCom());
		caution.setPeriodiciteRetenueGarantie(EPeriodicite.valueOf(getPeriodiciteRetenueGarantie()));
		caution.setDateProchainRetenu(getDateProchainRetenu());
		caution.setLeveeAutomatique(EYesNo.valueOf(getLeveeAutomatique()));
		caution.setSuspensionEcheance(EYesNo.valueOf(getSuspensionEcheance()));
		caution.setEtat(EEtatCaution.valueOf(getEtat()));
		caution.setDateCptableCre(getDateCptableCre());
		caution.setDureeEnMois(getDureeEnMois());
		caution.setClassifier(EYesNo.valueOf(getClassifier()));
		caution.setUtiClassif(getUtiClassif());
		caution.setDteClassif(getDteClassif());	
		
		return caution;
	}
	
	public void toDTO(Caution caution){
		setId(caution.getId());
		setVersion(caution.getVersion());
		setNumeroDossier(caution.getNumeroDossier());
		setNumeroImprime(caution.getNumeroImprime());
		setNumeroCaution(caution.getNumeroCaution());
		setNomBeneficiaire(caution.getNomBeneficiaire());
		setNumCpteBenef(caution.getNumCpteBenef());
		setObjetCaution(caution.getObjetCaution());
		setDateEmission(caution.getDateEmission());
		setDateEffetCalcul(caution.getDateEffetCalcul());
		setDateEcheance(caution.getDateEcheance());
		setMontantCaution(caution.getMontantCaution());
		setCumulLevees(caution.getCumulLevees());
		setCumulMiseEnJeu(caution.getCumulMiseEnJeu());
		setDureeEnJours(caution.getDureeEnJours());
		setValeurCommissionPeriodique(caution.getValeurCommissionPeriodique());
		setTauxRetenueGarantie(caution.getTauxRetenueGarantie());
		setTauxCommission(caution.getTauxCommission());
		setCumulDepotGarantie(caution.getCumulDepotGarantie());
		setPrelevPeriodiqueGarantie(caution.getPrelevPeriodiqueGarantie().toString());
		setTauxPeriodiqueGarantie(caution.getTauxPeriodiqueGarantie());
		setPeriodicitePrelevementFrais(caution.getPeriodicitePrelevementFrais().toString());
		setDateProchainCom(caution.getDateProchainCom());
		setPeriodiciteRetenueGarantie(caution.getPeriodiciteRetenueGarantie().toString());
		setDateProchainRetenu(caution.getDateProchainRetenu());
		setLeveeAutomatique(caution.getLeveeAutomatique().toString());
		setSuspensionEcheance(caution.getSuspensionEcheance().toString());
		setEtat(caution.getEtat().toString());
		setDateCptableCre(caution.getDateCptableCre());
		setDureeEnMois(caution.getDureeEnMois());
		setClassifier(caution.getClassifier().toString());
		setUtiClassif(caution.getUtiClassif());
		setDteClassif(caution.getDteClassif());	
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getNumeroDossier() {
		return numeroDossier;
	}
	public void setNumeroDossier(String numeroDossier) {
		this.numeroDossier = numeroDossier;
	}
	public String getNumeroImprime() {
		return numeroImprime;
	}
	public void setNumeroImprime(String numeroImprime) {
		this.numeroImprime = numeroImprime;
	}
	public String getNumeroCaution() {
		return numeroCaution;
	}
	public void setNumeroCaution(String numeroCaution) {
		this.numeroCaution = numeroCaution;
	}
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}
	public AgenceDTOmin getAgenceSaisi() {
		return agenceSaisi;
	}
	public void setAgenceSaisi(AgenceDTOmin agenceSaisi) {
		this.agenceSaisi = agenceSaisi;
	}
	public TypeCautionDTOmin getTypeCaution() {
		return typeCaution;
	}
	public void setTypeCaution(TypeCautionDTOmin typeCaution) {
		this.typeCaution = typeCaution;
	}
	
	public Long getIdDeviseCaution() {
		return idDeviseCaution;
	}

	public void setIdDeviseCaution(Long idDeviseCaution) {
		this.idDeviseCaution = idDeviseCaution;
	}

	public AgenceDTOmin getAgenceCompteClient() {
		return agenceCompteClient;
	}
	public void setAgenceCompteClient(AgenceDTOmin agenceCompteClient) {
		this.agenceCompteClient = agenceCompteClient;
	}
	public CompteDTOmin getCompteClient() {
		return compteClient;
	}
	public void setCompteClient(CompteDTOmin compteClient) {
		this.compteClient = compteClient;
	}
	public CompteDTOmin getCompteEngagement() {
		return compteEngagement;
	}
	public void setCompteEngagement(CompteDTOmin compteEngagement) {
		this.compteEngagement = compteEngagement;
	}
	public CompteDTOmin getCompteGarantie() {
		return compteGarantie;
	}
	public void setCompteGarantie(CompteDTOmin compteGarantie) {
		this.compteGarantie = compteGarantie;
	}
	public AgenceDTOmin getAgenceBeneficiaire() {
		return agenceBeneficiaire;
	}
	public void setAgenceBeneficiaire(AgenceDTOmin agenceBeneficiaire) {
		this.agenceBeneficiaire = agenceBeneficiaire;
	}
	public CompteDTOmin getCompteBeneficiaire() {
		return compteBeneficiaire;
	}
	public void setCompteBeneficiaire(CompteDTOmin compteBeneficiaire) {
		this.compteBeneficiaire = compteBeneficiaire;
	}
	public String getNomBeneficiaire() {
		return nomBeneficiaire;
	}
	public void setNomBeneficiaire(String nomBeneficiaire) {
		this.nomBeneficiaire = nomBeneficiaire;
	}
	public String getNumCpteBenef() {
		return numCpteBenef;
	}
	public void setNumCpteBenef(String numCpteBenef) {
		this.numCpteBenef = numCpteBenef;
	}
	public String getObjetCaution() {
		return objetCaution;
	}
	public void setObjetCaution(String objetCaution) {
		this.objetCaution = objetCaution;
	}
	public Date getDateEmission() {
		return dateEmission;
	}
	public void setDateEmission(Date dateEmission) {
		this.dateEmission = dateEmission;
	}
	public Date getDateEffetCalcul() {
		return dateEffetCalcul;
	}
	public void setDateEffetCalcul(Date dateEffetCalcul) {
		this.dateEffetCalcul = dateEffetCalcul;
	}
	public Date getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	public Double getMontantCaution() {
		return montantCaution;
	}
	public void setMontantCaution(Double montantCaution) {
		this.montantCaution = montantCaution;
	}
	public Double getCumulLevees() {
		return cumulLevees;
	}
	public void setCumulLevees(Double cumulLevees) {
		this.cumulLevees = cumulLevees;
	}
	public Double getCumulMiseEnJeu() {
		return cumulMiseEnJeu;
	}
	public void setCumulMiseEnJeu(Double cumulMiseEnJeu) {
		this.cumulMiseEnJeu = cumulMiseEnJeu;
	}
	public Integer getDureeEnJours() {
		return dureeEnJours;
	}
	public void setDureeEnJours(Integer dureeEnJours) {
		this.dureeEnJours = dureeEnJours;
	}
	public Double getValeurCommissionPeriodique() {
		return valeurCommissionPeriodique;
	}
	public void setValeurCommissionPeriodique(Double valeurCommissionPeriodique) {
		this.valeurCommissionPeriodique = valeurCommissionPeriodique;
	}
	public Double getTauxRetenueGarantie() {
		return tauxRetenueGarantie;
	}
	public void setTauxRetenueGarantie(Double tauxRetenueGarantie) {
		this.tauxRetenueGarantie = tauxRetenueGarantie;
	}
	public Double getTauxCommission() {
		return tauxCommission;
	}
	public void setTauxCommission(Double tauxCommission) {
		this.tauxCommission = tauxCommission;
	}
	public Double getCumulDepotGarantie() {
		return cumulDepotGarantie;
	}
	public void setCumulDepotGarantie(Double cumulDepotGarantie) {
		this.cumulDepotGarantie = cumulDepotGarantie;
	}
	public String getPrelevPeriodiqueGarantie() {
		return prelevPeriodiqueGarantie;
	}
	public void setPrelevPeriodiqueGarantie(String prelevPeriodiqueGarantie) {
		this.prelevPeriodiqueGarantie = prelevPeriodiqueGarantie;
	}
	public Double getTauxPeriodiqueGarantie() {
		return tauxPeriodiqueGarantie;
	}
	public void setTauxPeriodiqueGarantie(Double tauxPeriodiqueGarantie) {
		this.tauxPeriodiqueGarantie = tauxPeriodiqueGarantie;
	}
	public String getPeriodicitePrelevementFrais() {
		return periodicitePrelevementFrais;
	}
	public void setPeriodicitePrelevementFrais(String periodicitePrelevementFrais) {
		this.periodicitePrelevementFrais = periodicitePrelevementFrais;
	}
	public Date getDateProchainCom() {
		return dateProchainCom;
	}
	public void setDateProchainCom(Date dateProchainCom) {
		this.dateProchainCom = dateProchainCom;
	}
	public String getPeriodiciteRetenueGarantie() {
		return periodiciteRetenueGarantie;
	}
	public void setPeriodiciteRetenueGarantie(String periodiciteRetenueGarantie) {
		this.periodiciteRetenueGarantie = periodiciteRetenueGarantie;
	}
	public Date getDateProchainRetenu() {
		return dateProchainRetenu;
	}
	public void setDateProchainRetenu(Date dateProchainRetenu) {
		this.dateProchainRetenu = dateProchainRetenu;
	}
	public String getLeveeAutomatique() {
		return leveeAutomatique;
	}
	public void setLeveeAutomatique(String leveeAutomatique) {
		this.leveeAutomatique = leveeAutomatique;
	}
	public String getSuspensionEcheance() {
		return suspensionEcheance;
	}
	public void setSuspensionEcheance(String suspensionEcheance) {
		this.suspensionEcheance = suspensionEcheance;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDateCptableCre() {
		return dateCptableCre;
	}
	public void setDateCptableCre(Date dateCptableCre) {
		this.dateCptableCre = dateCptableCre;
	}
	public int getDureeEnMois() {
		return dureeEnMois;
	}
	public void setDureeEnMois(int dureeEnMois) {
		this.dureeEnMois = dureeEnMois;
	}
	public String getClassifier() {
		return classifier;
	}
	public void setClassifier(String classifier) {
		this.classifier = classifier;
	}
	public String getUtiClassif() {
		return utiClassif;
	}
	public void setUtiClassif(String utiClassif) {
		this.utiClassif = utiClassif;
	}
	public Date getDteClassif() {
		return dteClassif;
	}
	public void setDteClassif(Date dteClassif) {
		this.dteClassif = dteClassif;
	}
	
	

}
