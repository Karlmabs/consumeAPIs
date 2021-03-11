package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.DeblocageParticipant;

import java.io.Serializable;

public class DeblocageParticipantDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	
	public DeblocageParticipant toEntity(){
		DeblocageParticipant deblocageParticipant = new DeblocageParticipant();
		deblocageParticipant.setId(getId());
		deblocageParticipant.setVersion(getVersion());
		
		return deblocageParticipant;
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
