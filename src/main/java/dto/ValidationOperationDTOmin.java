package dto;

import com.afrikbrain.banque.corebanking.administration.typeoperation.entities.ValidationOperation;

import java.io.Serializable;

public class ValidationOperationDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private Integer niveau;
	
	public ValidationOperation toEntity(){
		ValidationOperation validationOperation = new ValidationOperation();
		validationOperation.setId(getId());
		validationOperation.setVersion(getVersion());
		validationOperation.setNiveau(getNiveau());
		
		return validationOperation;
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
	public Integer getNiveau() {
		return niveau;
	}
	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}
	
}
