package dto;

import com.afrikbrain.banque.corebanking.administration.client.entities.Client;
import com.afrikbrain.banque.corebanking.administration.structures.entities.Agence;
import com.afrikbrain.banque.corebanking.engagement.credit.declassement.EEtatDeclassement;
import com.afrikbrain.banque.corebanking.engagement.credit.declassement.entities.AgeCreance;
import com.afrikbrain.banque.corebanking.engagement.credit.declassement.entities.Declassement;
import com.afrikbrain.util.persistence.utils.dao.tools.LoaderModeContainer;
import org.hibernate.FetchMode;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DeclassementDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String codeAgence;
	private String codeClient;
	private Long idAgeCreance;
	private Double soldeCompte;
	private Double soldeCredit;
	private Double montantDeclasse;
	private Double montantGarantie;
	private Double montantProvisionCompte;
	private Double montantProvisionCredit;
	private Double montantProvision;
	private String etat;
	private String userSaisi;
	private Date dateSaisie;
	
	public Declassement toEntity() throws Exception{
		initContext();
		Declassement declassement = new Declassement();
		Agence agence = administrationBean.findAgenceByCode(getCodeAgence());
		LoaderModeContainer loader = LoaderModeContainer.getInstance();
        loader.add("unite", FetchMode.JOIN);
		List<Client> clientList = administrationBean.findClient(null, getCodeClient(), null, loader, 0, 1);
		Client client = null;
		if(!clientList.isEmpty()){
			client = clientList.get(0);
		}
		AgeCreance ageCreance = administrationBean.findParametre(AgeCreance.class, getIdAgeCreance());
		
		declassement.setId(getId());
		declassement.setAgence(agence);
		declassement.setClient(client);
		declassement.setAgeCreance(ageCreance);
		declassement.setSoldeCompte(getSoldeCompte());
		declassement.setSoldeCredit(getSoldeCredit());
		declassement.setMontantDeclasse(getMontantDeclasse());
		declassement.setMontantGarantie(declassement.getMontantGarantie());
		declassement.setMontantProvCpte(getMontantProvisionCompte());
		declassement.setMontantProvCredit(getMontantProvisionCredit());
		declassement.setMontantProvision(getMontantProvision());
		declassement.setEtat(EEtatDeclassement.valueOf(getEtat()));
		declassement.setUserSaisi(getUserSaisi());
		declassement.setDateSaisie(getDateSaisie());
		
		return declassement;
		
	}
	public void toDTO(Declassement declassement){
		setId(declassement.getId());
		setCodeAgence(declassement.getAgence().getCode());
		setCodeClient(declassement.getClient().getCode());
		setIdAgeCreance(declassement.getAgeCreance().getId());
		setSoldeCompte(declassement.getSoldeCompte());
		setSoldeCredit(declassement.getSoldeCredit());
		setMontantDeclasse(declassement.getMontantDeclasse());
		setMontantGarantie(declassement.getMontantGarantie());
		setMontantProvisionCompte(declassement.getMontantProvCpte());
		setMontantProvisionCredit(declassement.getMontantProvCredit());
		setMontantProvision(declassement.getMontantProvision());
		setEtat(declassement.getEtat().toString());
		setUserSaisi(declassement.getUserSaisi());
		setDateSaisie(declassement.getDateSaisie());
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeAgence() {
		return codeAgence;
	}

	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}

	public String getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}
	
	public Long getIdAgeCreance() {
		return idAgeCreance;
	}
	public void setIdAgeCreance(Long idAgeCreance) {
		this.idAgeCreance = idAgeCreance;
	}
	public Double getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(Double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	public Double getSoldeCredit() {
		return soldeCredit;
	}
	public void setSoldeCredit(Double soldeCredit) {
		this.soldeCredit = soldeCredit;
	}
	public Double getMontantDeclasse() {
		return montantDeclasse;
	}
	public void setMontantDeclasse(Double montantDeclasse) {
		this.montantDeclasse = montantDeclasse;
	}
	public Double getMontantGarantie() {
		return montantGarantie;
	}
	public void setMontantGarantie(Double montantGarantie) {
		this.montantGarantie = montantGarantie;
	}
	public Double getMontantProvisionCompte() {
		return montantProvisionCompte;
	}
	public void setMontantProvisionCompte(Double montantProvisionCompte) {
		this.montantProvisionCompte = montantProvisionCompte;
	}
	public Double getMontantProvisionCredit() {
		return montantProvisionCredit;
	}
	public void setMontantProvisionCredit(Double montantProvisionCredit) {
		this.montantProvisionCredit = montantProvisionCredit;
	}
	public Double getMontantProvision() {
		return montantProvision;
	}
	public void setMontantProvision(Double montantProvision) {
		this.montantProvision = montantProvision;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getUserSaisi() {
		return userSaisi;
	}
	public void setUserSaisi(String userSaisi) {
		this.userSaisi = userSaisi;
	}
	public Date getDateSaisie() {
		return dateSaisie;
	}
	public void setDateSaisie(Date dateSaisie) {
		this.dateSaisie = dateSaisie;
	}
	
	
}
