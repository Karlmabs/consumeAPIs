package dto;

import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.Devise;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeviseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String codeISO;
	private String libelle;
	private List<Long> idCoupureDevise = new ArrayList<Long>();
	
	public void toDTO(Devise devise){
		setId(devise.getId());
		setCode(devise.getCode());
		setCodeISO(devise.getCodeISO());
		setLibelle(devise.getLibelle());
	}
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
	public String getCodeISO() {
		return codeISO;
	}
	public void setCodeISO(String codeISO) {
		this.codeISO = codeISO;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<Long> getIdCoupureDevise() {
		return idCoupureDevise;
	}
	public void setIdCoupureDevise(List<Long> idCoupureDevise) {
		this.idCoupureDevise = idCoupureDevise;
	}

	
}
