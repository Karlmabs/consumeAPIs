package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GenererPlanDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long uniteId;
	private Long idDevise;
	private Long compte;
	private Double capital;
	private Double tauxInteret;
	private Double tauxTaxe;
	private Integer nbreEcheance;
	private String periodiciteEch;
	private String typePlan;
	private Date datePremiereEch;
	private Date dateMiseEnPlace;
	private String echFinMois;
	private Integer nbDiffere;
	private Double tauxInteretDiff;
	private String modeGesDiffere;
	private Integer numEchDebutRepartition;
	private Integer numEchFinRepartition;
	private Integer numDebRepartEchComEng;
	private Integer numFinRepartEchComEng;									
	private Double montantComEng;
	private Double montantTaxeComEng;
	private String graceDiff;
	private String periodiciteDiff;
	private Double capitalFusion;
	private Double interetDiffFusion;
	private Double taxeInteretDiffFusion;
	private Double comEngFusion;
	private Double taxeComEngFusion;
	private List<TauxCreditVariableDTO> listeTauxVariables;
	private String typeTaux;
	private Double avPenalieRetard;
	private Double avTaxePenaliteRetard;
	private Double avComEngagement;
	private Double avTaxeComEngagement;
	private Double avIntReserve;
	private Double avTaxIntReserve;
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
	public Double getCapital() {
		return capital;
	}
	public void setCapital(Double capital) {
		this.capital = capital;
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
	public Date getDatePremiereEch() {
		return datePremiereEch;
	}
	public void setDatePremiereEch(Date datePremiereEch) {
		this.datePremiereEch = datePremiereEch;
	}
	public Date getDateMiseEnPlace() {
		return dateMiseEnPlace;
	}
	public void setDateMiseEnPlace(Date dateMiseEnPlace) {
		this.dateMiseEnPlace = dateMiseEnPlace;
	}
	public String getEchFinMois() {
		return echFinMois;
	}
	public void setEchFinMois(String echFinMois) {
		this.echFinMois = echFinMois;
	}
	public Integer getNbDiffere() {
		return nbDiffere;
	}
	public void setNbDiffere(Integer nbDiffere) {
		this.nbDiffere = nbDiffere;
	}
	public Double getTauxInteretDiff() {
		return tauxInteretDiff;
	}
	public void setTauxInteretDiff(Double tauxInteretDiff) {
		this.tauxInteretDiff = tauxInteretDiff;
	}
	public String getModeGesDiffere() {
		return modeGesDiffere;
	}
	public void setModeGesDiffere(String modeGesDiffere) {
		this.modeGesDiffere = modeGesDiffere;
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
	public Double getCapitalFusion() {
		return capitalFusion;
	}
	public void setCapitalFusion(Double capitalFusion) {
		this.capitalFusion = capitalFusion;
	}
	public Double getInteretDiffFusion() {
		return interetDiffFusion;
	}
	public void setInteretDiffFusion(Double interetDiffFusion) {
		this.interetDiffFusion = interetDiffFusion;
	}
	public Double getTaxeInteretDiffFusion() {
		return taxeInteretDiffFusion;
	}
	public void setTaxeInteretDiffFusion(Double taxeInteretDiffFusion) {
		this.taxeInteretDiffFusion = taxeInteretDiffFusion;
	}
	public Double getComEngFusion() {
		return comEngFusion;
	}
	public void setComEngFusion(Double comEngFusion) {
		this.comEngFusion = comEngFusion;
	}
	public Double getTaxeComEngFusion() {
		return taxeComEngFusion;
	}
	public void setTaxeComEngFusion(Double taxeComEngFusion) {
		this.taxeComEngFusion = taxeComEngFusion;
	}
	public List<TauxCreditVariableDTO> getListeTauxVariables() {
		return listeTauxVariables;
	}
	public void setListeTauxVariables(List<TauxCreditVariableDTO> listeTauxVariables) {
		this.listeTauxVariables = listeTauxVariables;
	}
	public String getTypeTaux() {
		return typeTaux;
	}
	public void setTypeTaux(String typeTaux) {
		this.typeTaux = typeTaux;
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
