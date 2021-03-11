package dto;

import java.io.Serializable;
import java.util.Date;

public class GenererPlanLibreDTO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String modePlanLibre;
	private Long uniteId;
	private Long idDevise;
	private Long compte;
	private Integer numeroEcheance;
	private Double montantAmortOuTraite;
	private Double capital;
	private Double capitalInitial;
	private Double tauxInteret;
	private Double tauxTaxe;
	private Integer nbreEcheance;
	private String periodiciteEch;
	private String typePlan;
	private Date dateDebutEcheance;
	private Date dateOldEch;
	private Date dateEch;
	private Date dateMiseEnPlace;
	private Integer nbDiffere;
	private String modeGesDiffere;
	private Double tauxInteretDiff;
	private Integer numEchDebutRepartition;
	private Integer numEchFinRepartition; 
	private Integer numDebRepartEchComEng;
	private Integer numFinRepartEchComEng; 
	private Double montantComEng;
	private Double montantTaxeComEng;
	private String graceDiff;
	private String periodiciteDiff;
	private Double avPenalieRetard;
	private Double avTaxePenaliteRetard;
	private Double avComEngagement;
	private Double avTaxeComEngagement;
	private Double avIntReserve;
	private Double avTaxIntReserve;
	public String getModePlanLibre() {
		return modePlanLibre;
	}
	public void setModePlanLibre(String modePlanLibre) {
		this.modePlanLibre = modePlanLibre;
	}
	public Long getUniteId() {
		return uniteId;
	}
	public void setUniteId(Long uniteId) {
		this.uniteId = uniteId;
	}
	public Long getIdDevise() {
		return idDevise;
	}
	public void setIdDevise(Long idDevise) {
		this.idDevise = idDevise;
	}
	public Long getCompte() {
		return compte;
	}
	public void setCompte(Long compte) {
		this.compte = compte;
	}
	public Integer getNumeroEcheance() {
		return numeroEcheance;
	}
	public void setNumeroEcheance(Integer numeroEcheance) {
		this.numeroEcheance = numeroEcheance;
	}
	public Double getMontantAmortOuTraite() {
		return montantAmortOuTraite;
	}
	public void setMontantAmortOuTraite(Double montantAmortOuTraite) {
		this.montantAmortOuTraite = montantAmortOuTraite;
	}
	public Double getCapital() {
		return capital;
	}
	public void setCapital(Double capital) {
		this.capital = capital;
	}
	public Double getCapitalInitial() {
		return capitalInitial;
	}
	public void setCapitalInitial(Double capitalInitial) {
		this.capitalInitial = capitalInitial;
	}
	public Double getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	public Double getTauxTaxe() {
		return tauxTaxe;
	}
	public void setTauxTaxe(Double tauxTaxe) {
		this.tauxTaxe = tauxTaxe;
	}
	public Integer getNbreEcheance() {
		return nbreEcheance;
	}
	public void setNbreEcheance(Integer nbreEcheance) {
		this.nbreEcheance = nbreEcheance;
	}
	public String getPeriodiciteEch() {
		return periodiciteEch;
	}
	public void setPeriodiciteEch(String periodiciteEch) {
		this.periodiciteEch = periodiciteEch;
	}
	public String getTypePlan() {
		return typePlan;
	}
	public void setTypePlan(String typePlan) {
		this.typePlan = typePlan;
	}
	public Date getDateDebutEcheance() {
		return dateDebutEcheance;
	}
	public void setDateDebutEcheance(Date dateDebutEcheance) {
		this.dateDebutEcheance = dateDebutEcheance;
	}
	public Date getDateOldEch() {
		return dateOldEch;
	}
	public void setDateOldEch(Date dateOldEch) {
		this.dateOldEch = dateOldEch;
	}
	public Date getDateEch() {
		return dateEch;
	}
	public void setDateEch(Date dateEch) {
		this.dateEch = dateEch;
	}
	public Date getDateMiseEnPlace() {
		return dateMiseEnPlace;
	}
	public void setDateMiseEnPlace(Date dateMiseEnPlace) {
		this.dateMiseEnPlace = dateMiseEnPlace;
	}
	public Integer getNbDiffere() {
		return nbDiffere;
	}
	public void setNbDiffere(Integer nbDiffere) {
		this.nbDiffere = nbDiffere;
	}
	public String getModeGesDiffere() {
		return modeGesDiffere;
	}
	public void setModeGesDiffere(String modeGesDiffere) {
		this.modeGesDiffere = modeGesDiffere;
	}
	public Double getTauxInteretDiff() {
		return tauxInteretDiff;
	}
	public void setTauxInteretDiff(Double tauxInteretDiff) {
		this.tauxInteretDiff = tauxInteretDiff;
	}
	public Integer getNumEchDebutRepartition() {
		return numEchDebutRepartition;
	}
	public void setNumEchDebutRepartition(Integer numEchDebutRepartition) {
		this.numEchDebutRepartition = numEchDebutRepartition;
	}
	public Integer getNumEchFinRepartition() {
		return numEchFinRepartition;
	}
	public void setNumEchFinRepartition(Integer numEchFinRepartition) {
		this.numEchFinRepartition = numEchFinRepartition;
	}
	public Integer getNumDebRepartEchComEng() {
		return numDebRepartEchComEng;
	}
	public void setNumDebRepartEchComEng(Integer numDebRepartEchComEng) {
		this.numDebRepartEchComEng = numDebRepartEchComEng;
	}
	public Integer getNumFinRepartEchComEng() {
		return numFinRepartEchComEng;
	}
	public void setNumFinRepartEchComEng(Integer numFinRepartEchComEng) {
		this.numFinRepartEchComEng = numFinRepartEchComEng;
	}
	public Double getMontantComEng() {
		return montantComEng;
	}
	public void setMontantComEng(Double montantComEng) {
		this.montantComEng = montantComEng;
	}
	public Double getMontantTaxeComEng() {
		return montantTaxeComEng;
	}
	public void setMontantTaxeComEng(Double montantTaxeComEng) {
		this.montantTaxeComEng = montantTaxeComEng;
	}
	public String getGraceDiff() {
		return graceDiff;
	}
	public void setGraceDiff(String graceDiff) {
		this.graceDiff = graceDiff;
	}
	public String getPeriodiciteDiff() {
		return periodiciteDiff;
	}
	public void setPeriodiciteDiff(String periodiciteDiff) {
		this.periodiciteDiff = periodiciteDiff;
	}
	public Double getAvPenalieRetard() {
		return avPenalieRetard;
	}
	public void setAvPenalieRetard(Double avPenalieRetard) {
		this.avPenalieRetard = avPenalieRetard;
	}
	public Double getAvTaxePenaliteRetard() {
		return avTaxePenaliteRetard;
	}
	public void setAvTaxePenaliteRetard(Double avTaxePenaliteRetard) {
		this.avTaxePenaliteRetard = avTaxePenaliteRetard;
	}
	public Double getAvComEngagement() {
		return avComEngagement;
	}
	public void setAvComEngagement(Double avComEngagement) {
		this.avComEngagement = avComEngagement;
	}
	public Double getAvTaxeComEngagement() {
		return avTaxeComEngagement;
	}
	public void setAvTaxeComEngagement(Double avTaxeComEngagement) {
		this.avTaxeComEngagement = avTaxeComEngagement;
	}
	public Double getAvIntReserve() {
		return avIntReserve;
	}
	public void setAvIntReserve(Double avIntReserve) {
		this.avIntReserve = avIntReserve;
	}
	public Double getAvTaxIntReserve() {
		return avTaxIntReserve;
	}
	public void setAvTaxIntReserve(Double avTaxIntReserve) {
		this.avTaxIntReserve = avTaxIntReserve;
	} 
	
	
}
