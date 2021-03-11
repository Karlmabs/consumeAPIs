package dto;

import com.afrikbrain.banque.corebanking.administration.compte.entities.Reservation;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Echeance;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.EcheanceCommission;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.PayementEcheance;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.EEtatEchCred;
import com.afrikbrain.util.enumeration.EYesNo;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class EcheanceDTO extends BaseWebserviceBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer numero;
	private Date datePaiement;
	private Date dateMiseImpaye;
	private Date dateCalculInteretRetard;
	private Date dateCalculProvisionInteret;
	private Date dateDebut;
	private Date dateEche;
	private Date dateAppel;
	private Double capitalRestantDu;
	private Double montantAmortissement;
	private Double montantInteret;
	private Double montantTaxe;
	private Double montantInteretTTC;
	private Double montantTraite;
	private Double montantComEng;
	private Double montantTaxeComEng;
	private Double montantIntereDiffere;
	private Double montantTaxeDiffere;
	private Double montantInteretRetard;
	private Double montantTaxeRetard;
	private Double cumulAmortPaye;
	private Double cumulInteretPaye;
	private Double cumulTaxePaye;
	private Double cumulInteretDifferePaye;
	private Double cumulTaxeDifferePaye;
	private Double cumulComEngPaye;
	private Double cumulTaxeComEngPaye;
	private Double cumulTraitePaye;
	private Double cumulInteretRetardPaye;
	private Double cumulTaxeRetardPaye;
	private Double avPenRetard;
	private Double avTaxPenRetard;
	private Double avComEng;
	private Double avTaxComEng;
	private Double avIntReserve;
	private Double avTaxIntReserve;
	private Double avCumulPenRetardPaye;
	private Double avCumulTaxPenRetardPaye;
	private Double avCumulComEngPaye;
	private Double avCumulTaxComEngPaye;
	private Double avCumulIntReservePaye;
	private Double avCumulTaxIntReservePaye;
	private Double avTotalHerite;
	private Double avTaxTotalHerite;
	private Double avCumulTotalHeritePaye;
	private Double avCumulTaxTotalHerite;
	private String etat;
	private String etatAvant;
	private String etatREM;
	private String attenteImpaye;
	private Double IntCouruNonEch;
	private Double taxeIntCNEch;
	private String numEchdeplacer;
	private String eveEnCours;
	private Set<PayementEcheanceDTO> payementEcheances = new HashSet<>(0);
	private Set<EcheanceCommissionDTO> listComEcheance = new HashSet<>();
	private Long idReservation;
	
	public void toDTO(Echeance echeance){
		setId(echeance.getId());
		setNumero(echeance.getNumero());
		setDatePaiement(echeance.getDatePaiement());
	}
	
	public Echeance toEntity() throws Exception{
		initContext();
		Echeance echeance = new Echeance();
		echeance.setId(getId());
		echeance.setNumero(getNumero());
		echeance.setDatePaiement(getDatePaiement());
		echeance.setDateMiseImpaye(getDateMiseImpaye());
		echeance.setDateCalculInteretRetard(getDateCalculInteretRetard());
		echeance.setDateCalculProvisionInteret(getDateCalculProvisionInteret());
		echeance.setDateDebut(getDateDebut());
		echeance.setDateEche(getDateEche());
		echeance.setDateAppel(getDateAppel());
		echeance.setCapitalRestantDu(getCapitalRestantDu());
		echeance.setMontantAmortissement(getMontantAmortissement());
		echeance.setMontantInteret(getMontantInteret());
		echeance.setMontantTaxe(getMontantTaxe());
		echeance.setMontantInteretTTC(getMontantInteretTTC());
		echeance.setMontantTraite(getMontantTraite());
		echeance.setMontantComEng(getMontantComEng());
		echeance.setMontantTaxeComEng(getMontantTaxeComEng());
		echeance.setMontantIntereDiffere(getMontantIntereDiffere());
		echeance.setMontantTaxeDiffere(getMontantTaxeDiffere());
		echeance.setMontantInteretRetard(getMontantInteretRetard());
		echeance.setMontantTaxeRetard(getMontantTaxeRetard());
		echeance.setCumulAmortPaye(getCumulAmortPaye());
		echeance.setCumulInteretPaye(getCumulInteretPaye());
		echeance.setCumulTaxePaye(getCumulTaxePaye());
		echeance.setCumulInteretDifferePaye(getCumulInteretDifferePaye());
		echeance.setCumulTaxeDifferePaye(getCumulTaxeDifferePaye());
		echeance.setAvCumulComEngPaye(getCumulComEngPaye());
		echeance.setCumulTaxeComEngPaye(getCumulTaxeComEngPaye());
		echeance.setCumulTraitePaye(getCumulTraitePaye());
		echeance.setCumulInteretRetardPaye(getCumulInteretRetardPaye());
		echeance.setCumulTaxeRetardPaye(getCumulTaxeRetardPaye());
		echeance.setAvPenRetard(getAvPenRetard());
		echeance.setAvTaxPenRetard(getAvTaxPenRetard());
		echeance.setAvComEng(getAvComEng());
		echeance.setAvTaxComEng(getAvTaxComEng());
		echeance.setAvIntReserve(getAvIntReserve());
		echeance.setAvTaxIntReserve(getAvTaxIntReserve());
		echeance.setAvCumulPenRetardPaye(getAvCumulPenRetardPaye());
		echeance.setAvCumulTaxPenRetardPaye(getAvCumulTaxPenRetardPaye());
		echeance.setAvCumulComEngPaye(getAvCumulComEngPaye());
		echeance.setAvCumulTaxComEngPaye(getAvCumulTaxComEngPaye());
		echeance.setAvCumulIntReservePaye(getAvCumulIntReservePaye());
		echeance.setAvCumulTaxIntReservePaye(getAvCumulTaxIntReservePaye());
		echeance.setAvTotalHerite(getAvTotalHerite());
		echeance.setAvTaxTotalHerite(getAvTaxTotalHerite());
		echeance.setAvCumulTotalHeritePaye(getAvCumulTotalHeritePaye());
		echeance.setAvCumulTaxTotalHerite(getAvCumulTaxTotalHerite());
		echeance.setEtat(EEtatEchCred.valueOf(getEtat()));
		echeance.setEtatAvant(EEtatEchCred.valueOf(getEtatAvant()));
		echeance.setEtatREM(EYesNo.valueOf(getEtatREM()));
		echeance.setAttenteImpaye(EYesNo.valueOf(getAttenteImpaye()));
		echeance.setIntCouruNonEch(getIntCouruNonEch());
		echeance.setTaxeIntCNEch(getTaxeIntCNEch());
		echeance.setNumEchdeplacer(getNumEchdeplacer());
		echeance.setEveEnCours(EYesNo.valueOf(getEveEnCours()));
		
		Set<PayementEcheance> payementEcheanceList = new HashSet<>(0);
		for(PayementEcheanceDTO temp : getPayementEcheances()){
			payementEcheanceList.add(temp.toEntity());
		}
		Set<EcheanceCommission> comEcheanceList = new HashSet<>(0);
		for(EcheanceCommissionDTO temp : getListComEcheance()){
			comEcheanceList.add(temp.toEntity());
		}

		Reservation reservation = administrationBean.findByPrimaryKey(Reservation.class, getIdReservation(), null);
		echeance.setPayementEcheances(payementEcheanceList);
		echeance.setListComEcheance(comEcheanceList);
		echeance.setReservation(reservation);		
		
		return echeance;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}
	public Date getDateMiseImpaye() {
		return dateMiseImpaye;
	}
	public void setDateMiseImpaye(Date dateMiseImpaye) {
		this.dateMiseImpaye = dateMiseImpaye;
	}
	public Date getDateCalculInteretRetard() {
		return dateCalculInteretRetard;
	}
	public void setDateCalculInteretRetard(Date dateCalculInteretRetard) {
		this.dateCalculInteretRetard = dateCalculInteretRetard;
	}
	public Date getDateCalculProvisionInteret() {
		return dateCalculProvisionInteret;
	}
	public void setDateCalculProvisionInteret(Date dateCalculProvisionInteret) {
		this.dateCalculProvisionInteret = dateCalculProvisionInteret;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateEche() {
		return dateEche;
	}
	public void setDateEche(Date dateEche) {
		this.dateEche = dateEche;
	}
	public Date getDateAppel() {
		return dateAppel;
	}
	public void setDateAppel(Date dateAppel) {
		this.dateAppel = dateAppel;
	}
	public Double getCapitalRestantDu() {
		return capitalRestantDu;
	}
	public void setCapitalRestantDu(Double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}
	public Double getMontantAmortissement() {
		return montantAmortissement;
	}
	public void setMontantAmortissement(Double montantAmortissement) {
		this.montantAmortissement = montantAmortissement;
	}
	public Double getMontantInteret() {
		return montantInteret;
	}
	public void setMontantInteret(Double montantInteret) {
		this.montantInteret = montantInteret;
	}
	public Double getMontantTaxe() {
		return montantTaxe;
	}
	public void setMontantTaxe(Double montantTaxe) {
		this.montantTaxe = montantTaxe;
	}
	public Double getMontantInteretTTC() {
		return montantInteretTTC;
	}
	public void setMontantInteretTTC(Double montantInteretTTC) {
		this.montantInteretTTC = montantInteretTTC;
	}
	public Double getMontantTraite() {
		return montantTraite;
	}
	public void setMontantTraite(Double montantTraite) {
		this.montantTraite = montantTraite;
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
	public Double getMontantIntereDiffere() {
		return montantIntereDiffere;
	}
	public void setMontantIntereDiffere(Double montantIntereDiffere) {
		this.montantIntereDiffere = montantIntereDiffere;
	}
	public Double getMontantTaxeDiffere() {
		return montantTaxeDiffere;
	}
	public void setMontantTaxeDiffere(Double montantTaxeDiffere) {
		this.montantTaxeDiffere = montantTaxeDiffere;
	}
	public Double getMontantInteretRetard() {
		return montantInteretRetard;
	}
	public void setMontantInteretRetard(Double montantInteretRetard) {
		this.montantInteretRetard = montantInteretRetard;
	}
	public Double getMontantTaxeRetard() {
		return montantTaxeRetard;
	}
	public void setMontantTaxeRetard(Double montantTaxeRetard) {
		this.montantTaxeRetard = montantTaxeRetard;
	}
	public Double getCumulAmortPaye() {
		return cumulAmortPaye;
	}
	public void setCumulAmortPaye(Double cumulAmortPaye) {
		this.cumulAmortPaye = cumulAmortPaye;
	}
	public Double getCumulInteretPaye() {
		return cumulInteretPaye;
	}
	public void setCumulInteretPaye(Double cumulInteretPaye) {
		this.cumulInteretPaye = cumulInteretPaye;
	}
	public Double getCumulTaxePaye() {
		return cumulTaxePaye;
	}
	public void setCumulTaxePaye(Double cumulTaxePaye) {
		this.cumulTaxePaye = cumulTaxePaye;
	}
	public Double getCumulInteretDifferePaye() {
		return cumulInteretDifferePaye;
	}
	public void setCumulInteretDifferePaye(Double cumulInteretDifferePaye) {
		this.cumulInteretDifferePaye = cumulInteretDifferePaye;
	}
	public Double getCumulTaxeDifferePaye() {
		return cumulTaxeDifferePaye;
	}
	public void setCumulTaxeDifferePaye(Double cumulTaxeDifferePaye) {
		this.cumulTaxeDifferePaye = cumulTaxeDifferePaye;
	}
	public Double getCumulComEngPaye() {
		return cumulComEngPaye;
	}
	public void setCumulComEngPaye(Double cumulComEngPaye) {
		this.cumulComEngPaye = cumulComEngPaye;
	}
	public Double getCumulTaxeComEngPaye() {
		return cumulTaxeComEngPaye;
	}
	public void setCumulTaxeComEngPaye(Double cumulTaxeComEngPaye) {
		this.cumulTaxeComEngPaye = cumulTaxeComEngPaye;
	}
	public Double getCumulTraitePaye() {
		return cumulTraitePaye;
	}
	public void setCumulTraitePaye(Double cumulTraitePaye) {
		this.cumulTraitePaye = cumulTraitePaye;
	}
	public Double getCumulInteretRetardPaye() {
		return cumulInteretRetardPaye;
	}
	public void setCumulInteretRetardPaye(Double cumulInteretRetardPaye) {
		this.cumulInteretRetardPaye = cumulInteretRetardPaye;
	}
	public Double getCumulTaxeRetardPaye() {
		return cumulTaxeRetardPaye;
	}
	public void setCumulTaxeRetardPaye(Double cumulTaxeRetardPaye) {
		this.cumulTaxeRetardPaye = cumulTaxeRetardPaye;
	}
	public Double getAvPenRetard() {
		return avPenRetard;
	}
	public void setAvPenRetard(Double avPenRetard) {
		this.avPenRetard = avPenRetard;
	}
	public Double getAvTaxPenRetard() {
		return avTaxPenRetard;
	}
	public void setAvTaxPenRetard(Double avTaxPenRetard) {
		this.avTaxPenRetard = avTaxPenRetard;
	}
	public Double getAvComEng() {
		return avComEng;
	}
	public void setAvComEng(Double avComEng) {
		this.avComEng = avComEng;
	}
	public Double getAvTaxComEng() {
		return avTaxComEng;
	}
	public void setAvTaxComEng(Double avTaxComEng) {
		this.avTaxComEng = avTaxComEng;
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
	public Double getAvCumulPenRetardPaye() {
		return avCumulPenRetardPaye;
	}
	public void setAvCumulPenRetardPaye(Double avCumulPenRetardPaye) {
		this.avCumulPenRetardPaye = avCumulPenRetardPaye;
	}
	public Double getAvCumulTaxPenRetardPaye() {
		return avCumulTaxPenRetardPaye;
	}
	public void setAvCumulTaxPenRetardPaye(Double avCumulTaxPenRetardPaye) {
		this.avCumulTaxPenRetardPaye = avCumulTaxPenRetardPaye;
	}
	public Double getAvCumulComEngPaye() {
		return avCumulComEngPaye;
	}
	public void setAvCumulComEngPaye(Double avCumulComEngPaye) {
		this.avCumulComEngPaye = avCumulComEngPaye;
	}
	public Double getAvCumulTaxComEngPaye() {
		return avCumulTaxComEngPaye;
	}
	public void setAvCumulTaxComEngPaye(Double avCumulTaxComEngPaye) {
		this.avCumulTaxComEngPaye = avCumulTaxComEngPaye;
	}
	public Double getAvCumulIntReservePaye() {
		return avCumulIntReservePaye;
	}
	public void setAvCumulIntReservePaye(Double avCumulIntReservePaye) {
		this.avCumulIntReservePaye = avCumulIntReservePaye;
	}
	public Double getAvCumulTaxIntReservePaye() {
		return avCumulTaxIntReservePaye;
	}
	public void setAvCumulTaxIntReservePaye(Double avCumulTaxIntReservePaye) {
		this.avCumulTaxIntReservePaye = avCumulTaxIntReservePaye;
	}
	public Double getAvTotalHerite() {
		return avTotalHerite;
	}
	public void setAvTotalHerite(Double avTotalHerite) {
		this.avTotalHerite = avTotalHerite;
	}
	public Double getAvTaxTotalHerite() {
		return avTaxTotalHerite;
	}
	public void setAvTaxTotalHerite(Double avTaxTotalHerite) {
		this.avTaxTotalHerite = avTaxTotalHerite;
	}
	public Double getAvCumulTotalHeritePaye() {
		return avCumulTotalHeritePaye;
	}
	public void setAvCumulTotalHeritePaye(Double avCumulTotalHeritePaye) {
		this.avCumulTotalHeritePaye = avCumulTotalHeritePaye;
	}
	public Double getAvCumulTaxTotalHerite() {
		return avCumulTaxTotalHerite;
	}
	public void setAvCumulTaxTotalHerite(Double avCumulTaxTotalHerite) {
		this.avCumulTaxTotalHerite = avCumulTaxTotalHerite;
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
	public String getEtatREM() {
		return etatREM;
	}
	public void setEtatREM(String etatREM) {
		this.etatREM = etatREM;
	}
	public String getAttenteImpaye() {
		return attenteImpaye;
	}
	public void setAttenteImpaye(String attenteImpaye) {
		this.attenteImpaye = attenteImpaye;
	}
	public Double getIntCouruNonEch() {
		return IntCouruNonEch;
	}
	public void setIntCouruNonEch(Double intCouruNonEch) {
		IntCouruNonEch = intCouruNonEch;
	}
	public Double getTaxeIntCNEch() {
		return taxeIntCNEch;
	}
	public void setTaxeIntCNEch(Double taxeIntCNEch) {
		this.taxeIntCNEch = taxeIntCNEch;
	}
	public String getNumEchdeplacer() {
		return numEchdeplacer;
	}
	public void setNumEchdeplacer(String numEchdeplacer) {
		this.numEchdeplacer = numEchdeplacer;
	}
	public String getEveEnCours() {
		return eveEnCours;
	}
	public void setEveEnCours(String eveEnCours) {
		this.eveEnCours = eveEnCours;
	}
	public Set<PayementEcheanceDTO> getPayementEcheances() {
		return payementEcheances;
	}
	public void setPayementEcheances(Set<PayementEcheanceDTO> payementEcheances) {
		this.payementEcheances = payementEcheances;
	}
	public Set<EcheanceCommissionDTO> getListComEcheance() {
		return listComEcheance;
	}
	public void setListComEcheance(Set<EcheanceCommissionDTO> listComEcheance) {
		this.listComEcheance = listComEcheance;
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	
	
}
