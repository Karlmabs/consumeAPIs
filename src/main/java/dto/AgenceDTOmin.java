package dto;

import com.afrikbrain.banque.corebanking.administration.structures.entities.Agence;

import java.io.Serializable;

public class AgenceDTOmin implements Serializable{
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
	public Agence toEntity(){
		Agence agence = new Agence();
		agence.setId(getId());
		agence.setVersion(getVersion());
		agence.setCode(getCode());
		return agence;
	}
}
