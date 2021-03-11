package dto;

import com.afrikbrain.banque.corebanking.administration.commission.entities.Taxe;
import com.afrikbrain.banque.corebanking.engagement.placement.entites.TypeDePlacem;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Taux;
import com.afrikbrain.util.enumeration.EYesNo;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;

/**
 * 
 * @author Gaetan
 *
 */
public class TypePlacementDTO extends BaseWebserviceBean implements Serializable, Comparable<TypePlacementDTO> {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String code;
	private String libelle;
	private Integer dureeMin;
	private Integer nombreDeJoursMaxCalcInteretPrecompte;
	private Integer nombreDeJourMinCalcInteret;
	private Integer delaiRenouvellement;
	private Double plafonMinimumSouscription;
	private String actualisationInterets;
	private String codeTauxPrecompte;
	private String codeTauxAnticipation;
	private String codeTauxPrelevLiberatoire;
	private String anneeCalendaire;
	private Long idTaxe;
	
	// Constructeurs
	public TypePlacementDTO() {
	}
	
	public void toDTO(TypeDePlacem typeDePlacem){
		setId(typeDePlacem.getId());
		setCode(typeDePlacem.getCode());
		setLibelle(typeDePlacem.getLibelle());
		setDureeMin(typeDePlacem.getDureeMin());
		setNombreDeJoursMaxCalcInteretPrecompte(typeDePlacem.getNombreDeJoursMaxCalcInteretPrecompte());
		setNombreDeJourMinCalcInteret(typeDePlacem.getNombreDeJourMinCalcInteret());
		setDelaiRenouvellement(typeDePlacem.getDelaiRenouvellement());
		setPlafonMinimumSouscription(typeDePlacem.getPlafonMinimumSouscription());
		setActualisationInterets(typeDePlacem.getActualisationInterets().toString());
		setCodeTauxPrecompte(typeDePlacem.getTauxPrecompte().getCode());
		setCodeTauxAnticipation(typeDePlacem.getTauxAnticipation().getCode());
		setCodeTauxPrelevLiberatoire(typeDePlacem.getTauxPrelevLiberatoire().getCode());
		setAnneeCalendaire(typeDePlacem.getAnneeCalendaire().toString());
		setIdTaxe(typeDePlacem.getTaxe().getId());
	}	
	
