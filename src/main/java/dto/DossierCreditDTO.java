package dto;

import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.DeviseUnite;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.ETypeEngagement;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.DossierCredit;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Echeance;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.FraisDivers;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.TauxCreditVariable;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.*;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DossierCreditDTO extends EngagementDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String possedeGarantie;
	private String numeroDossier;
	private String numeroConvention;
	private Double montantPret;
	private Double oldMontantPret;
	private String isMontantModifDecisionBanque;
	private String isMontantModifDecisionClient;
	private Double montantDebloque;
	private Integer nombreEcheance;
	private Date dateMiseEnPlace;
	private Date datePremEcheance;
	private Date dateDernEcheance;
	private Double tauxInteret;
	private Double tauxPR;
	private Double tauxTaxe;
	private String typeTaux;
	private Double tauxRefIndex;
	private Double margeTauxRefIndex;
	private String optionRecalcul;
	private String periodicite;
	private Double montantCommission;
	private Double montantTaxe;
	private Double teg;
	private String deblocageSurFacture;
	private String motifAbandon;
	private String motif;
	private String etat;
	private String etatAvant;
	private String commPreleve;
	private String echFinMois;
	private String graceDiff;
	private String modeGestDiff;
	private String periodiciteDiff;
	private Double tauxDiff;
	private String typePlan;
	private String isImpaye;
	private String isAttImpaye;
	private String elementLiberte;
	private Integer numeroEchComDebRepart;
	private Integer numeroEchComFinRepart;
	private Integer nombreDiff;
	private Double montantDiff;
	private Double taxeDiff;
	private Double oldMontantDiff;
	private Double oldTaxeDiff;
	private Integer numeroEchDebRep;
	private Integer numeroEchFinRep;
	private String numDosParent;
	private String numDosRacine;
	private Double montantHerite;
	private String estPretCons;
	private String estAvenant;
	private String estAvenantDemandeClient;
	private Integer compteur;
	private Character optionAvenant;
	private String comptaAttente;
	private String eveEnCours;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agence;
	private ClientDTOmin client;
	private Long iddevise;
	private ObjetFinancementDTOmin objetFinancement;
	private CompteDTOmin compteClient;
	private CompteDTOmin compteRemboursement;
	private CompteDTOmin compteEngagement;
	private CompteDTOmin comptePreAutorise;
	private CompteDTOmin compteEngagementAutorise;
	private CompteDTOmin compteEngagementDisponible;
	private CompteDTOmin compteProvisionInteret;
	private CompteDTOmin compteAttenteImpaye;
	private CompteDTOmin compteImpaye;
	private CompteDTOmin compteInteretImpaye;
	private CompteDTOmin compteProvisionInteretImpaye;
	private CompteDTOmin compteCoutMarginal;
	private SourceFinancementDTOmin sourceFinancement;
	private TypeCreditDTOmin typeCredit;
	private TiersDTOmin tiersPayeur;
	private TiersDTOmin tiersBeneficiaire;
	private ApporteurAffaireDTOmin apporteurAffaire;
	private SecteurActiviteDTOmin secteurActivite;
	private TypeOperationDTOmin typeOperation;
	private List<FraisDiversDTO> fraisDivers = new ArrayList<FraisDiversDTO>();
