package dto;

import com.afrikbrain.banque.corebanking.administration.client.entities.Nationalite;

import java.io.Serializable;

public class NationaliteDTOmin implements Serializable{

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
	public Nationalite toEntity(){
		Nationalite nationalite = new Nationalite();
		nationalite.setId(getId());
		nationalite.setVersion(getVersion());
		nationalite.setCode(getCode());
		return nationalite;
	}
}
