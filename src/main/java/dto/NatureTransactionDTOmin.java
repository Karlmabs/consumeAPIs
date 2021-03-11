package dto;

import com.afrikbrain.banque.corebanking.administration.typeoperation.entities.NatureTransaction;

import java.io.Serializable;

public class NatureTransactionDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	
	public NatureTransaction toEntity(){
		NatureTransaction natureTransaction = new NatureTransaction();
		natureTransaction.setId(getId());
		natureTransaction.setVersion(getVersion());
		natureTransaction.setCode(getCode());
		
		return natureTransaction;
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