//	private List<ParticipationBanquePret> participant = new ArrayList<ParticipationBanquePret>();
	private List<TauxCreditVariableDTO> lstTauxVar = new ArrayList<TauxCreditVariableDTO>();
	private List<EcheanceDTO> echeances = new ArrayList<EcheanceDTO>();
	private TauxDTO tauxref;
	private String classifier;
	private String utiClassif;
	private Date dteClassif;
	private String creditRevolving;
	private ClientDTOmin avaliste;
	
	public void toDTO(DossierCredit dossierCredit){
		setId(dossierCredit.getId());
		setCode(dossierCredit.getCode());
	}

	public DossierCredit toEntity() throws Exception {
		initContext();
		DossierCredit dossierCredit = new DossierCredit();
		dossierCredit.setId(getId());
		dossierCredit.setVersion(getVersion());
		dossierCredit.setCode(getCode());
		dossierCredit.setLibelle(getLibelle());
		dossierCredit.setMontant(getMontant());
		dossierCredit.setTypeEng(ETypeEngagement.valueOf(getTypeEng()));
		dossierCredit.setTypeEngagement(getTypeEngagementDTO().toEntity());
		dossierCredit.setDureeEnMois(getDureeEnMois());
		dossierCredit.setPossedeGarantie(EYesNo.valueOf(getPossedeGarantie()));
		dossierCredit.setNumeroDossier(getNumeroDossier());
		dossierCredit.setNumeroConvention(getNumeroConvention());
		dossierCredit.setMontantPret(getMontantPret());
		dossierCredit.setOldMontantPret(getOldMontantPret());
		dossierCredit.setIsMontantModifDecisionBanque(EYesNo.valueOf(getIsMontantModifDecisionBanque()));
		dossierCredit.setIsMontantModifDecisionClient(EYesNo.valueOf(getIsMontantModifDecisionClient()));
		dossierCredit.setMontantDebloque(getMontantDebloque());
		dossierCredit.setNombreEcheance(getNombreEcheance());
		dossierCredit.setDateMiseEnPlace(getDateMiseEnPlace());
		dossierCredit.setDatePremEcheance(getDatePremEcheance());
		dossierCredit.setDateDernEcheance(getDateDernEcheance());
		dossierCredit.setTauxInteret(getTauxInteret());
		dossierCredit.setTauxPR(getTauxPR());
		dossierCredit.setTauxTaxe(getTauxTaxe());
		dossierCredit.setTypeTaux(ETypeTaux.valueOf(getTypeTaux()));
		dossierCredit.setTauxRefIndex(getTauxRefIndex());
		dossierCredit.setMargeTauxRefIndex(getMargeTauxRefIndex());
		dossierCredit.setOptionRecalcul(EOptionRecalcul.valueOf(getOptionRecalcul()));
		dossierCredit.setPeriodicite(EPeriodiciteET.valueOf(getPeriodicite()));
		dossierCredit.setMontantCommission(getMontantCommission());
		dossierCredit.setMontantTaxe(getMontantTaxe());
		dossierCredit.setTeg(getTeg());
		dossierCredit.setDeblocageSurFacture(EYesNo.valueOf(getDeblocageSurFacture()));
		dossierCredit.setMotifAbandon(getMotifAbandon());
		dossierCredit.setMotif(getMotif());
		dossierCredit.setEtat(EEtatDossierCred.valueOf(getEtat()));
		dossierCredit.setEtatAvant(EEtatDossierCred.valueOf(getEtatAvant()));
		dossierCredit.setCommPreleve(EYesNo.valueOf(getCommPreleve()));
		dossierCredit.setEchFinMois(EYesNo.valueOf(getEchFinMois()));
		dossierCredit.setGraceDiff(EYesNo.valueOf(getGraceDiff()));
		dossierCredit.setModeGestDiff(EModeGestDiff.valueOf(getModeGestDiff()));
		dossierCredit.setPeriodiciteDiff(EPeriodiciteET.valueOf(getPeriodiciteDiff()));
		dossierCredit.setTauxDiff(getTauxDiff());
		dossierCredit.setTypePlan(ETypePlan.valueOf(getTypePlan()));
		dossierCredit.setIsImpaye(EYesNo.valueOf(getIsImpaye()));
		dossierCredit.setIsAttImpaye(EYesNo.valueOf(getIsAttImpaye()));
		dossierCredit.setElementLiberte(EModePlanLibre.valueOf(getElementLiberte()));
		dossierCredit.setNumeroEchComDebRepart(getNumeroEchComDebRepart());
		dossierCredit.setNumeroEchComFinRepart(getNumeroEchComFinRepart());
		dossierCredit.setNombreDiff(getNombreDiff());
		dossierCredit.setMontantDiff(getMontantDiff());
		dossierCredit.setTauxDiff(getTauxDiff());
		dossierCredit.setOldMontantDiff(getOldMontantDiff());
		dossierCredit.setOldTaxeDiff(getOldTaxeDiff());
		dossierCredit.setNumeroEchDebRep(getNumeroEchDebRep());
		dossierCredit.setNumeroEchFinRep(getNumeroEchFinRep());
		dossierCredit.setNumDosParent(getNumDosParent());
		dossierCredit.setNumDosRacine(getNumDosRacine());
		dossierCredit.setMontantHerite(getMontantHerite());
		dossierCredit.setEstPretCons(EYesNo.valueOf(getEstPretCons()));
		dossierCredit.setEstAvenant(EYesNo.valueOf(getEstAvenant()));
		dossierCredit.setEstAvenantDemandeClient(EYesNo.valueOf(getEstAvenantDemandeClient()));
		dossierCredit.setCompteur(getCompteur());
		dossierCredit.setOptionAvenant(getOptionAvenant());
		dossierCredit.setComptaAttente(EYesNo.valueOf(getComptaAttente()));
		dossierCredit.setEveEnCours(EYesNo.valueOf(getEveEnCours()));
		dossierCredit.setUnite(getUnite().toEntity());
		dossierCredit.setAgence(getAgence().toEntity());
		dossierCredit.setClient(getClient().toEntity());
		DeviseUnite deviseUnite = administrationBean.findByPrimaryKey(DeviseUnite.class, getIddevise(), null);
		dossierCredit.setDevise(deviseUnite);
		dossierCredit.setObjetFinancement(getObjetFinancement().toEntity());
		dossierCredit.setCompteClient(getCompteClient().toEntity());
		dossierCredit.setCompteRemboursement(getCompteRemboursement().toEntity());
		dossierCredit.setCompteEngagement(getCompteEngagement().toEntity());
		dossierCredit.setComptePreAutorise(getComptePreAutorise().toEntity());
		dossierCredit.setCompteEngagementAutorise(getCompteEngagementAutorise().toEntity());
		dossierCredit.setCompteEngagementDisponible(getCompteEngagementDisponible().toEntity());
		dossierCredit.setCompteProvisionInteret(getCompteProvisionInteret().toEntity());
		dossierCredit.setCompteAttenteImpaye(getCompteAttenteImpaye().toEntity());
		dossierCredit.setCompteImpaye(getCompteImpaye().toEntity());
		dossierCredit.setCompteInteretImpaye(getCompteInteretImpaye().toEntity());
		dossierCredit.setCompteProvisionInteretImpaye(getCompteProvisionInteretImpaye().toEntity());
		dossierCredit.setCompteCoutMarginal(getCompteCoutMarginal().toEntity());
		dossierCredit.setSourceFinancement(getSourceFinancement().toEntity());
		dossierCredit.setTypeCredit(getTypeCredit().toEntity());
		dossierCredit.setTiersPayeur(getTiersPayeur().toEntity());
		dossierCredit.setTiersBeneficiaire(getTiersBeneficiaire().toEntity());
		dossierCredit.setApporteurAffaire(getApporteurAffaire().toEntity());
		dossierCredit.setSecteurActivite(getSecteurActivite().toEntity());
		dossierCredit.setTypeOperation(getTypeOperation().toEntity());
		List<FraisDivers> fraisDiverList = new ArrayList<FraisDivers>();
		for(FraisDiversDTO temp : getFraisDivers()){
			fraisDiverList.add(temp.toEntity());
		}
		
		List<TauxCreditVariable> lstTauxVarList = new ArrayList<TauxCreditVariable>();
		for(TauxCreditVariableDTO temp : getLstTauxVar()){
			lstTauxVarList.add(temp.toEntity());
		}
		
		List<Echeance> echeanceList = new ArrayList<Echeance>();
		for(EcheanceDTO temp : getEcheances()){
			echeanceList.add(temp.toEntity());
		}
		dossierCredit.setFraisDivers(fraisDiverList);
		dossierCredit.setLstTauxVar(lstTauxVarList);
		dossierCredit.setEcheances(echeanceList);
		dossierCredit.setTauxref(getTauxref().toEntity());
		dossierCredit.setClassifier(EYesNo.valueOf(getClassifier()));
		dossierCredit.setUtiClassif(getUtiClassif());
		dossierCredit.setDteClassif(getDteClassif());
		dossierCredit.setCreditRevolving(EYesNo.valueOf(getCreditRevolving()));
		dossierCredit.setAvaliste(getAvaliste().toEntity());
		
		return dossierCredit;
	}
	
	
	
	public String getPossedeGarantie() {
		return possedeGarantie;
	}

	public void setPossedeGarantie(String possedeGarantie) {
		this.possedeGarantie = possedeGarantie;
	}

	public String getNumeroDossier() {
		return numeroDossier;
	}

	public void setNumeroDossier(String numeroDossier) {
		this.numeroDossier = numeroDossier;
	}

	public String getNumeroConvention() {
		return numeroConvention;
	}

	public void setNumeroConvention(String numeroConvention) {
		this.numeroConvention = numeroConvention;
	}

	public Double getMontantPret() {
		return montantPret;
	}

	public void setMontantPret(Double montantPret) {
		this.montantPret = montantPret;
	}

	public Double getOldMontantPret() {
		return oldMontantPret;
	}

	public void setOldMontantPret(Double oldMontantPret) {
		this.oldMontantPret = oldMontantPret;
	}

	public String getIsMontantModifDecisionBanque() {
		return isMontantModifDecisionBanque;
	}

	public void setIsMontantModifDecisionBanque(String isMontantModifDecisionBanque) {
		this.isMontantModifDecisionBanque = isMontantModifDecisionBanque;
	}

	public String getIsMontantModifDecisionClient() {
		return isMontantModifDecisionClient;
	}

	public void setIsMontantModifDecisionClient(String isMontantModifDecisionClient) {
		this.isMontantModifDecisionClient = isMontantModifDecisionClient;
	}

	public Double getMontantDebloque() {
		return montantDebloque;
	}

	public void setMontantDebloque(Double montantDebloque) {
		this.montantDebloque = montantDebloque;
	}

	public Integer getNombreEcheance() {
		return nombreEcheance;
	}

	public void setNombreEcheance(Integer nombreEcheance) {
		this.nombreEcheance = nombreEcheance;
	}

	public Date getDateMiseEnPlace() {
		return dateMiseEnPlace;
	}

	public void setDateMiseEnPlace(Date dateMiseEnPlace) {
		this.dateMiseEnPlace = dateMiseEnPlace;
	}

	public Date getDatePremEcheance() {
		return datePremEcheance;
	}

	public void setDatePremEcheance(Date datePremEcheance) {
		this.datePremEcheance = datePremEcheance;
	}

	public Date getDateDernEcheance() {
		return dateDernEcheance;
	}

	public void setDateDernEcheance(Date dateDernEcheance) {
		this.dateDernEcheance = dateDernEcheance;
	}

	public Double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	public Double getTauxPR() {
		return tauxPR;
	}

	public void setTauxPR(Double tauxPR) {
		this.tauxPR = tauxPR;
	}

	public Double getTauxTaxe() {
		return tauxTaxe;
	}

	public void setTauxTaxe(Double tauxTaxe) {
		this.tauxTaxe = tauxTaxe;
	}

	public String getTypeTaux() {
		return typeTaux;
	}

	public void setTypeTaux(String typeTaux) {
		this.typeTaux = typeTaux;
	}

	public Double getTauxRefIndex() {
		return tauxRefIndex;
	}

	public void setTauxRefIndex(Double tauxRefIndex) {
		this.tauxRefIndex = tauxRefIndex;
	}

	public Double getMargeTauxRefIndex() {
		return margeTauxRefIndex;
	}

	public void setMargeTauxRefIndex(Double margeTauxRefIndex) {
		this.margeTauxRefIndex = margeTauxRefIndex;
	}

	public String getOptionRecalcul() {
		return optionRecalcul;
	}

	public void setOptionRecalcul(String optionRecalcul) {
		this.optionRecalcul = optionRecalcul;
	}

	public String getPeriodicite() {
		return periodicite;
	}

	public void setPeriodicite(String periodicite) {
		this.periodicite = periodicite;
	}

	public Double getMontantCommission() {
		return montantCommission;
	}

	public void setMontantCommission(Double montantCommission) {
		this.montantCommission = montantCommission;
	}

	public Double getMontantTaxe() {
		return montantTaxe;
	}

	public void setMontantTaxe(Double montantTaxe) {
		this.montantTaxe = montantTaxe;
	}

	public Double getTeg() {
		return teg;
	}

	public void setTeg(Double teg) {
		this.teg = teg;
	}

	public String getDeblocageSurFacture() {
		return deblocageSurFacture;
	}

	public void setDeblocageSurFacture(String deblocageSurFacture) {
		this.deblocageSurFacture = deblocageSurFacture;
	}

	public String getMotifAbandon() {
		return motifAbandon;
	}

	public void setMotifAbandon(String motifAbandon) {
		this.motifAbandon = motifAbandon;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getEtatAvant() {
		return etatAvant;
	}

	public void setEtatAvant(String etatAvant) {
		this.etatAvant = etatAvant;
	}

	public String getCommPreleve() {
		return commPreleve;
	}

	public void setCommPreleve(String commPreleve) {
		this.commPreleve = commPreleve;
	}

	public String getEchFinMois() {
		return echFinMois;
	}

	public void setEchFinMois(String echFinMois) {
		this.echFinMois = echFinMois;
	}

	public String getGraceDiff() {
		return graceDiff;
	}

	public void setGraceDiff(String graceDiff) {
		this.graceDiff = graceDiff;
	}

	public String getModeGestDiff() {
		return modeGestDiff;
	}

	public void setModeGestDiff(String modeGestDiff) {
		this.modeGestDiff = modeGestDiff;
	}

	public String getPeriodiciteDiff() {
		return periodiciteDiff;
	}

	public void setPeriodiciteDiff(String periodiciteDiff) {
		this.periodiciteDiff = periodiciteDiff;
	}

	public Double getTauxDiff() {
		return tauxDiff;
	}

	public void setTauxDiff(Double tauxDiff) {
		this.tauxDiff = tauxDiff;
	}

	public String getTypePlan() {
		return typePlan;
	}

	public void setTypePlan(String typePlan) {
		this.typePlan = typePlan;
	}

	public String getIsImpaye() {
		return isImpaye;
	}

	public void setIsImpaye(String isImpaye) {
		this.isImpaye = isImpaye;
	}

	public String getIsAttImpaye() {
		return isAttImpaye;
	}

	public void setIsAttImpaye(String isAttImpaye) {
		this.isAttImpaye = isAttImpaye;
	}

	public String getElementLiberte() {
		return elementLiberte;
	}

	public void setElementLiberte(String elementLiberte) {
		this.elementLiberte = elementLiberte;
	}

	public Integer getNumeroEchComDebRepart() {
		return numeroEchComDebRepart;
	}

	public void setNumeroEchComDebRepart(Integer numeroEchComDebRepart) {
		this.numeroEchComDebRepart = numeroEchComDebRepart;
	}

	public Integer getNumeroEchComFinRepart() {
		return numeroEchComFinRepart;
	}

	public void setNumeroEchComFinRepart(Integer numeroEchComFinRepart) {
		this.numeroEchComFinRepart = numeroEchComFinRepart;
	}

	public Integer getNombreDiff() {
		return nombreDiff;
	}

	public void setNombreDiff(Integer nombreDiff) {
		this.nombreDiff = nombreDiff;
	}

	public Double getMontantDiff() {
		return montantDiff;
	}

	public void setMontantDiff(Double montantDiff) {
		this.montantDiff = montantDiff;
	}

	public Double getTaxeDiff() {
		return taxeDiff;
	}

	public void setTaxeDiff(Double taxeDiff) {
		this.taxeDiff = taxeDiff;
	}

	public Double getOldMontantDiff() {
		return oldMontantDiff;
	}

	public void setOldMontantDiff(Double oldMontantDiff) {
		this.oldMontantDiff = oldMontantDiff;
	}

	public Double getOldTaxeDiff() {
		return oldTaxeDiff;
	}

	public void setOldTaxeDiff(Double oldTaxeDiff) {
		this.oldTaxeDiff = oldTaxeDiff;
	}

	public Integer getNumeroEchDebRep() {
		return numeroEchDebRep;
	}

	public void setNumeroEchDebRep(Integer numeroEchDebRep) {
		this.numeroEchDebRep = numeroEchDebRep;
	}

	public Integer getNumeroEchFinRep() {
		return numeroEchFinRep;
	}

	public void setNumeroEchFinRep(Integer numeroEchFinRep) {
		this.numeroEchFinRep = numeroEchFinRep;
	}

	public String getNumDosParent() {
		return numDosParent;
	}

	public void setNumDosParent(String numDosParent) {
		this.numDosParent = numDosParent;
	}

	public String getNumDosRacine() {
		return numDosRacine;
	}

	public void setNumDosRacine(String numDosRacine) {
		this.numDosRacine = numDosRacine;
	}

	public Double getMontantHerite() {
		return montantHerite;
	}

	public void setMontantHerite(Double montantHerite) {
		this.montantHerite = montantHerite;
	}

	public String getEstPretCons() {
		return estPretCons;
	}

	public void setEstPretCons(String estPretCons) {
		this.estPretCons = estPretCons;
	}

	public String getEstAvenant() {
		return estAvenant;
	}

	public void setEstAvenant(String estAvenant) {
		this.estAvenant = estAvenant;
	}

	public String getEstAvenantDemandeClient() {
		return estAvenantDemandeClient;
	}

	public void setEstAvenantDemandeClient(String estAvenantDemandeClient) {
		this.estAvenantDemandeClient = estAvenantDemandeClient;
	}

	public Integer getCompteur() {
		return compteur;
	}

	public void setCompteur(Integer compteur) {
		this.compteur = compteur;
	}

	public Character getOptionAvenant() {
		return optionAvenant;
	}

	public void setOptionAvenant(Character optionAvenant) {
		this.optionAvenant = optionAvenant;
	}

	public String getComptaAttente() {
		return comptaAttente;
	}

	public void setComptaAttente(String comptaAttente) {
		this.comptaAttente = comptaAttente;
	}

	public String getEveEnCours() {
		return eveEnCours;
	}

	public void setEveEnCours(String eveEnCours) {
		this.eveEnCours = eveEnCours;
	}

	public Long getIddevise() {
		return iddevise;
	}

	public void setIddevise(Long iddevise) {
		this.iddevise = iddevise;
	}

	public CompteDTOmin getCompteClient() {
		return compteClient;
	}

	public void setCompteClient(CompteDTOmin compteClient) {
		this.compteClient = compteClient;
	}

	public CompteDTOmin getCompteRemboursement() {
		return compteRemboursement;
	}

	public void setCompteRemboursement(CompteDTOmin compteRemboursement) {
		this.compteRemboursement = compteRemboursement;
	}

	public CompteDTOmin getCompteEngagement() {
		return compteEngagement;
	}

	public void setCompteEngagement(CompteDTOmin compteEngagement) {
		this.compteEngagement = compteEngagement;
	}

	public CompteDTOmin getComptePreAutorise() {
		return comptePreAutorise;
	}

	public void setComptePreAutorise(CompteDTOmin comptePreAutorise) {
		this.comptePreAutorise = comptePreAutorise;
	}

	public CompteDTOmin getCompteEngagementAutorise() {
		return compteEngagementAutorise;
	}

	public void setCompteEngagementAutorise(CompteDTOmin compteEngagementAutorise) {
		this.compteEngagementAutorise = compteEngagementAutorise;
	}

	public CompteDTOmin getCompteEngagementDisponible() {
		return compteEngagementDisponible;
	}

	public void setCompteEngagementDisponible(CompteDTOmin compteEngagementDisponible) {
		this.compteEngagementDisponible = compteEngagementDisponible;
	}

	public CompteDTOmin getCompteProvisionInteret() {
		return compteProvisionInteret;
	}

	public void setCompteProvisionInteret(CompteDTOmin compteProvisionInteret) {
		this.compteProvisionInteret = compteProvisionInteret;
	}

	public CompteDTOmin getCompteAttenteImpaye() {
		return compteAttenteImpaye;
	}

	public void setCompteAttenteImpaye(CompteDTOmin compteAttenteImpaye) {
		this.compteAttenteImpaye = compteAttenteImpaye;
	}

	public CompteDTOmin getCompteImpaye() {
		return compteImpaye;
	}

	public void setCompteImpaye(CompteDTOmin compteImpaye) {
		this.compteImpaye = compteImpaye;
	}

	public CompteDTOmin getCompteInteretImpaye() {
		return compteInteretImpaye;
	}

	public void setCompteInteretImpaye(CompteDTOmin compteInteretImpaye) {
		this.compteInteretImpaye = compteInteretImpaye;
	}

	public CompteDTOmin getCompteProvisionInteretImpaye() {
		return compteProvisionInteretImpaye;
	}

	public void setCompteProvisionInteretImpaye(CompteDTOmin compteProvisionInteretImpaye) {
		this.compteProvisionInteretImpaye = compteProvisionInteretImpaye;
	}

	public CompteDTOmin getCompteCoutMarginal() {
		return compteCoutMarginal;
	}

	public void setCompteCoutMarginal(CompteDTOmin compteCoutMarginal) {
		this.compteCoutMarginal = compteCoutMarginal;
	}

	public SourceFinancementDTOmin getSourceFinancement() {
		return sourceFinancement;
	}

	public void setSourceFinancement(SourceFinancementDTOmin sourceFinancement) {
		this.sourceFinancement = sourceFinancement;
	}

	public TypeCreditDTOmin getTypeCredit() {
		return typeCredit;
	}

	public void setTypeCredit(TypeCreditDTOmin typeCredit) {
		this.typeCredit = typeCredit;
	}

	public TiersDTOmin getTiersPayeur() {
		return tiersPayeur;
	}

	public void setTiersPayeur(TiersDTOmin tiersPayeur) {
		this.tiersPayeur = tiersPayeur;
	}

	public TiersDTOmin getTiersBeneficiaire() {
		return tiersBeneficiaire;
	}

	public void setTiersBeneficiaire(TiersDTOmin tiersBeneficiaire) {
		this.tiersBeneficiaire = tiersBeneficiaire;
	}

	public ApporteurAffaireDTOmin getApporteurAffaire() {
		return apporteurAffaire;
	}

	public void setApporteurAffaire(ApporteurAffaireDTOmin apporteurAffaire) {
		this.apporteurAffaire = apporteurAffaire;
	}

	public SecteurActiviteDTOmin getSecteurActivite() {
		return secteurActivite;
	}

	public void setSecteurActivite(SecteurActiviteDTOmin secteurActivite) {
		this.secteurActivite = secteurActivite;
	}

	public TypeOperationDTOmin getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(TypeOperationDTOmin typeOperation) {
		this.typeOperation = typeOperation;
	}

	public List<FraisDiversDTO> getFraisDivers() {
		return fraisDivers;
	}

	public void setFraisDivers(List<FraisDiversDTO> fraisDivers) {
		this.fraisDivers = fraisDivers;
	}

	public List<TauxCreditVariableDTO> getLstTauxVar() {
		return lstTauxVar;
	}

	public void setLstTauxVar(List<TauxCreditVariableDTO> lstTauxVar) {
		this.lstTauxVar = lstTauxVar;
	}

	public List<EcheanceDTO> getEcheances() {
		return echeances;
	}

	public void setEcheances(List<EcheanceDTO> echeances) {
		this.echeances = echeances;
	}

	public TauxDTO getTauxref() {
		return tauxref;
	}

	public void setTauxref(TauxDTO tauxref) {
		this.tauxref = tauxref;
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

	public String getCreditRevolving() {
		return creditRevolving;
	}

	public void setCreditRevolving(String creditRevolving) {
		this.creditRevolving = creditRevolving;
	}

	public ClientDTOmin getAvaliste() {
		return avaliste;
	}

	public void setAvaliste(ClientDTOmin avaliste) {
		this.avaliste = avaliste;
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

	public ClientDTOmin getClient() {
		return client;
	}

	public void setClient(ClientDTOmin client) {
		this.client = client;
	}

	public ObjetFinancementDTOmin getObjetFinancement() {
		return objetFinancement;
	}

	public void setObjetFinancement(ObjetFinancementDTOmin objetFinancement) {
		this.objetFinancement = objetFinancement;
	}
	
	
	
}
