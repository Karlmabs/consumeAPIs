package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.ZoneLibre;

import java.io.Serializable;

public class ZoneLibreDTOmin implements Serializable{

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
	public ZoneLibre toEntity(){
		ZoneLibre zoneLibre = new ZoneLibre();
		zoneLibre.setId(getId());
		zoneLibre.setVersion(getVersion());
		zoneLibre.setCode(getCode());
		return zoneLibre;
	}
}
