package dto;

import com.afrikbrain.banque.corebanking.administration.comptabilite.entities.Produit;

import java.io.Serializable;

public class ProduitDTOmin implements Serializable{

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
	public Produit toEntity(){
		Produit produit = new Produit();
		produit.setId(getId());
		produit.setVersion(getVersion());
		produit.setCode(getCode());
		return produit;
	}
}
