package dto;

import com.afrikbrain.banque.corebanking.administration.typeoperation.entities.OppositionOperation;

import java.io.Serializable;

public class OppositionOperationDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	
	public OppositionOperation toEntity(){
		OppositionOperation oppositionOperation = new OppositionOperation();
		oppositionOperation.setId(getId());
		oppositionOperation.setVersion(getVersion());
		
		return oppositionOperation;
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
