package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.Garant;

import java.io.Serializable;

public class GarantDTOmin implements Serializable{

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
	public Garant toEntity(){
		Garant garant = new Garant();
		garant.setId(getId());
		garant.setVersion(getVersion());
		garant.setCode(getCode());
		return garant;
	}
}
