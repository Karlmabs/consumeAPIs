package dto;

import java.io.Serializable;
import java.util.Date;

public class FindListDocumentDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codeUnite;
	private String codeAgence;
	private String reference;
	private String code;
	private String libTypDoc;
	private Date dateCreation;
	private int firstResult; 
	private int maxResult;
	public String getCodeUnite() {
		return codeUnite;
	}
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}
	
	public String getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibTypDoc() {
		return libTypDoc;
	}
	public void setLibTypDoc(String libTypDoc) {
		this.libTypDoc = libTypDoc;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
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
