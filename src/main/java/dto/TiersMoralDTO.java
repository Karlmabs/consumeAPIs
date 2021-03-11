package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.TiersMoral;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.ETypeTiers;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;
import java.util.Date;

public class TiersMoralDTO extends TiersDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String raisonSociale;
	private String numeroRegistreCommerce;
	private SecteurActiviteDTOmin secteurActivite;
	private Date dateCreation;
	private String lieuCreation;
	private String fax;
	private String etabFinancier;
	private PaysDTOmin siegeSocial;
	
	public TiersMoral toEntity(){
		TiersMoral tiersMoral = new TiersMoral();
		
		tiersMoral.setId(getId());
		tiersMoral.setVersion(getVersion());
		tiersMoral.setCode(getCode());
		tiersMoral.setIntitule(getIntitule());
		tiersMoral.setUnite(getUnite().toEntity());
		tiersMoral.setAgence(getAgence().toEntity());
		tiersMoral.setType(ETypeTiers.valueOf(getType()));
		tiersMoral.setTelephone(getTelephone());
		tiersMoral.setAdresse(getAdresse());
		tiersMoral.setCommentaire(getCommentaire());
		tiersMoral.setSuspendu(EYesNo.valueOf(getSuspendu()));
		tiersMoral.setNationalite(getNationalite().toEntity());
		tiersMoral.setMotif(getMotif());
		tiersMoral.setRaisonSociale(getRaisonSociale());
		tiersMoral.setNumeroRegistreCommerce(getNumeroRegistreCommerce());
		tiersMoral.setSecteurActivite(getSecteurActivite().toEntity());
		tiersMoral.setDateCreation(getDateCreation());
		tiersMoral.setLieuCreation(getLieuCreation());
		tiersMoral.setFax(getFax());
		tiersMoral.setEtabFinancier(EYesNo.valueOf(getEtabFinancier()));
		tiersMoral.setSiegeSocial(getSiegeSocial().toEntity());
		
		return tiersMoral;
	}
	
	public void toDTO(TiersMoral tiersMoral){
		
		setId(tiersMoral.getId());
		setVersion(tiersMoral.getVersion());
		setCode(tiersMoral.getCode());
		setIntitule(tiersMoral.getIntitule());
		setType(tiersMoral.getType().toString());
		setTelephone(tiersMoral.getTelephone());
		setAdresse(tiersMoral.getAdresse());
		setCommentaire(tiersMoral.getCommentaire());
		setSuspendu(tiersMoral.getSuspendu().toString());
		setMotif(tiersMoral.getMotif());
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public String getNumeroRegistreCommerce() {
		return numeroRegistreCommerce;
	}
	public void setNumeroRegistreCommerce(String numeroRegistreCommerce) {
		this.numeroRegistreCommerce = numeroRegistreCommerce;
	}
	public SecteurActiviteDTOmin getSecteurActivite() {
		return secteurActivite;
	}
	public void setSecteurActivite(SecteurActiviteDTOmin secteurActivite) {
		this.secteurActivite = secteurActivite;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getLieuCreation() {
		return lieuCreation;
	}
	public void setLieuCreation(String lieuCreation) {
		this.lieuCreation = lieuCreation;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEtabFinancier() {
		return etabFinancier;
	}
	public void setEtabFinancier(String etabFinancier) {
		this.etabFinancier = etabFinancier;
	}
	public PaysDTOmin getSiegeSocial() {
		return siegeSocial;
	}
	public void setSiegeSocial(PaysDTOmin siegeSocial) {
		this.siegeSocial = siegeSocial;
	}
	
}
