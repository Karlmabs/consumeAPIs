package dto;

import com.afrikbrain.banque.corebanking.administration.typeoperation.entities.ChapitreOperation;

import java.io.Serializable;

public class ChapitreOperationDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	
	public ChapitreOperation toEntity(){
		ChapitreOperation chapitreOperation = new ChapitreOperation();
		chapitreOperation.setId(getId());
		chapitreOperation.setVersion(getVersion());
		
		return chapitreOperation;
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
