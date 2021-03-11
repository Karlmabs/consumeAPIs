package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.LienTypDoc;

import java.io.Serializable;

public class LienTypDocDTOmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	
	public LienTypDoc toEntity(){
		LienTypDoc lienTypDoc = new LienTypDoc();
		lienTypDoc.setId(getId());
		lienTypDoc.setVersion(getVersion());
		
		return lienTypDoc;
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
}
