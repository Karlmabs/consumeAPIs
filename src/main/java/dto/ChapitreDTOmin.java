package dto;

import com.afrikbrain.banque.corebanking.administration.comptabilite.entities.Chapitre;

import java.io.Serializable;

public class ChapitreDTOmin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
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
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Chapitre toEntity(){
		Chapitre chapitre = new Chapitre();
		chapitre.setId(getId());
		chapitre.setVersion(getVersion());
		chapitre.setCode(getCode());
		return chapitre;
	}
}
