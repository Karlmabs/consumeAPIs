package dto;

import java.io.Serializable;

public class UpdateDossierCreditDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DossierCreditDTO dcred;
	private boolean extourne;
	private Double monExtourne;
	private TypeOperationDTO typopeExtourne;
	private TypeOperationDTO typope;
	private boolean rejeux;
	public DossierCreditDTO getDcred() {
		return dcred;
	}
	public void setDcred(DossierCreditDTO dcred) {
		this.dcred = dcred;
	}
	public boolean isExtourne() {
		return extourne;
	}
	public void setExtourne(boolean extourne) {
		this.extourne = extourne;
	}
	public Double getMonExtourne() {
		return monExtourne;
	}
	public void setMonExtourne(Double monExtourne) {
		this.monExtourne = monExtourne;
	}
	public TypeOperationDTO getTypopeExtourne() {
		return typopeExtourne;
	}
	public void setTypopeExtourne(TypeOperationDTO typopeExtourne) {
		this.typopeExtourne = typopeExtourne;
	}
	public TypeOperationDTO getTypope() {
		return typope;
	}
	public void setTypope(TypeOperationDTO typope) {
		this.typope = typope;
	}
	public boolean isRejeux() {
		return rejeux;
	}
	public void setRejeux(boolean rejeux) {
		this.rejeux = rejeux;
	}
	
	
	
}
