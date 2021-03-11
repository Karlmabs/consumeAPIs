package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.comite.entities.NiveauComite;

import java.io.Serializable;

public class NiveauComiteDTOmin implements Serializable{

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
	public NiveauComite toEntity(){
		NiveauComite niveauComite = new NiveauComite();
		niveauComite.setId(getId());
		niveauComite.setVersion(getVersion());
		niveauComite.setCode(getCode());
		return niveauComite;
	}
}
