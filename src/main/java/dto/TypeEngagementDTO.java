package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.TypeEngagement;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;

public class TypeEngagementDTO extends BaseWebserviceBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version; 
	private String code;
	private String libelle;
	
	public void toDTO(TypeEngagement typeEngagement){
		setId(typeEngagement.getId());
		setCode(typeEngagement.getCode());
		setLibelle(typeEngagement.getLibelle());
	}
	public TypeEngagement toEntity() throws Exception{
		TypeEngagement typeEngagement = new TypeEngagement();
		typeEngagement.setId(getId());
		typeEngagement.setVersion(getVersion());
		typeEngagement.setCode(getCode());
		typeEngagement.setLibelle(getLibelle());
		
		return typeEngagement;
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


	
}
