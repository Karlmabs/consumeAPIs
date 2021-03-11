package dto;

import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.DeviseUnite;
import com.afrikbrain.banque.corebanking.engagement.garantie.entities.Document;
import com.afrikbrain.banque.corebanking.engagement.garantie.entities.Garantie;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.EPositionGarantie;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.EStatutGarantie;
import com.afrikbrain.banque.corebanking.engagement.placement.entites.Placement;
import com.afrikbrain.util.enumeration.EYesNo;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GarantieDTO extends BaseWebserviceBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agence;
	private GarantDTOmin garant;
	private Long idDeviseUnite;
	private SousTypeGarantieDTOmin sousTypeGarantie;
	private CompteDTOmin compteGarantie;
	private String code;
	private String reference;
	private Double montant;
	private Double monGaRest;
	private Date dateExp;
	private Date dateSaisie;
	private String statut;
	private String rang;
	private String CommentaireRang;
	private String position;
	private CompteDTOmin compte;
	private ReservationDTOmin reservation;
	private Long idPlacement;
	private List<DocumentDTOmin> documents = new ArrayList<DocumentDTOmin>();
	private String classifier;
	private String utiClassif;
	private Date dteClassif;

	public void toDTO(Garantie garantie){
		setId(garantie.getId());
		setVersion(garantie.getVersion());
		setCode(garantie.getCode());
		setReference(garantie.getReference());
		setMontant(garantie.getMontant());
		setMonGaRest(garantie.getMonGaRest());
		setDateExp(garantie.getDateExp());
		setDateSaisie(garantie.getDateSaisie());
		setStatut(garantie.getStatut().toString());
		setRang(garantie.getRang());
		setCommentaireRang(garantie.getCommentaireRang());
		setPosition(garantie.getPosition().toString());
		setClassifier(garantie.getClassifier().toString());
		setUtiClassif(garantie.getUtiClassif());
		setDteClassif(garantie.getDteClassif());
	}
	
	public Garantie toEntity() throws Exception{
		initContext();
		Garantie garantie = new Garantie();
		garantie.setId(getId());
		garantie.setVersion(getVersion());
		garantie.setUnite(getUnite().toEntity());
		garantie.setAgence(getAgence().toEntity());
		garantie.setGarant(getGarant().toEntity());
		DeviseUnite deviseUnite = administrationBean.findByPrimaryKey(DeviseUnite.class, getIdDeviseUnite(), null);
		garantie.setDeviseUnite(deviseUnite);
		garantie.setSousTypeGarantie(getSousTypeGarantie().toEntity());
		garantie.setCompteGarantie(getCompteGarantie().toEntity());
		garantie.setCode(getCode());
		garantie.setReference(getReference());
		garantie.setMontant(getMontant());
		garantie.setMonGaRest(getMonGaRest());
		garantie.setDateExp(getDateExp());
		garantie.setDateSaisie(getDateSaisie());
		garantie.setStatut(EStatutGarantie.valueOf(getStatut()));
		garantie.setRang(getRang());
		garantie.setCommentaireRang(getCommentaireRang());
		garantie.setPosition(EPositionGarantie.valueOf(getPosition()));
		garantie.setCompte(getCompte().toEntity());
		garantie.setReservation(getReservation().toEntity());
		Placement placement = iplacement.findPlacement(idPlacement);
		garantie.setPlacement(placement);
		List<Document> documentList = new ArrayList<Document>();
		for(DocumentDTOmin temp : getDocuments()){
			documentList.add(temp.toEntity());
		}
		garantie.setDocuments(documentList);
		garantie.setClassifier(EYesNo.valueOf(getClassifier()));
		garantie.setUtiClassif(getUtiClassif());
		garantie.setDteClassif(getDteClassif());
		
		return garantie;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
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
	public GarantDTOmin getGarant() {
		return garant;
	}
	public void setGarant(GarantDTOmin garant) {
		this.garant = garant;
	}
	
	public Long getIdDeviseUnite() {
		return idDeviseUnite;
	}

	public void setIdDeviseUnite(Long idDeviseUnite) {
		this.idDeviseUnite = idDeviseUnite;
	}

	public SousTypeGarantieDTOmin getSousTypeGarantie() {
		return sousTypeGarantie;
	}
	public void setSousTypeGarantie(SousTypeGarantieDTOmin sousTypeGarantie) {
		this.sousTypeGarantie = sousTypeGarantie;
	}
	public CompteDTOmin getCompteGarantie() {
		return compteGarantie;
	}
	public void setCompteGarantie(CompteDTOmin compteGarantie) {
		this.compteGarantie = compteGarantie;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Double getMonGaRest() {
		return monGaRest;
	}
	public void setMonGaRest(Double monGaRest) {
		this.monGaRest = monGaRest;
	}
	public Date getDateExp() {
		return dateExp;
	}
	public void setDateExp(Date dateExp) {
		this.dateExp = dateExp;
	}
	public Date getDateSaisie() {
		return dateSaisie;
	}
	public void setDateSaisie(Date dateSaisie) {
		this.dateSaisie = dateSaisie;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getRang() {
		return rang;
	}
	public void setRang(String rang) {
		this.rang = rang;
	}
	public String getCommentaireRang() {
		return CommentaireRang;
	}
	public void setCommentaireRang(String commentaireRang) {
		CommentaireRang = commentaireRang;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public CompteDTOmin getCompte() {
		return compte;
	}
	public void setCompte(CompteDTOmin compte) {
		this.compte = compte;
	}
	public ReservationDTOmin getReservation() {
		return reservation;
	}
	public void setReservation(ReservationDTOmin reservation) {
		this.reservation = reservation;
	}
	public Long getIdPlacement() {
		return idPlacement;
	}
	public void setIdPlacement(Long idPlacement) {
		this.idPlacement = idPlacement;
	}
	public List<DocumentDTOmin> getDocuments() {
		return documents;
	}
	public void setDocuments(List<DocumentDTOmin> documents) {
		this.documents = documents;
	}
	public String getClassifier() {
		return classifier;
	}
	public void setClassifier(String classifier) {
		this.classifier = classifier;
	}
	public String getUtiClassif() {
		return utiClassif;
	}
	public void setUtiClassif(String utiClassif) {
		this.utiClassif = utiClassif;
	}
	public Date getDteClassif() {
		return dteClassif;
	}
	public void setDteClassif(Date dteClassif) {
		this.dteClassif = dteClassif;
	}
	
}
