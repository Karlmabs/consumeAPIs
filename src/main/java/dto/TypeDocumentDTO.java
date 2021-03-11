package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.TypeDocument;
import com.afrikbrain.banque.corebanking.engagement.garantie.entities.ZoneLibre;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TypeDocumentDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	private String libelle;
	private String description;
	private List<ZoneLibreDTOmin> zonelibre = new ArrayList<ZoneLibreDTOmin>();
	
	public void toDTO(TypeDocument typeDocument){
		setId(typeDocument.getId());
		setVersion(typeDocument.getVersion());
		setCode(typeDocument.getCode());
		setLibelle(typeDocument.getLibelle());
		setDescription(typeDocument.getDescription());
	}
	public TypeDocument toEntity(){
		TypeDocument typeDocument = new TypeDocument();
		typeDocument.setId(getId());
		typeDocument.setVersion(getVersion());
		typeDocument.setCode(getCode());
		typeDocument.setLibelle(getLibelle());
		typeDocument.setDescription(getDescription());
		List<ZoneLibre> zonelibreList = new ArrayList<ZoneLibre>();
		for(ZoneLibreDTOmin temp : getZonelibre()){
			zonelibreList.add(temp.toEntity());
		}
		typeDocument.setZonelibre(zonelibreList);
		
		return typeDocument;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<ZoneLibreDTOmin> getZonelibre() {
		return zonelibre;
	}
	public void setZonelibre(List<ZoneLibreDTOmin> zonelibre) {
		this.zonelibre = zonelibre;
	}
}
