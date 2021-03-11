package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.TiersPhysique;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.ETypeTiers;
import com.afrikbrain.util.enumeration.EYesNo;

import java.util.Date;

public class TiersPhysiqueDTO extends TiersDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String lieuNaissance;
	private TypePieceDTOmin typePiece;
	private String numeroPieceIdentite;
	private PaysDTOmin paysResidence;
	private ProfessionDTOmin profession;
	
	public TiersPhysique toEntity(){
		TiersPhysique tiersPhysique = new TiersPhysique();
		tiersPhysique.setId(getId());
		tiersPhysique.setVersion(getVersion());
		tiersPhysique.setCode(getCode());
		tiersPhysique.setIntitule(getIntitule());
		tiersPhysique.setUnite(getUnite().toEntity());
		tiersPhysique.setAgence(getAgence().toEntity());
		tiersPhysique.setType(ETypeTiers.valueOf(getType()));
		tiersPhysique.setTelephone(getTelephone());
		tiersPhysique.setAdresse(getAdresse());
		tiersPhysique.setCommentaire(getCommentaire());
		tiersPhysique.setSuspendu(EYesNo.valueOf(getSuspendu()));
		tiersPhysique.setNationalite(getNationalite().toEntity());
		tiersPhysique.setMotif(getMotif());
		tiersPhysique.setNom(getNom());
		tiersPhysique.setPrenom(getPrenom());
		tiersPhysique.setDateNaissance(getDateNaissance());
		tiersPhysique.setTypePiece(getTypePiece().toEntity());
		tiersPhysique.setNumeroPieceIdentite(getNumeroPieceIdentite());
		tiersPhysique.setPaysResidence(getPaysResidence().toEntity());
		tiersPhysique.setProfession(getProfession().toEntity());
		
		return tiersPhysique;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public TypePieceDTOmin getTypePiece() {
		return typePiece;
	}
	public void setTypePiece(TypePieceDTOmin typePiece) {
		this.typePiece = typePiece;
	}
	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}
	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}
	public PaysDTOmin getPaysResidence() {
		return paysResidence;
	}
	public void setPaysResidence(PaysDTOmin paysResidence) {
		this.paysResidence = paysResidence;
	}
	public ProfessionDTOmin getProfession() {
		return profession;
	}
	public void setProfession(ProfessionDTOmin profession) {
		this.profession = profession;
	}
}
