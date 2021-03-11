package dto;

import com.afrikbrain.banque.corebanking.engagement.credit.declassement.ENatureClientDouteux;
import com.afrikbrain.banque.corebanking.engagement.credit.declassement.ENatureProvision;
import com.afrikbrain.banque.corebanking.engagement.credit.declassement.entities.CompteDeclasse;
import com.afrikbrain.banque.corebanking.engagement.credit.declassement.entities.CreditDeclasse;
import com.afrikbrain.banque.corebanking.engagement.credit.declassement.entities.Declassement;
import com.afrikbrain.banque.corebanking.engagement.credit.declassement.entities.Provision;
import com.afrikbrain.util.enumeration.EYesNo;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.Date;

public class ProvisionDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String idDeclassement;
	private String nature;
	private String type;
	private Long idCompteDeclasse;
	private Long idCreditDeclasse;
	private String valide;
	private Double pourcentage;
	private Double montant;
	private String motif;
	private String userSaisi;
	private Date dateSaisie;
	private Date dateCptable;
	private Double montantDeclasse;
	private Double totalProvision;
	private Integer tauxProvision;
	private Integer ancienTauxProvision;
	
	public Provision toEntity() throws Exception{
		initContext();
		Provision provision = new Provision();
		Declassement declassement = administrationBean.findByPrimaryKey(Declassement.class, getIdDeclassement(), null);
		CompteDeclasse compteDeclasse = administrationBean.findByPrimaryKey(CompteDeclasse.class, getIdCompteDeclasse(), null);
		CreditDeclasse creditDeclasse = administrationBean.findByPrimaryKey(CreditDeclasse.class, getIdCreditDeclasse(), null);
		provision.setId(getId());
		provision.setDeclassement(declassement);
		provision.setNature(ENatureProvision.valueOf(getNature()));
		provision.setType(ENatureClientDouteux.valueOf(getType()));
		provision.setCompte(compteDeclasse);
		provision.setCredit(creditDeclasse);
		provision.setValide(EYesNo.valueOf(getValide()));
		provision.setPourcentage(getPourcentage());
		provision.setMontant(getMontant());
		provision.setMotif(getMotif());
		provision.setUserSaisi(getUserSaisi());
		provision.setDateSaisie(getDateSaisie());
		provision.setDateCptable(getDateCptable());
		provision.setMontantDeclasse(getMontantDeclasse());
		provision.setTotalProvision(getTotalProvision());
		provision.setTauxProvision(getTauxProvision());
		provision.setAncienTauxProvision(getAncienTauxProvision());
		
		return provision;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdDeclassement() {
		return idDeclassement;
	}
	public void setIdDeclassement(String idDeclassement) {
		this.idDeclassement = idDeclassement;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getIdCompteDeclasse() {
		return idCompteDeclasse;
	}
	public void setIdCompteDeclasse(Long idCompteDeclasse) {
		this.idCompteDeclasse = idCompteDeclasse;
	}
	public Long getIdCreditDeclasse() {
		return idCreditDeclasse;
	}
	public void setIdCreditDeclasse(Long idCreditDeclasse) {
		this.idCreditDeclasse = idCreditDeclasse;
	}
	public String getValide() {
		return valide;
	}
	public void setValide(String valide) {
		this.valide = valide;
	}
	public Double getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
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
	public Date getDateCptable() {
		return dateCptable;
	}
	public void setDateCptable(Date dateCptable) {
		this.dateCptable = dateCptable;
	}
	public Double getMontantDeclasse() {
		return montantDeclasse;
	}
	public void setMontantDeclasse(Double montantDeclasse) {
		this.montantDeclasse = montantDeclasse;
	}
	public Double getTotalProvision() {
		return totalProvision;
	}
	public void setTotalProvision(Double totalProvision) {
		this.totalProvision = totalProvision;
	}
	public Integer getTauxProvision() {
		return tauxProvision;
	}
	public void setTauxProvision(Integer tauxProvision) {
		this.tauxProvision = tauxProvision;
	}
	public Integer getAncienTauxProvision() {
		return ancienTauxProvision;
	}
	public void setAncienTauxProvision(Integer ancienTauxProvision) {
		this.ancienTauxProvision = ancienTauxProvision;
	}

}
