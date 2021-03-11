package dto;

import com.afrikbrain.banque.corebanking.administration.compte.entities.Compte;

import java.io.Serializable;
import java.util.Date;

public class CompteDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String userUpdate;
	private Date dateUpdate;
	private Date dateCreate;
	private int version;
	private String numeroCompte;
	private String cleCompte;
	private String chLibre;
	private String numeroCompteOld;
	private String cleCompteOld;
	private String etatCompte;
	private String intitule;
	private String sensCompte;
	private String typeArreteCompte;	
	private String taxable;
	private String modeArrete;
	private String appurable;
	private String reportANouveau;
	private String appartenance;
	private Date dateOuverture;
	private Double montantPremierVersement;
	private Date dateDerniereOperation;
	private String sensDerniereOperation;
	private Date dateDernierCredit;
	private Date dateDernierDebit;
	private Double montantForcageJournalier;
	private Double cumulForcage;
	private Double soldeComptable;
	private Double soldeJournalier;
	private Double soldeInitial;
	private Double montantReserve;
	private String lettrage;
	private Date dateValidationOuverture;
	private Date dateApurement;
	private Date dateCloture;
	private Date dateActivation;
	private Date dateReOuverture;
	private Date dateFermeture;
	private String motifFermeture;	
	private String modeComptabilisation;
	private Double montantEnCoursDecouvert;
	private Date dateEcheanceDecouvert;
	private Double montantIndisponible;
	private UniteBancaireDTOmin unite;
	private String impAvis;
	private String impCarnet;
	private Long idDeviseUnite;
	private ConditionArreteDTOmin conditionArrete;
	private AgenceDTOmin agence;
	private ClientDTOmin client;
	private TypeCompteDTOmin typeCompte;
	private String comptAgios;
	private ChapitreDTOmin chapitre;
	private GestionnaireDTOmin gestionnaire;
	private ProduitDTOmin produit;
	private TypeDateValeurDTOmin typeDateValeur;
	private String dormant;
	private String risque;
	private String soldeSecurise;
	private Date dteDernierArrete;
	private Date dteDernierPaiement;
	private Double lastMontDebitPrevArrete;
	private Double lastMontCreditPrevArrete;
	private Double montDebitPrevArrete;
	private Double montCreditPrevArrete;
	private Integer countOperation;
	private Double montFraisActivite;
	private Date dteFraisActivite;
	private String instruction;
	private Long reservCollecteId;
	
	public void toDTO(Compte compte){
		setId(compte.getId());
		setVersion(compte.getVersion());
		setNumeroCompte(compte.getNumeroCompte());
		setCleCompte(compte.getCleCompte());
		setIntitule(compte.getIntitule());
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserUpdate() {
		return userUpdate;
	}
	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}
	public Date getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	public Date getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public String getCleCompte() {
		return cleCompte;
	}
	public void setCleCompte(String cleCompte) {
		this.cleCompte = cleCompte;
	}
	public String getChLibre() {
		return chLibre;
	}
	public void setChLibre(String chLibre) {
		this.chLibre = chLibre;
	}
	public String getNumeroCompteOld() {
		return numeroCompteOld;
	}
	public void setNumeroCompteOld(String numeroCompteOld) {
		this.numeroCompteOld = numeroCompteOld;
	}
	public String getCleCompteOld() {
		return cleCompteOld;
	}
	public void setCleCompteOld(String cleCompteOld) {
		this.cleCompteOld = cleCompteOld;
	}
	public String getEtatCompte() {
		return etatCompte;
	}
	public void setEtatCompte(String etatCompte) {
		this.etatCompte = etatCompte;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getSensCompte() {
		return sensCompte;
	}
	public void setSensCompte(String sensCompte) {
		this.sensCompte = sensCompte;
	}
	public String getTypeArreteCompte() {
		return typeArreteCompte;
	}
	public void setTypeArreteCompte(String typeArreteCompte) {
		this.typeArreteCompte = typeArreteCompte;
	}
	public String getTaxable() {
		return taxable;
	}
	public void setTaxable(String taxable) {
		this.taxable = taxable;
	}
	public String getModeArrete() {
		return modeArrete;
	}
	public void setModeArrete(String modeArrete) {
		this.modeArrete = modeArrete;
	}
	public String getAppurable() {
		return appurable;
	}
	public void setAppurable(String appurable) {
		this.appurable = appurable;
	}
	public String getReportANouveau() {
		return reportANouveau;
	}
	public void setReportANouveau(String reportANouveau) {
		this.reportANouveau = reportANouveau;
	}
	public String getAppartenance() {
		return appartenance;
	}
	public void setAppartenance(String appartenance) {
		this.appartenance = appartenance;
	}
	public Date getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	public Double getMontantPremierVersement() {
		return montantPremierVersement;
	}
	public void setMontantPremierVersement(Double montantPremierVersement) {
		this.montantPremierVersement = montantPremierVersement;
	}
	public Date getDateDerniereOperation() {
		return dateDerniereOperation;
	}
	public void setDateDerniereOperation(Date dateDerniereOperation) {
		this.dateDerniereOperation = dateDerniereOperation;
	}
	public String getSensDerniereOperation() {
		return sensDerniereOperation;
	}
	public void setSensDerniereOperation(String sensDerniereOperation) {
		this.sensDerniereOperation = sensDerniereOperation;
	}
	public Date getDateDernierCredit() {
		return dateDernierCredit;
	}
	public void setDateDernierCredit(Date dateDernierCredit) {
		this.dateDernierCredit = dateDernierCredit;
	}
	public Date getDateDernierDebit() {
		return dateDernierDebit;
	}
	public void setDateDernierDebit(Date dateDernierDebit) {
		this.dateDernierDebit = dateDernierDebit;
	}
	public Double getMontantForcageJournalier() {
		return montantForcageJournalier;
	}
	public void setMontantForcageJournalier(Double montantForcageJournalier) {
		this.montantForcageJournalier = montantForcageJournalier;
	}
	public Double getCumulForcage() {
		return cumulForcage;
	}
	public void setCumulForcage(Double cumulForcage) {
		this.cumulForcage = cumulForcage;
	}
	public Double getSoldeComptable() {
		return soldeComptable;
	}
	public void setSoldeComptable(Double soldeComptable) {
		this.soldeComptable = soldeComptable;
	}
	public Double getSoldeJournalier() {
		return soldeJournalier;
	}
	public void setSoldeJournalier(Double soldeJournalier) {
		this.soldeJournalier = soldeJournalier;
	}
	public Double getSoldeInitial() {
		return soldeInitial;
	}
	public void setSoldeInitial(Double soldeInitial) {
		this.soldeInitial = soldeInitial;
	}
	public Double getMontantReserve() {
		return montantReserve;
	}
	public void setMontantReserve(Double montantReserve) {
		this.montantReserve = montantReserve;
	}
	public String getLettrage() {
		return lettrage;
	}
	public void setLettrage(String lettrage) {
		this.lettrage = lettrage;
	}
	public Date getDateValidationOuverture() {
		return dateValidationOuverture;
	}
	public void setDateValidationOuverture(Date dateValidationOuverture) {
		this.dateValidationOuverture = dateValidationOuverture;
	}
	public Date getDateApurement() {
		return dateApurement;
	}
	public void setDateApurement(Date dateApurement) {
		this.dateApurement = dateApurement;
	}
	public Date getDateCloture() {
		return dateCloture;
	}
	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}
	public Date getDateActivation() {
		return dateActivation;
	}
	public void setDateActivation(Date dateActivation) {
		this.dateActivation = dateActivation;
	}
	public Date getDateReOuverture() {
		return dateReOuverture;
	}
	public void setDateReOuverture(Date dateReOuverture) {
		this.dateReOuverture = dateReOuverture;
	}
	public Date getDateFermeture() {
		return dateFermeture;
	}
	public void setDateFermeture(Date dateFermeture) {
		this.dateFermeture = dateFermeture;
	}
	public String getMotifFermeture() {
		return motifFermeture;
	}
	public void setMotifFermeture(String motifFermeture) {
		this.motifFermeture = motifFermeture;
	}
	public String getModeComptabilisation() {
		return modeComptabilisation;
	}
	public void setModeComptabilisation(String modeComptabilisation) {
		this.modeComptabilisation = modeComptabilisation;
	}
	public Double getMontantEnCoursDecouvert() {
		return montantEnCoursDecouvert;
	}
	public void setMontantEnCoursDecouvert(Double montantEnCoursDecouvert) {
		this.montantEnCoursDecouvert = montantEnCoursDecouvert;
	}
	public Date getDateEcheanceDecouvert() {
		return dateEcheanceDecouvert;
	}
	public void setDateEcheanceDecouvert(Date dateEcheanceDecouvert) {
		this.dateEcheanceDecouvert = dateEcheanceDecouvert;
	}
	public Double getMontantIndisponible() {
		return montantIndisponible;
	}
	public void setMontantIndisponible(Double montantIndisponible) {
		this.montantIndisponible = montantIndisponible;
	}
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}
	public String getImpAvis() {
		return impAvis;
	}
	public void setImpAvis(String impAvis) {
		this.impAvis = impAvis;
	}
	public String getImpCarnet() {
		return impCarnet;
	}
	public void setImpCarnet(String impCarnet) {
		this.impCarnet = impCarnet;
	}
	public Long getIdDeviseUnite() {
		return idDeviseUnite;
	}
	public void setIdDeviseUnite(Long idDeviseUnite) {
		this.idDeviseUnite = idDeviseUnite;
	}
	public ConditionArreteDTOmin getConditionArrete() {
		return conditionArrete;
	}
	public void setConditionArrete(ConditionArreteDTOmin conditionArrete) {
		this.conditionArrete = conditionArrete;
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
	public TypeCompteDTOmin getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(TypeCompteDTOmin typeCompte) {
		this.typeCompte = typeCompte;
	}
	public String getComptAgios() {
		return comptAgios;
	}
	public void setComptAgios(String comptAgios) {
		this.comptAgios = comptAgios;
	}
	public ChapitreDTOmin getChapitre() {
		return chapitre;
	}
	public void setChapitre(ChapitreDTOmin chapitre) {
		this.chapitre = chapitre;
	}
	public GestionnaireDTOmin getGestionnaire() {
		return gestionnaire;
	}
	public void setGestionnaire(GestionnaireDTOmin gestionnaire) {
		this.gestionnaire = gestionnaire;
	}
	public ProduitDTOmin getProduit() {
		return produit;
	}
	public void setProduit(ProduitDTOmin produit) {
		this.produit = produit;
	}
	public TypeDateValeurDTOmin getTypeDateValeur() {
		return typeDateValeur;
	}
	public void setTypeDateValeur(TypeDateValeurDTOmin typeDateValeur) {
		this.typeDateValeur = typeDateValeur;
	}
	public String getDormant() {
		return dormant;
	}
	public void setDormant(String dormant) {
		this.dormant = dormant;
	}
	public String getRisque() {
		return risque;
	}
	public void setRisque(String risque) {
		this.risque = risque;
	}
	public String getSoldeSecurise() {
		return soldeSecurise;
	}
	public void setSoldeSecurise(String soldeSecurise) {
		this.soldeSecurise = soldeSecurise;
	}
	public Date getDteDernierArrete() {
		return dteDernierArrete;
	}
	public void setDteDernierArrete(Date dteDernierArrete) {
		this.dteDernierArrete = dteDernierArrete;
	}
	public Date getDteDernierPaiement() {
		return dteDernierPaiement;
	}
	public void setDteDernierPaiement(Date dteDernierPaiement) {
		this.dteDernierPaiement = dteDernierPaiement;
	}
	public Double getLastMontDebitPrevArrete() {
		return lastMontDebitPrevArrete;
	}
	public void setLastMontDebitPrevArrete(Double lastMontDebitPrevArrete) {
		this.lastMontDebitPrevArrete = lastMontDebitPrevArrete;
	}
	public Double getLastMontCreditPrevArrete() {
		return lastMontCreditPrevArrete;
	}
	public void setLastMontCreditPrevArrete(Double lastMontCreditPrevArrete) {
		this.lastMontCreditPrevArrete = lastMontCreditPrevArrete;
	}
	public Double getMontDebitPrevArrete() {
		return montDebitPrevArrete;
	}
	public void setMontDebitPrevArrete(Double montDebitPrevArrete) {
		this.montDebitPrevArrete = montDebitPrevArrete;
	}
	public Double getMontCreditPrevArrete() {
		return montCreditPrevArrete;
	}
	public void setMontCreditPrevArrete(Double montCreditPrevArrete) {
		this.montCreditPrevArrete = montCreditPrevArrete;
	}
	public Integer getCountOperation() {
		return countOperation;
	}
	public void setCountOperation(Integer countOperation) {
		this.countOperation = countOperation;
	}
	public Double getMontFraisActivite() {
		return montFraisActivite;
	}
	public void setMontFraisActivite(Double montFraisActivite) {
		this.montFraisActivite = montFraisActivite;
	}
	public Date getDteFraisActivite() {
		return dteFraisActivite;
	}
	public void setDteFraisActivite(Date dteFraisActivite) {
		this.dteFraisActivite = dteFraisActivite;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public Long getReservCollecteId() {
		return reservCollecteId;
	}
	public void setReservCollecteId(Long reservCollecteId) {
		this.reservCollecteId = reservCollecteId;
	}
	
	
}
