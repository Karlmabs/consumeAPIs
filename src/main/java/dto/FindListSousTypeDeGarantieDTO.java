package dto;

import java.io.Serializable;

public class FindListSousTypeDeGarantieDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codeUniteBancaire;
	private String code; 
	private String libelle;
	private String codeTypeGarantie; 
	private String libelleTypeGarantie; 
	private String LibDoc;
	private int firstResult;
	private int maxResult;
	public String getCodeUniteBancaire() {
		return codeUniteBancaire;
	}
	public void setCodeUniteBancaire(String codeUniteBancaire) {
		this.codeUniteBancaire = codeUniteBancaire;
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
	public String getCodeTypeGarantie() {
		return codeTypeGarantie;
	}
	public void setCodeTypeGarantie(String codeTypeGarantie) {
		this.codeTypeGarantie = codeTypeGarantie;
	}
	public String getLibelleTypeGarantie() {
		return libelleTypeGarantie;
	}
	public void setLibelleTypeGarantie(String libelleTypeGarantie) {
		this.libelleTypeGarantie = libelleTypeGarantie;
	}
	public String getLibDoc() {
		return LibDoc;
	}
	public void setLibDoc(String libDoc) {
		LibDoc = libDoc;
	}
	public int getFirstResult() {
		return firstResult;
	}
	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}
	public int getMaxResult() {
		return maxResult;
	}
	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}
	
	
}
