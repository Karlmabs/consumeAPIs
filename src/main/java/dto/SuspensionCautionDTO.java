package dto;

import com.afrikbrain.banque.corebanking.engagement.caution.entities.SuspensionCaution;

import java.io.Serializable;
import java.util.Date;

public class SuspensionCautionDTO implements Serializable{

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
	private Double commissions;
	private Double taxes;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agenceSaisi;
	private CompteDTOmin compteClient;
	
	public void toDTO(SuspensionCaution suspensionCaution){
		setId(suspensionCaution.getId());
		setVersion(suspensionCaution.getVersion());
		setReference(suspensionCaution.getReference());
		setDate(suspensionCaution.getDate());
		setMotif(suspensionCaution.getMotif());
		setCommissions(suspensionCaution.getCommissions());
		setTaxes(suspensionCaution.getTaxes());
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
