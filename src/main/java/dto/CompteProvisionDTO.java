package dto;

import com.afrikbrain.banque.corebanking.administration.client.entities.CategorieInterne;
import com.afrikbrain.banque.corebanking.engagement.credit.declassement.entities.CompteProvision;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.List;

public class CompteProvisionDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String codeCategorie;
	private String cpteDotationNational;
	private String cpteDotationDevise;
	private String cpteRepriseNational;
	private String cpteRepriseDevise;
	
	public CompteProvision toEntity() throws Exception{
		initContext();
		CompteProvision compteProvision = new CompteProvision();
		compteProvision.setId(getId());
		List<CategorieInterne> categorieList = administrationBean.findParametre(CategorieInterne.class, null, getCodeCategorie(), 0, 1);
		compteProvision.setCategorie(categorieList.get(0));
		compteProvision.setCpteDotationNational(getCpteDotationNational());
		compteProvision.setCpteDotationDevise(getCpteDotationDevise());
		compteProvision.setCpteRepriseNational(getCpteRepriseNational());
		compteProvision.setCpteRepriseDevise(getCpteRepriseDevise());
		
		return compteProvision;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeCategorie() {
		return codeCategorie;
	}
	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}
	public String getCpteDotationNational() {
		return cpteDotationNational;
	}
	public void setCpteDotationNational(String cpteDotationNational) {
		this.cpteDotationNational = cpteDotationNational;
	}
	public String getCpteDotationDevise() {
		return cpteDotationDevise;
	}
	public void setCpteDotationDevise(String cpteDotationDevise) {
		this.cpteDotationDevise = cpteDotationDevise;
	}
	public String getCpteRepriseNational() {
		return cpteRepriseNational;
	}
	public void setCpteRepriseNational(String cpteRepriseNational) {
		this.cpteRepriseNational = cpteRepriseNational;
	}
	public String getCpteRepriseDevise() {
		return cpteRepriseDevise;
	}
	public void setCpteRepriseDevise(String cpteRepriseDevise) {
		this.cpteRepriseDevise = cpteRepriseDevise;
	}

}
