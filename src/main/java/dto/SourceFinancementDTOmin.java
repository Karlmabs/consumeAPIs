package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.SourceFinancement;

import java.io.Serializable;

public class SourceFinancementDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	
	public SourceFinancement toEntity(){
		SourceFinancement sourceFinancement = new SourceFinancement();
		sourceFinancement.setId(getId());
		sourceFinancement.setVersion(getVersion());
		sourceFinancement.setCode(getCode());
		
		return sourceFinancement;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
