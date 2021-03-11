package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.Engagement;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.ETypeEngagement;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;

public class EngagementDTO extends BaseWebserviceBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	private String libelle;
	private Double montant;
	private String typeEng;
	private TypeEngagementDTO typeEngagementDTO;
	private int dureeEnMois;
	
	public Engagement toEntity() throws Exception{
		Engagement engagement = new Engagement();
		engagement.setId(getId());
		engagement.setVersion(getVersion());
		engagement.setCode(getCode());
		engagement.setLibelle(getLibelle());
		engagement.setMontant(getMontant());
		engagement.setTypeEng(ETypeEngagement.valueOf(getTypeEng()));
		engagement.setTypeEngagement(getTypeEngagementDTO().toEntity());
		engagement.setDureeEnMois(getDureeEnMois());
		
		return engagement;
	}
	
	public void toDTO(Engagement engagement){
		setId(engagement.getId());
		setCode(engagement.getCode());
		setLibelle(engagement.getLibelle());
		setMontant(engagement.getMontant());
		setTypeEng(engagement.getTypeEng().toString());
		TypeEngagementDTO temp = new TypeEngagementDTO();
		temp.toDTO(engagement.getTypeEngagement());
		setTypeEngagementDTO(temp);
		setDureeEnMois(engagement.getDureeEnMois());
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
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getTypeEng() {
		return typeEng;
	}
	public void setTypeEng(String typeEng) {
		this.typeEng = typeEng;
	}
	
	public TypeEngagementDTO getTypeEngagementDTO() {
		return typeEngagementDTO;
	}
	public void setTypeEngagementDTO(TypeEngagementDTO typeEngagementDTO) {
		this.typeEngagementDTO = typeEngagementDTO;
	}
	public int getDureeEnMois() {
		return dureeEnMois;
	}
	public void setDureeEnMois(int dureeEnMois) {
		this.dureeEnMois = dureeEnMois;
	}
	
	
}
