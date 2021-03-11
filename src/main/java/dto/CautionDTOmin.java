package dto;

import com.afrikbrain.banque.corebanking.engagement.caution.entities.Caution;

import java.io.Serializable;

public class CautionDTOmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String numeroDossier;
	
	public Caution toEntity(){
		Caution caution = new Caution();
		caution.setId(getId());
		caution.setVersion(getVersion());
		caution.setNumeroDossier(getNumeroDossier());
		
		return caution;
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
	public String getNumeroDossier() {
		return numeroDossier;
	}
	public void setNumeroDossier(String numeroDossier) {
		this.numeroDossier = numeroDossier;
	}
	
	
}
