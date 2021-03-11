package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Deblocage;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.DeblocageParticipant;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Echeance;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Facture;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.EEtatDeblocage;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeblocageDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private UniteBancaireDTOmin unite;
	private DossierCreditDTOmin dossierCredit;
	private Double montantRestant;
	private Double montantDebloquer;
	private String numeroDeblocage;
	private Double teg;
	private Date dateDeblocage;
	private Date datePremEcheance;
	private Date dateDernEcheance;
	private Integer nombreEcheance;
	private Double montantComEng;
	private Double montantTaxeComEng;
	private Integer nombreDiffere;
	private Double interetDiffere;
	private Double taxeDiffere;
	private String domiciliationCompte;
	private String fusion;
	private String etat;
	private String etatAvant;
	private String deblocagesFusion;
	private Double capitalFusion;
	private Double interetCourusFusion;
	private Double taxeCourusFusion;
	private Double interetDiffereFusion;
	private Double taxeDiffereFusion;
	private Double comEngFusion;
	private Double taxeComEngFusion;
	private Double capitalImpayeFusion;
	private Double interetRetardFusion;
	private Double taxeRetardFusion;
	private String deblocageFacture;
	private String motif;
	private List<EcheanceDTOmin> echeances = new ArrayList<>();
	private CompteDTOmin compteFournisseur;
	private List<FactureDTOmin> factures = new ArrayList<>();
	private List<EcheanceDTOmin> echeancesTeteFile = new ArrayList<>();
	private List<DeblocageParticipantDTOmin> deblocageParticipants = new ArrayList<>();
	private Long anticipeId;
	
	public Deblocage toEntity(){
		Deblocage deblocage =  new Deblocage();
		deblocage.setId(getId());
		deblocage.setVersion(getVersion());
		deblocage.setUnite(getUnite().toEntity());
		deblocage.setDossierCredit(getDossierCredit().toEntity());
		deblocage.setMontantRestant(getMontantRestant());
		deblocage.setMontantDebloquer(getMontantDebloquer());
		deblocage.setNumeroDeblocage(getNumeroDeblocage());
		deblocage.setTeg(getTeg());
		deblocage.setDateDeblocage(getDateDeblocage());
		deblocage.setDatePremEcheance(getDatePremEcheance());
		deblocage.setDateDernEcheance(getDateDernEcheance());
		deblocage.setNombreEcheance(getNombreEcheance());
		deblocage.setMontantComEng(getMontantComEng());
		deblocage.setMontantTaxeComEng(getMontantTaxeComEng());
		deblocage.setNombreDiffere(getNombreDiffere());
		deblocage.setInteretDiffere(getInteretDiffere());
		deblocage.setTaxeDiffere(getTaxeDiffere());
		deblocage.setDomiciliationCompte(getDomiciliationCompte());
		deblocage.setFusion(EYesNo.valueOf(getFusion()));
		deblocage.setEtat(EEtatDeblocage.valueOf(getEtat()));
		deblocage.setEtatAvant(EEtatDeblocage.valueOf(getEtatAvant()));
		deblocage.setDeblocagesFusion(getDeblocagesFusion());
		deblocage.setCapitalFusion(getCapitalFusion());
		deblocage.setInteretCourusFusion(getInteretCourusFusion());
		deblocage.setTaxeCourusFusion(getTaxeCourusFusion());
		deblocage.setInteretDiffereFusion(getInteretDiffereFusion());
		deblocage.setTaxeDiffereFusion(getTaxeDiffereFusion());
		deblocage.setComEngFusion(getComEngFusion());
		deblocage.setTaxeComEngFusion(getTaxeComEngFusion());
		deblocage.setCapitalImpayeFusion(getCapitalImpayeFusion());
		deblocage.setInteretRetardFusion(getInteretRetardFusion());
		deblocage.setTaxeRetardFusion(getTaxeRetardFusion());
		deblocage.setDeblocageFacture(EYesNo.valueOf(getDeblocageFacture()));
		deblocage.setMotif(getMotif());
		List<Echeance> echeanceList = new ArrayList<>();
		List<Facture> factureList = new ArrayList<>();
		List<Echeance> echeancesTeteFileList = new ArrayList<>();
		List<DeblocageParticipant> deblocageParticipantList = new ArrayList<>();
		
		for(EcheanceDTOmin temp : getEcheances()){
			echeanceList.add(temp.toEntity());
		}
		for(FactureDTOmin temp : getFactures()){
			factureList.add(temp.toEntity());
		}
		for(EcheanceDTOmin temp : getEcheancesTeteFile()){
			echeancesTeteFileList.add(temp.toEntity());
		}
		for(DeblocageParticipantDTOmin temp : getDeblocageParticipants()){
			deblocageParticipantList.add(temp.toEntity());
		}
		deblocage.setEcheances(echeanceList);
		deblocage.setFactures(factureList);
		deblocage.setEcheancesTeteFile(echeancesTeteFileList);
		deblocage.setDeblocageParticipants(deblocageParticipantList);
		deblocage.setCompteFournisseur(getCompteFournisseur().toEntity());
		deblocage.setAnticipeId(getAnticipeId());
		
		return deblocage;
	}
	
	public void toDTO(Deblocage deblocage){
		setId(deblocage.getId());
		setVersion(deblocage.getVersion());
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
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}
	public DossierCreditDTOmin getDossierCredit() {
		return dossierCredit;
	}
	public void setDossierCredit(DossierCreditDTOmin dossierCredit) {
		this.dossierCredit = dossierCredit;
	}
	public Double getMontantRestant() {
		return montantRestant;
	}
	public void setMontantRestant(Double montantRestant) {
		this.montantRestant = montantRestant;
	}
	public Double getMontantDebloquer() {
		return montantDebloquer;
	}
	public void setMontantDebloquer(Double montantDebloquer) {
		this.montantDebloquer = montantDebloquer;
	}
	public String getNumeroDeblocage() {
		return numeroDeblocage;
	}
	public void setNumeroDeblocage(String numeroDeblocage) {
		this.numeroDeblocage = numeroDeblocage;
	}
	public Double getTeg() {
		return teg;
	}
	public void setTeg(Double teg) {
		this.teg = teg;
	}
	public Date getDateDeblocage() {
		return dateDeblocage;
	}
	public void setDateDeblocage(Date dateDeblocage) {
		this.dateDeblocage = dateDeblocage;
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
	public Integer getNombreEcheance() {
		return nombreEcheance;
	}
	public void setNombreEcheance(Integer nombreEcheance) {
		this.nombreEcheance = nombreEcheance;
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
	public Integer getNombreDiffere() {
		return nombreDiffere;
	}
	public void setNombreDiffere(Integer nombreDiffere) {
		this.nombreDiffere = nombreDiffere;
	}
	public Double getInteretDiffere() {
		return interetDiffere;
	}
	public void setInteretDiffere(Double interetDiffere) {
		this.interetDiffere = interetDiffere;
	}
	public Double getTaxeDiffere() {
		return taxeDiffere;
	}
	public void setTaxeDiffere(Double taxeDiffere) {
		this.taxeDiffere = taxeDiffere;
	}
	public String getDomiciliationCompte() {
		return domiciliationCompte;
	}
	public void setDomiciliationCompte(String domiciliationCompte) {
		this.domiciliationCompte = domiciliationCompte;
	}
	public String getFusion() {
		return fusion;
	}
	public void setFusion(String fusion) {
		this.fusion = fusion;
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
	public String getDeblocagesFusion() {
		return deblocagesFusion;
	}
	public void setDeblocagesFusion(String deblocagesFusion) {
		this.deblocagesFusion = deblocagesFusion;
	}
	public Double getCapitalFusion() {
		return capitalFusion;
	}
	public void setCapitalFusion(Double capitalFusion) {
		this.capitalFusion = capitalFusion;
	}
	public Double getInteretCourusFusion() {
		return interetCourusFusion;
	}
	public void setInteretCourusFusion(Double interetCourusFusion) {
		this.interetCourusFusion = interetCourusFusion;
	}
	public Double getTaxeCourusFusion() {
		return taxeCourusFusion;
	}
	public void setTaxeCourusFusion(Double taxeCourusFusion) {
		this.taxeCourusFusion = taxeCourusFusion;
	}
	public Double getInteretDiffereFusion() {
		return interetDiffereFusion;
	}
	public void setInteretDiffereFusion(Double interetDiffereFusion) {
		this.interetDiffereFusion = interetDiffereFusion;
	}
	public Double getTaxeDiffereFusion() {
		return taxeDiffereFusion;
	}
	public void setTaxeDiffereFusion(Double taxeDiffereFusion) {
		this.taxeDiffereFusion = taxeDiffereFusion;
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
	public Double getCapitalImpayeFusion() {
		return capitalImpayeFusion;
	}
	public void setCapitalImpayeFusion(Double capitalImpayeFusion) {
		this.capitalImpayeFusion = capitalImpayeFusion;
	}
	public Double getInteretRetardFusion() {
		return interetRetardFusion;
	}
	public void setInteretRetardFusion(Double interetRetardFusion) {
		this.interetRetardFusion = interetRetardFusion;
	}
	public Double getTaxeRetardFusion() {
		return taxeRetardFusion;
	}
	public void setTaxeRetardFusion(Double taxeRetardFusion) {
		this.taxeRetardFusion = taxeRetardFusion;
	}
	public String getDeblocageFacture() {
		return deblocageFacture;
	}
	public void setDeblocageFacture(String deblocageFacture) {
		this.deblocageFacture = deblocageFacture;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public List<EcheanceDTOmin> getEcheances() {
		return echeances;
	}
	public void setEcheances(List<EcheanceDTOmin> echeances) {
		this.echeances = echeances;
	}
	public CompteDTOmin getCompteFournisseur() {
		return compteFournisseur;
	}
	public void setCompteFournisseur(CompteDTOmin compteFournisseur) {
		this.compteFournisseur = compteFournisseur;
	}
	public List<FactureDTOmin> getFactures() {
		return factures;
	}
	public void setFactures(List<FactureDTOmin> factures) {
		this.factures = factures;
	}
	public List<EcheanceDTOmin> getEcheancesTeteFile() {
		return echeancesTeteFile;
	}
	public void setEcheancesTeteFile(List<EcheanceDTOmin> echeancesTeteFile) {
		this.echeancesTeteFile = echeancesTeteFile;
	}
	public List<DeblocageParticipantDTOmin> getDeblocageParticipants() {
		return deblocageParticipants;
	}
	public void setDeblocageParticipants(List<DeblocageParticipantDTOmin> deblocageParticipants) {
		this.deblocageParticipants = deblocageParticipants;
	}
	public Long getAnticipeId() {
		return anticipeId;
	}
	public void setAnticipeId(Long anticipeId) {
		this.anticipeId = anticipeId;
	}
	
	
	
}
