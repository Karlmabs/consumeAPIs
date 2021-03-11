package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.ParticipationBanquePret;

import java.io.Serializable;

public class ParticipationBanquePretDTOmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	
	public ParticipationBanquePret toEntity(){
		ParticipationBanquePret participationBanquePret = new ParticipationBanquePret();
		participationBanquePret.setId(getId());
		participationBanquePret.setVersion(getVersion());
		
		return participationBanquePret;
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
