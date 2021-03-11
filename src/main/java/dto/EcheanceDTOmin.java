package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Echeance;

import java.io.Serializable;

public class EcheanceDTOmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
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
	
	public Echeance toEntity(){
		Echeance echeance = new Echeance();
		echeance.setId(getId());
		echeance.setVersion(getVersion());
		return echeance;
	}
}
