package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.AutorisationDecouvert;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.EPeriodiciteET;

import java.util.Date;

public class AutorisationDecouvertDTO extends EngagementDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agence;
	private TypeDecouvertDTOmin typeDecouvert;
	private CompteDTOmin compte;
	private TypeOperationDTOmin typeOperation;
	private CompteDTOmin compteDecouv;
	private Double montantUtilise;
	private Date dateMiseEnPlace;
	private Date dateDebut;
	private String periodicite;
	private Integer duree;
	private Date dateFin;
	private Date dateLev;
	private Date dateFinApp;
	private Date dateTraitement;
	private Double montantComission;
	private Double tauxInteret;
	private Double montantTaxe;
	private String etat;
	private String renouvellementAuto;
	private String motif;
	private String motifLeveeAnticipee;
	private String classifier;
	private String utiClassif;
	private Date dteClassif;
	
	
	public void toDTO(AutorisationDecouvert autorisationDecouvert){
		setId(autorisationDecouvert.getId());
		setVersion(autorisationDecouvert.getVersion());
		setCode(autorisationDecouvert.getCode());
		setLibelle(autorisationDecouvert.getLibelle());
		setMontant(autorisationDecouvert.getMontant());
	}
	
	public AutorisationDecouvert toEntity() throws Exception{
		AutorisationDecouvert autorisationDecouvert = new AutorisationDecouvert();
		autorisationDecouvert.setId(getId());
		autorisationDecouvert.setVersion(getVersion());
		autorisationDecouvert.setCode(getCode());
		autorisationDecouvert.setLibelle(getLibelle());
		autorisationDecouvert.setMontant(getMontant());
		autorisationDecouvert.setTypeEngagement(getTypeEngagementDTO().toEntity());
		autorisationDecouvert.setDureeEnMois(getDureeEnMois());
		autorisationDecouvert.setUnite(getUnite().toEntity());
		autorisationDecouvert.setAgence(getAgence().toEntity());
		autorisationDecouvert.setTypeDecouvert(getTypeDecouvert().toEntity());
		autorisationDecouvert.setCompte(getCompte().toEntity());
		autorisationDecouvert.setTypeOperation(getTypeOperation().toEntity());
		autorisationDecouvert.setCompteDecouv(getCompteDecouv().toEntity());
		autorisationDecouvert.setMontantUtilise(getMontantUtilise());
		autorisationDecouvert.setDateMiseEnPlace(getDateMiseEnPlace());
		autorisationDecouvert.setDateDebut(getDateDebut());
		autorisationDecouvert.setPeriodicite(EPeriodiciteET.valueOf(getPeriodicite()));
		autorisationDecouvert.setDuree(getDuree());
		autorisationDecouvert.setDateFin(getDateFin());
		autorisationDecouvert.setDateLev(getDateLev());
		autorisationDecouvert.setDateFinApp(getDateFinApp());
		autorisationDecouvert.setDateTraitement(getDateTraitement());
		
		return autorisationDecouvert;
	}
	
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}
	public AgenceDTOmin getAgence() {
		return agence;
	}
	public void setAgence(AgenceDTOmin agence) {
		this.agence = agence;
	}
	public TypeDecouvertDTOmin getTypeDecouvert() {
		return typeDecouvert;
	}
	public void setTypeDecouvert(TypeDecouvertDTOmin typeDecouvert) {
		this.typeDecouvert = typeDecouvert;
	}
	public CompteDTOmin getCompte() {
		return compte;
	}
	public void setCompte(CompteDTOmin compte) {
		this.compte = compte;
	}
	public TypeOperationDTOmin getTypeOperation() {
		return typeOperation;
	}
	public void setTypeOperation(TypeOperationDTOmin typeOperation) {
		this.typeOperation = typeOperation;
	}
	public CompteDTOmin getCompteDecouv() {
		return compteDecouv;
	}
	public void setCompteDecouv(CompteDTOmin compteDecouv) {
		this.compteDecouv = compteDecouv;
	}
	public Double getMontantUtilise() {
		return montantUtilise;
	}
	public void setMontantUtilise(Double montantUtilise) {
		this.montantUtilise = montantUtilise;
	}
	public Date getDateMiseEnPlace() {
		return dateMiseEnPlace;
	}
	public void setDateMiseEnPlace(Date dateMiseEnPlace) {
		this.dateMiseEnPlace = dateMiseEnPlace;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getPeriodicite() {
		return periodicite;
	}
	public void setPeriodicite(String periodicite) {
		this.periodicite = periodicite;
	}
	public Integer getDuree() {
		return duree;
	}
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Date getDateLev() {
		return dateLev;
	}
	public void setDateLev(Date dateLev) {
		this.dateLev = dateLev;
	}
	public Date getDateFinApp() {
		return dateFinApp;
	}
	public void setDateFinApp(Date dateFinApp) {
		this.dateFinApp = dateFinApp;
	}
	public Date getDateTraitement() {
		return dateTraitement;
	}
	public void setDateTraitement(Date dateTraitement) {
		this.dateTraitement = dateTraitement;
	}
	public Double getMontantComission() {
		return montantComission;
	}
	public void setMontantComission(Double montantComission) {
		this.montantComission = montantComission;
	}
	public Double getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	public Double getMontantTaxe() {
		return montantTaxe;
	}
	public void setMontantTaxe(Double montantTaxe) {
		this.montantTaxe = montantTaxe;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getRenouvellementAuto() {
		return renouvellementAuto;
	}
	public void setRenouvellementAuto(String renouvellementAuto) {
		this.renouvellementAuto = renouvellementAuto;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public String getMotifLeveeAnticipee() {
		return motifLeveeAnticipee;
	}
	public void setMotifLeveeAnticipee(String motifLeveeAnticipee) {
		this.motifLeveeAnticipee = motifLeveeAnticipee;
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
