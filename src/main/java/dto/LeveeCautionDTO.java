package dto;

import com.afrikbrain.banque.corebanking.engagement.caution.entities.LeveeCaution;

import java.io.Serializable;
import java.util.Date;

public class LeveeCautionDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String reference;
	private Date date;
	private String motif;
	private CautionDTOmin caution;
	private Double montant;
	private Double commissions;
	private Double taxes;
	private String extournerGaranties;
	private Double montantGarantieAExtourner;
	private String etat;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agenceSaisi;
	private CompteDTOmin compteClient;
	
	public void toDTO(LeveeCaution leveeCaution){
		setId(leveeCaution.getId());
		setVersion(leveeCaution.getVersion());
		setReference(leveeCaution.getReference());
		setDate(leveeCaution.getDate());
		setMotif(leveeCaution.getMotif());
		setMontant(leveeCaution.getMontant());
		setCommissions(leveeCaution.getCommissions());
		setTaxes(leveeCaution.getTaxes());
		setExtournerGaranties(leveeCaution.getExtournerGaranties().toString());
		setMontantGarantieAExtourner(leveeCaution.getMontantGarantieAExtourner());
		setEtat(leveeCaution.getEtat().toString());
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
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
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
	public String getExtournerGaranties() {
		return extournerGaranties;
	}
	public void setExtournerGaranties(String extournerGaranties) {
		this.extournerGaranties = extournerGaranties;
	}
	public Double getMontantGarantieAExtourner() {
		return montantGarantieAExtourner;
	}
	public void setMontantGarantieAExtourner(Double montantGarantieAExtourner) {
		this.montantGarantieAExtourner = montantGarantieAExtourner;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
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
}
