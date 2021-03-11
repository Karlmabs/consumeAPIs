package dto;

import com.afrikbrain.banque.corebanking.engagement.caution.entities.MiseEnJeuCaution;

import java.io.Serializable;
import java.util.Date;

public class MiseEnJeuCautionDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String reference;
	private Date date;
	private Double montant;
	private String motif;
	private CautionDTOmin caution;
	private Double commissions;
	private Double taxes;
	private GuichetDTOmin guichetBenef;
	private AgenceDTOmin agenceBeneficiaire;
	private String numeroCompteBeneficiaire;
	private String nomBeneficiaire;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agenceSaisi;
	private CompteDTOmin compteClient;
	private CompteDTOmin compteMiseEnJeu;
	private String bank;
	private String agCltBenef;
	
	public void toDTO(MiseEnJeuCaution miseEnJeuCaution){
		setId(miseEnJeuCaution.getId());
		setVersion(miseEnJeuCaution.getVersion());
		setReference(miseEnJeuCaution.getReference());
		setDate(miseEnJeuCaution.getDate());
		setMontant(miseEnJeuCaution.getMontant());
		setMotif(miseEnJeuCaution.getMotif());
		setCommissions(miseEnJeuCaution.getCommissions());
		setTaxes(miseEnJeuCaution.getTaxes());
		setNumeroCompteBeneficiaire(miseEnJeuCaution.getNumeroCompteBeneficiaire());
		setNomBeneficiaire(miseEnJeuCaution.getNomBeneficiaire());
		setBank(miseEnJeuCaution.getBank().toString());
		setAgCltBenef(miseEnJeuCaution.getAgCltBenef().toString());
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
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public CautionDTOmin getCaution() {
		return caution;
	}
	public void setCaution(CautionDTOmin caution) {
		this.caution = caution;
	}
	public Double getCommissions() {
		return commissions;
	}
	public void setCommissions(Double commissions) {
		this.commissions = commissions;
	}
	public Double getTaxes() {
		return taxes;
	}
	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}
	public GuichetDTOmin getGuichetBenef() {
		return guichetBenef;
	}
	public void setGuichetBenef(GuichetDTOmin guichetBenef) {
		this.guichetBenef = guichetBenef;
	}
	public AgenceDTOmin getAgenceBeneficiaire() {
		return agenceBeneficiaire;
	}
	public void setAgenceBeneficiaire(AgenceDTOmin agenceBeneficiaire) {
		this.agenceBeneficiaire = agenceBeneficiaire;
	}
	public String getNumeroCompteBeneficiaire() {
		return numeroCompteBeneficiaire;
	}
	public void setNumeroCompteBeneficiaire(String numeroCompteBeneficiaire) {
		this.numeroCompteBeneficiaire = numeroCompteBeneficiaire;
	}
	public String getNomBeneficiaire() {
		return nomBeneficiaire;
	}
	public void setNomBeneficiaire(String nomBeneficiaire) {
		this.nomBeneficiaire = nomBeneficiaire;
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
	public CompteDTOmin getCompteClient() {
		return compteClient;
	}
	public void setCompteClient(CompteDTOmin compteClient) {
		this.compteClient = compteClient;
	}
	public CompteDTOmin getCompteMiseEnJeu() {
		return compteMiseEnJeu;
	}
	public void setCompteMiseEnJeu(CompteDTOmin compteMiseEnJeu) {
		this.compteMiseEnJeu = compteMiseEnJeu;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAgCltBenef() {
		return agCltBenef;
	}
	public void setAgCltBenef(String agCltBenef) {
		this.agCltBenef = agCltBenef;
	}
}
