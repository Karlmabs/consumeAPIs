package dto;

import com.afrikbrain.banque.corebanking.administration.client.entities.SecteurActivite;

import java.io.Serializable;

public class SecteurActiviteDTOmin implements Serializable{
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
	public SecteurActivite toEntity(){
		SecteurActivite secteurActivite = new SecteurActivite();
		secteurActivite.setId(getId());
		secteurActivite.setVersion(getVersion());
		secteurActivite.setCode(getCode());
		return secteurActivite;
	}
}
