package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.TypeCredit;

import java.io.Serializable;

public class TypeCreditDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	
	public TypeCredit toEntity(){
		TypeCredit typeCredit = new TypeCredit();
		typeCredit.setId(getId());
		typeCredit.setVersion(getVersion());
		typeCredit.setCode(getCode());
		
		return typeCredit;
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
