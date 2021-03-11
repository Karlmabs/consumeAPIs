package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.Document;
import com.afrikbrain.banque.corebanking.engagement.garantie.entities.ZoneLibreDoc;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentDTO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String reference;
	private String code;
	private Date dateCrea;
	private Date dateExp;
	private String commentaire;
	private String obligatoire;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agence;
	private TypeDocumentDTOmin typeDocument;
	private List<ZoneLibreDocDOTmin> zoneLibreDoc = new ArrayList<ZoneLibreDocDOTmin>();
	
	public void toDTO(Document document){
		setId(document.getId());
		setVersion(document.getVersion());
		setReference(document.getReference());
		setCode(document.getCode());
		setDateCrea(document.getDateCrea());
		setDateExp(document.getDateExp());
		setCommentaire(document.getCommentaire());
		setObligatoire(document.getObligatoire().toString());
	}
	
	public Document toEntity(){
		Document document = new Document();
		document.setId(getId());
		document.setVersion(getVersion());
		document.setReference(getReference());
		document.setCode(getCode());
		document.setDateCrea(getDateCrea());
		document.setDateExp(getDateExp());
		document.setCommentaire(getCommentaire());
		document.setObligatoire(EYesNo.valueOf(getObligatoire()));
		document.setUnite(getUnite().toEntity());
		document.setAgence(getAgence().toEntity());
		document.setTypeDocument(getTypeDocument().toEntity());
		List<ZoneLibreDoc> zoneLibreDocList = new ArrayList<ZoneLibreDoc>();
		for(ZoneLibreDocDOTmin temp : getZoneLibreDoc()){
			zoneLibreDocList.add(temp.toEntity());
		}
		document.setZoneLibreDoc(zoneLibreDocList);
		
		return document;
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
	public Date getDateCrea() {
		return dateCrea;
	}
	public void setDateCrea(Date dateCrea) {
		this.dateCrea = dateCrea;
	}
	public Date getDateExp() {
		return dateExp;
	}
	public void setDateExp(Date dateExp) {
		this.dateExp = dateExp;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getObligatoire() {
		return obligatoire;
	}
	public void setObligatoire(String obligatoire) {
		this.obligatoire = obligatoire;
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
	public TypeDocumentDTOmin getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(TypeDocumentDTOmin typeDocument) {
		this.typeDocument = typeDocument;
	}
	public List<ZoneLibreDocDOTmin> getZoneLibreDoc() {
		return zoneLibreDoc;
	}
	public void setZoneLibreDoc(List<ZoneLibreDocDOTmin> zoneLibreDoc) {
		this.zoneLibreDoc = zoneLibreDoc;
	}
	
}