	public TypeDePlacem toEntity() throws Exception{
		initContext();
		TypeDePlacem typeDePlacem = new TypeDePlacem();
		typeDePlacem.setId(getId());
		typeDePlacem.setCode(getCode());
		typeDePlacem.setLibelle(getLibelle());
		typeDePlacem.setDureeMin(getDureeMin());
		typeDePlacem.setNombreDeJoursMaxCalcInteretPrecompte(getNombreDeJoursMaxCalcInteretPrecompte());
		typeDePlacem.setNombreDeJourMinCalcInteret(getNombreDeJourMinCalcInteret());
		typeDePlacem.setDelaiRenouvellement(getDelaiRenouvellement());
		typeDePlacem.setPlafonMinimumSouscription(getPlafonMinimumSouscription());
		typeDePlacem.setActualisationInterets(EYesNo.valueOf(getActualisationInterets()));
		
		Taux tauxPrecompte = engagementBean.findTaux(null, null, null, getCodeTauxPrecompte(), null);
		Taux tauxAnticipation = engagementBean.findTaux(null, null, null, getCodeTauxAnticipation(), null);
		Taux tauxPrevelementLiberatoire = engagementBean.findTaux(null, null, null, getCodeTauxPrelevLiberatoire(), null);
		typeDePlacem.setTauxPrecompte(tauxPrecompte);
		typeDePlacem.setTauxAnticipation(tauxAnticipation);
		typeDePlacem.setTauxPrelevLiberatoire(tauxPrevelementLiberatoire);
		typeDePlacem.setAnneeCalendaire(EYesNo.valueOf(getAnneeCalendaire()));
		Taxe taxe = administrationBean.findByPrimaryKey(Taxe.class, getIdTaxe(), null);
		typeDePlacem.setTaxe(taxe);
		
		return typeDePlacem;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the dureeMin
	 */
	public Integer getDureeMin() {
		return dureeMin;
	}

	/**
	 * @param dureeMin the dureeMin to set
	 */
	public void setDureeMin(Integer dureeMin) {
		this.dureeMin = dureeMin;
	}

	/**
	 * @return the nombreDeJoursMaxCalcInteretPrecompte
	 */
	public Integer getNombreDeJoursMaxCalcInteretPrecompte() {
		return nombreDeJoursMaxCalcInteretPrecompte;
	}

	/**
	 * @param nombreDeJoursMaxCalcInteretPrecompte the nombreDeJoursMaxCalcInteretPrecompte to set
	 */
	public void setNombreDeJoursMaxCalcInteretPrecompte(Integer nombreDeJoursMaxCalcInteretPrecompte) {
		this.nombreDeJoursMaxCalcInteretPrecompte = nombreDeJoursMaxCalcInteretPrecompte;
	}

	/**
	 * @return the nombreDeJourMinCalcInteret
	 */
	public Integer getNombreDeJourMinCalcInteret() {
		return nombreDeJourMinCalcInteret;
	}

	/**
	 * @param nombreDeJourMinCalcInteret the nombreDeJourMinCalcInteret to set
	 */
	public void setNombreDeJourMinCalcInteret(Integer nombreDeJourMinCalcInteret) {
		this.nombreDeJourMinCalcInteret = nombreDeJourMinCalcInteret;
	}

	/**
	 * @return the delaiRenouvellement
	 */
	public Integer getDelaiRenouvellement() {
		return delaiRenouvellement;
	}

	/**
	 * @param delaiRenouvellement the delaiRenouvellement to set
	 */
	public void setDelaiRenouvellement(Integer delaiRenouvellement) {
		this.delaiRenouvellement = delaiRenouvellement;
	}

	/**
	 * @return the plafonMinimumSouscription
	 */
	public Double getPlafonMinimumSouscription() {
		return plafonMinimumSouscription;
	}

	/**
	 * @param plafonMinimumSouscription the plafonMinimumSouscription to set
	 */
	public void setPlafonMinimumSouscription(Double plafonMinimumSouscription) {
		this.plafonMinimumSouscription = plafonMinimumSouscription;
	}


	public String getCodeTauxPrelevLiberatoire() {
		return codeTauxPrelevLiberatoire;
	}

	public void setCodeTauxPrelevLiberatoire(String codeTauxPrelevLiberatoire) {
		this.codeTauxPrelevLiberatoire = codeTauxPrelevLiberatoire;
	}

	public int compareTo(TypePlacementDTO arg0) {
		return code.compareTo(arg0.getCode());
	}

	public String getActualisationInterets() {
		return actualisationInterets;
	}

	public void setActualisationInterets(String actualisationInterets) {
		this.actualisationInterets = actualisationInterets;
	}

	public String getAnneeCalendaire() {
		return anneeCalendaire;
	}

	public void setAnneeCalendaire(String anneeCalendaire) {
		this.anneeCalendaire = anneeCalendaire;
	}

	public String getCodeTauxPrecompte() {
		return codeTauxPrecompte;
	}

	public void setCodeTauxPrecompte(String codeTauxPrecompte) {
		this.codeTauxPrecompte = codeTauxPrecompte;
	}

	public String getCodeTauxAnticipation() {
		return codeTauxAnticipation;
	}

	public void setCodeTauxAnticipation(String codeTauxAnticipation) {
		this.codeTauxAnticipation = codeTauxAnticipation;
	}

	public Long getIdTaxe() {
		return idTaxe;
	}

	public void setIdTaxe(Long idTaxe) {
		this.idTaxe = idTaxe;
	}
		
	
}
