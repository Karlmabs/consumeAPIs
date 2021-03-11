package dto;

import com.afrikbrain.banque.corebanking.administration.comptabilite.entities.PlanCompte;

import java.io.Serializable;

public class PlanCompteDTOmin implements Serializable{

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
	public PlanCompte toEntity(){
		PlanCompte planCompte = new PlanCompte();
		planCompte.setId(getId());
		planCompte.setVersion(getVersion());
		planCompte.setCode(getCode());
		return planCompte;
	}
}
