package dto;

import com.afrikbrain.banque.corebanking.administration.client.entities.Profession;

import java.io.Serializable;

public class ProfessionDTOmin implements Serializable{

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
	public Profession toEntity(){
		Profession profession = new Profession();
		profession.setId(getId());
		profession.setVersion(getVersion());
		profession.setCode(getCode());
		return profession;
	}
}
