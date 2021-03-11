package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Deblocage;

import java.io.Serializable;

public class DeblocageDTOmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	
	public Deblocage toEntity(){
		Deblocage deblocage = new Deblocage();
		deblocage.setId(getId());
		deblocage.setVersion(getVersion());
		
		return deblocage;
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
