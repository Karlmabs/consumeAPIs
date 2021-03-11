package dto;

import com.afrikbrain.banque.corebanking.administration.structures.entities.Pays;

import java.io.Serializable;

public class PaysDTOmin implements Serializable{

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
	public Pays toEntity(){
		Pays pays = new Pays();
		pays.setId(getId());
		pays.setVersion(getVersion());
		pays.setCode(getCode());
		return pays;
	}
}
