package dto;

import com.afrikbrain.banque.corebanking.administration.client.entities.Parametre;

import java.io.Serializable;

public class ParametreDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String libelle;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public void toDto(Parametre parametre){
		setId(parametre.getId());
		setCode(parametre.getCode());
		setLibelle(parametre.getLibelle());
	}
}
