package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.TypeGarantie;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.ETypeGarantie;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;

public class TypeGarantieDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	private String libelle;
	private String description;
	private String comptbilisation;
	private String typeGarantie;
	private UniteBancaireDTOmin unite;
	
	public void toDTO(TypeGarantie typeGarantie){
		setId(typeGarantie.getId());
		setVersion(typeGarantie.getVersion());
		setCode(typeGarantie.getCode());
		setLibelle(typeGarantie.getLibelle());
		setDescription(typeGarantie.getDescription());
		setComptbilisation(typeGarantie.getComptbilisation().toString());
		setTypeGarantie(typeGarantie.getTypeGarantie().toString());
	}
	
	public TypeGarantie toEntity(){
		TypeGarantie typeGarantie = new TypeGarantie();
		typeGarantie.setId(getId());
		typeGarantie.setVersion(getVersion());
		typeGarantie.setCode(getCode());
		typeGarantie.setLibelle(getLibelle());
		typeGarantie.setDescription(getDescription());
		typeGarantie.setComptbilisation(EYesNo.valueOf(getComptbilisation()));
		typeGarantie.setTypeGarantie(ETypeGarantie.valueOf(getTypeGarantie()));
		typeGarantie.setUnite(getUnite().toEntity());
		
		return typeGarantie;
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
	public String getComptbilisation() {
		return comptbilisation;
	}
	public void setComptbilisation(String comptbilisation) {
		this.comptbilisation = comptbilisation;
	}
	public String getTypeGarantie() {
		return typeGarantie;
	}
	public void setTypeGarantie(String typeGarantie) {
		this.typeGarantie = typeGarantie;
	}
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}
}
