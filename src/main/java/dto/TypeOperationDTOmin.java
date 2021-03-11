package dto;

import com.afrikbrain.banque.corebanking.administration.typeoperation.entities.TypeOperation;

import java.io.Serializable;

public class TypeOperationDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
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
	public TypeOperation toEntity(){
		TypeOperation typeOperation = new TypeOperation();
		typeOperation.setId(getId());
		typeOperation.setVersion(getVersion());
		typeOperation.setCode(getCode());
		return typeOperation;
	}
}
