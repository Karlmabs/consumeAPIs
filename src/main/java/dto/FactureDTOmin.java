package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Facture;

import java.io.Serializable;

public class FactureDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String reference;
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
	public Facture toEntity(){
		Facture facture = new Facture();
		facture.setId(getId());
		facture.setVersion(getVersion());
		return facture;
	}
}
