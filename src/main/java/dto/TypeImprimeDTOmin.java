package dto;

import com.afrikbrain.banque.corebanking.administration.imprime.entities.TypeImprime;

import java.io.Serializable;

public class TypeImprimeDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	
	public TypeImprime toEntity(){
		TypeImprime typeImprime = new TypeImprime();
		typeImprime.setId(getId());
		typeImprime.setVersion(getVersion());
		typeImprime.setCode(getCode());
		
		return typeImprime;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
