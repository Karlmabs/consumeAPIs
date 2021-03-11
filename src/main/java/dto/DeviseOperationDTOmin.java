package dto;

import com.afrikbrain.banque.corebanking.administration.typeoperation.entities.DeviseOperation;

import java.io.Serializable;

public class DeviseOperationDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	
	public DeviseOperation toEntity(){
		DeviseOperation deviseOperation = new DeviseOperation();
		deviseOperation.setId(getId());
		deviseOperation.setVersion(getVersion());
		
		return deviseOperation;
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
