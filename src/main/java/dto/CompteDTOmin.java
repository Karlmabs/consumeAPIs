package dto;

import com.afrikbrain.banque.corebanking.administration.compte.entities.Compte;

import java.io.Serializable;

public class CompteDTOmin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String numeroCompte;
	private String cleCompte;
	
	public Compte toEntity(){
		Compte compte = new Compte();
		compte.setId(getId());
		compte.setVersion(getVersion());
		compte.setNumeroCompte(getNumeroCompte());
		compte.setCleCompte(getCleCompte());
		
		return compte;
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

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getCleCompte() {
		return cleCompte;
	}

	public void setCleCompte(String cleCompte) {
		this.cleCompte = cleCompte;
	}
	
}
