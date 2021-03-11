package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.LienTypDoc;
import com.afrikbrain.banque.corebanking.engagement.garantie.entities.SousTypeGarantie;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.ENatureGarantie;
import com.afrikbrain.banque.corebanking.engagement.garantie.enumeration.EOptionSousTypeGarantie;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SousTypeGarantieDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	private String libelle;
	private String description;
	private String option;
	private String gestionRang;
	private String nature;
	private UniteBancaireDTOmin unite;
	private TypeGarantieDTOmin typeGarantie;
	private List<LienTypDocDTOmin> lienTypDoc = new ArrayList<LienTypDocDTOmin>();
	private GarantieBCEAODTOmin natureBCEAO;
	
	public void toDTO(SousTypeGarantie sousTypeGarantie){
		setId(sousTypeGarantie.getId());
		setVersion(sousTypeGarantie.getVersion());
		setCode(sousTypeGarantie.getCode());
		setLibelle(sousTypeGarantie.getLibelle());
		setDescription(sousTypeGarantie.getDescription());
		setOption(sousTypeGarantie.getOption().toString());
		setGestionRang(sousTypeGarantie.getGestionRang().toString());
		setNature(sousTypeGarantie.getNature().toString());
	}
	
	public SousTypeGarantie toEntity(){
		SousTypeGarantie sousTypeGarantie = new SousTypeGarantie();
		sousTypeGarantie.setId(getId());
		sousTypeGarantie.setVersion(getVersion());
		sousTypeGarantie.setCode(getCode());
		sousTypeGarantie.setLibelle(getLibelle());
		sousTypeGarantie.setDescription(getDescription());
		sousTypeGarantie.setOption(EOptionSousTypeGarantie.valueOf(getOption()));
		sousTypeGarantie.setGestionRang(EYesNo.valueOf(getGestionRang()));
		sousTypeGarantie.setNature(ENatureGarantie.valueOf(getNature()));
		sousTypeGarantie.setUnite(getUnite().toEntity());
		sousTypeGarantie.setTypeGarantie(getTypeGarantie().toEntity());
		sousTypeGarantie.setNatureBCEAO(getNatureBCEAO().toEntity());
		List<LienTypDoc> lienTypDocList = new ArrayList<LienTypDoc>();
		for(LienTypDocDTOmin temp: getLienTypDoc()){
			lienTypDocList.add(temp.toEntity());
		}
		sousTypeGarantie.setLienTypDoc(lienTypDocList);
		
		return sousTypeGarantie;
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
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getGestionRang() {
		return gestionRang;
	}
	public void setGestionRang(String gestionRang) {
		this.gestionRang = gestionRang;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}
	public TypeGarantieDTOmin getTypeGarantie() {
		return typeGarantie;
	}
	public void setTypeGarantie(TypeGarantieDTOmin typeGarantie) {
		this.typeGarantie = typeGarantie;
	}
	public List<LienTypDocDTOmin> getLienTypDoc() {
		return lienTypDoc;
	}
	public void setLienTypDoc(List<LienTypDocDTOmin> lienTypDoc) {
		this.lienTypDoc = lienTypDoc;
	}
	public GarantieBCEAODTOmin getNatureBCEAO() {
		return natureBCEAO;
	}
	public void setNatureBCEAO(GarantieBCEAODTOmin natureBCEAO) {
		this.natureBCEAO = natureBCEAO;
	}
	
}
