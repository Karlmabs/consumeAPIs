package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.Garant;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.ENatureGarant;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;

public class GarantDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer version;
	private String code;
	private String nature;
	private String commentaire;
	private String suspendu;
	private String motif;
	private String intitule;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agence;
	private ClientDTOmin client;
	private ClientDTOmin aval;
	private TiersDTOmin tiers;
	private PersonneDTOmin personne;
	
	public void toDTO(Garant garant){
		setId(garant.getId());
		setVersion(garant.getVersion());
		setCode(garant.getCode());
		setNature(garant.getNature().toString());
		setCommentaire(garant.getCommentaire());
		setSuspendu(garant.getSuspendu().toString());
		setMotif(garant.getMotif());
		setIntitule(garant.getIntitule());
	}
	
	public Garant toEntity(){
		Garant garant = new Garant();
		garant.setId(getId());
		garant.setVersion(getVersion());
		garant.setCode(getCode());
		garant.setNature(ENatureGarant.valueOf(getNature()));
		garant.setCommentaire(getCommentaire());
		garant.setSuspendu(EYesNo.valueOf(getSuspendu()));
		garant.setMotif(getMotif());
		garant.setIntitule(getIntitule());
		garant.setUnite(getUnite().toEntity());
		garant.setAgence(getAgence().toEntity());
		garant.setClient(getClient().toEntity());
		garant.setAval(getAval().toEntity());
		garant.setTiers(getTiers().toEntity());
		garant.setPersonne(getPersonne().toEntity());
		
		return garant;
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
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
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
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
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
	public ClientDTOmin getClient() {
		return client;
	}
	public void setClient(ClientDTOmin client) {
		this.client = client;
	}
	public ClientDTOmin getAval() {
		return aval;
	}
	public void setAval(ClientDTOmin aval) {
		this.aval = aval;
	}
	public TiersDTOmin getTiers() {
		return tiers;
	}
	public void setTiers(TiersDTOmin tiers) {
		this.tiers = tiers;
	}
	public PersonneDTOmin getPersonne() {
		return personne;
	}
	public void setPersonne(PersonneDTOmin personne) {
		this.personne = personne;
	}
	
}
