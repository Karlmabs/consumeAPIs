package dto;

import com.afrikbrain.banque.corebanking.administration.comptabilite.entities.Chapitre;

import java.io.Serializable;

public class ChapitreDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	private String libelle;
	private String sensCompte;
	private String admetReportNouveau;
	private SubdivisionDTOmin subdivision;
	private PlanCompteDTOmin planCompte;
	private ClasseDTOmin classe;
	private String nature;
	private String appartenance;
	private String risque;
	
	public void toDTO(Chapitre chapitre){
		setId(chapitre.getId());
		setVersion(chapitre.getVersion());
		setCode(chapitre.getCode());
		setLibelle(chapitre.getLibelle());
		setSensCompte(chapitre.getSensCompte().toString());
		setAdmetReportNouveau(chapitre.getAdmetReportNouveau().toString());
		setNature(chapitre.getNature().toString());
		setAppartenance(chapitre.getAppartenance().toString());
		setRisque(chapitre.getRisque().toString());
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
	public String getSensCompte() {
		return sensCompte;
	}
	public void setSensCompte(String sensCompte) {
		this.sensCompte = sensCompte;
	}
	public String getAdmetReportNouveau() {
		return admetReportNouveau;
	}
	public void setAdmetReportNouveau(String admetReportNouveau) {
		this.admetReportNouveau = admetReportNouveau;
	}
	public SubdivisionDTOmin getSubdivision() {
		return subdivision;
	}
	public void setSubdivision(SubdivisionDTOmin subdivision) {
		this.subdivision = subdivision;
	}
	public PlanCompteDTOmin getPlanCompte() {
		return planCompte;
	}
	public void setPlanCompte(PlanCompteDTOmin planCompte) {
		this.planCompte = planCompte;
	}
	public ClasseDTOmin getClasse() {
		return classe;
	}
	public void setClasse(ClasseDTOmin classe) {
		this.classe = classe;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getAppartenance() {
		return appartenance;
	}
	public void setAppartenance(String appartenance) {
		this.appartenance = appartenance;
	}
	public String getRisque() {
		return risque;
	}
	public void setRisque(String risque) {
		this.risque = risque;
	}

}
