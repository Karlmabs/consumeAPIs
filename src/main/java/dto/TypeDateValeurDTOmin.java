package dto;

import com.afrikbrain.banque.corebanking.administration.structures.entities.TypeDateValeur;

import java.io.Serializable;

public class TypeDateValeurDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	
	public TypeDateValeur toEntity(){
		TypeDateValeur typeDateValeur = new TypeDateValeur();
		typeDateValeur.setId(getId());
		typeDateValeur.setVersion(getVersion());
		typeDateValeur.setCode(getCode());
		
		return typeDateValeur;
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
