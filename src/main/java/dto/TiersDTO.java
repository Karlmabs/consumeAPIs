package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.Tiers;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.ETypeTiers;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;

public class TiersDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer version;
	private String code;
	private String intitule;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agence;
	private String type;
	private String telephone;
	private String adresse;
	private String commentaire;
	private String suspendu;
	private NationaliteDTOmin nationalite;
	private String motif;
	
	public void toDTO(Tiers tiers){
		setId(tiers.getId());
		setVersion(tiers.getVersion());
		setCode(tiers.getCode());
		setIntitule(tiers.getIntitule());
		setType(tiers.getType().toString());
		setTelephone(tiers.getTelephone());
		setAdresse(tiers.getAdresse());
		setCommentaire(tiers.getCommentaire());
		setSuspendu(tiers.getSuspendu().toString());
		setMotif(tiers.getMotif());
	}
	
	public Tiers toEntity(){
		Tiers tiers = new Tiers();
		tiers.setId(getId());
		tiers.setVersion(getVersion());
		tiers.setCode(getCode());
		tiers.setIntitule(getIntitule());
		tiers.setUnite(getUnite().toEntity());
		tiers.setAgence(getAgence().toEntity());
		tiers.setType(ETypeTiers.valueOf(getType()));
		tiers.setTelephone(getTelephone());
		tiers.setAdresse(getAdresse());
		tiers.setCommentaire(getCommentaire());
		tiers.setSuspendu(EYesNo.valueOf(getSuspendu()));
		tiers.setNationalite(getNationalite().toEntity());
		tiers.setMotif(getMotif());
		
		return tiers;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}
	public AgenceDTOmin getAgence() {
		return agence;
	}
	public void setAgence(AgenceDTOmin agence) {
		this.agence = agence;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getSuspendu() {
		return suspendu;
	}
	public void setSuspendu(String suspendu) {
		this.suspendu = suspendu;
	}
	public NationaliteDTOmin getNationalite() {
		return nationalite;
	}
	public void setNationalite(NationaliteDTOmin nationalite) {
		this.nationalite = nationalite;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	
	

}
