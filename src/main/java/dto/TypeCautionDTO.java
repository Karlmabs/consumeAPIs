package dto;

import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.DeviseUnite;
import com.afrikbrain.banque.corebanking.engagement.caution.constant.ENature;
import com.afrikbrain.banque.corebanking.engagement.caution.constant.ENatureCommission;
import com.afrikbrain.banque.corebanking.engagement.caution.constant.EPeriodicite;
import com.afrikbrain.banque.corebanking.engagement.caution.entities.TypeCaution;
import com.afrikbrain.util.enumeration.EYesNo;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;

public class TypeCautionDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
	private String libelle;
	private Integer dureeEnJours;
	private String natureCommission;
	private Double valeurCommissionPeriodique;
	private Double minimumComPeriodique;
	private String nature;
	private String periodicitePrelevementFrais;
	private String cpteInteretPercuAvance;
	private String cpteTaxePercuAvance;
	private String cpteInteret;
	private String cpteTaxe;
	private Double tauxTaxe;
	private String periodiciteRetenueGarantie;
	private String leveeAutomatique;
	private String collecteTotaliteCommission;
	private String suspensionEcheance;
	private String commissionEcheance;
	private Long idDevise;
	private UniteBancaireDTOmin unite;
	
	public TypeCaution toEntity() throws Exception{
		initContext();
		TypeCaution typeCaution = new TypeCaution();
		typeCaution.setId(getId());
		typeCaution.setVersion(getVersion());
		typeCaution.setCode(getCode());
		typeCaution.setLibelle(getLibelle());
		typeCaution.setDureeEnJours(getDureeEnJours());
		typeCaution.setNatureCommission(ENatureCommission.valueOf(getNatureCommission()));
		typeCaution.setValeurCommissionPeriodique(getValeurCommissionPeriodique());
		typeCaution.setMinimumComPeriodique(getMinimumComPeriodique());
		typeCaution.setNature(ENature.valueOf(getNature()));
		typeCaution.setPeriodicitePrelevementFrais(EPeriodicite.valueOf(getPeriodicitePrelevementFrais()));
		typeCaution.setCpteInteretPercuAvance(getCpteInteretPercuAvance());
		typeCaution.setCpteTaxePercuAvance(getCpteTaxePercuAvance());
		typeCaution.setCpteInteret(getCpteInteret());
		typeCaution.setCpteTaxe(getCpteTaxe());
		typeCaution.setTauxTaxe(getTauxTaxe());
		typeCaution.setPeriodiciteRetenueGarantie(EPeriodicite.valueOf(getPeriodiciteRetenueGarantie()));
		typeCaution.setLeveeAutomatique(EYesNo.valueOf(getLeveeAutomatique()));
		typeCaution.setCollecteTotaliteCommission(EYesNo.valueOf(getCollecteTotaliteCommission()));
		typeCaution.setSuspensionEcheance(EYesNo.valueOf(getSuspensionEcheance()));
		typeCaution.setCommissionEcheance(EYesNo.valueOf(getCommissionEcheance()));
		DeviseUnite deviseUnite = administrationBean.findByPrimaryKey(DeviseUnite.class, getIdDevise(), null);
		typeCaution.setDevise(deviseUnite);
		typeCaution.setUnite(getUnite().toEntity());
		
		return typeCaution;
	}
	
	public void toDTO(TypeCaution typeCaution){
		setId(typeCaution.getId());
		setVersion(typeCaution.getVersion());
		setCode(typeCaution.getCode());
		setLibelle(typeCaution.getLibelle());
		setDureeEnJours(typeCaution.getDureeEnJours());
		setNatureCommission(typeCaution.getNatureCommission().toString());
		setValeurCommissionPeriodique(typeCaution.getValeurCommissionPeriodique());
		setMinimumComPeriodique(typeCaution.getMinimumComPeriodique());
		setNature(typeCaution.getNature().toString());
		setPeriodicitePrelevementFrais(typeCaution.getPeriodicitePrelevementFrais().toString());
		setCpteInteretPercuAvance(typeCaution.getCpteInteretPercuAvance());
		setCpteTaxePercuAvance(typeCaution.getCpteTaxePercuAvance());
		setCpteInteret(typeCaution.getCpteInteret());
		setCpteTaxe(typeCaution.getCpteTaxe());
		setTauxTaxe(typeCaution.getTauxTaxe());
		setPeriodiciteRetenueGarantie(typeCaution.getPeriodiciteRetenueGarantie().toString());
		setLeveeAutomatique(typeCaution.getLeveeAutomatique().toString());
		setCollecteTotaliteCommission(typeCaution.getCollecteTotaliteCommission().toString());
		setSuspensionEcheance(typeCaution.getSuspensionEcheance().toString());
		setCommissionEcheance(typeCaution.getCommissionEcheance().toString());
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
	public Integer getDureeEnJours() {
		return dureeEnJours;
	}
	public void setDureeEnJours(Integer dureeEnJours) {
		this.dureeEnJours = dureeEnJours;
	}
	public String getNatureCommission() {
		return natureCommission;
	}
	public void setNatureCommission(String natureCommission) {
		this.natureCommission = natureCommission;
	}
	public Double getValeurCommissionPeriodique() {
		return valeurCommissionPeriodique;
	}
	public void setValeurCommissionPeriodique(Double valeurCommissionPeriodique) {
		this.valeurCommissionPeriodique = valeurCommissionPeriodique;
	}
	public Double getMinimumComPeriodique() {
		return minimumComPeriodique;
	}
	public void setMinimumComPeriodique(Double minimumComPeriodique) {
		this.minimumComPeriodique = minimumComPeriodique;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getPeriodicitePrelevementFrais() {
		return periodicitePrelevementFrais;
	}
	public void setPeriodicitePrelevementFrais(String periodicitePrelevementFrais) {
		this.periodicitePrelevementFrais = periodicitePrelevementFrais;
	}
	public String getCpteInteretPercuAvance() {
		return cpteInteretPercuAvance;
	}
	public void setCpteInteretPercuAvance(String cpteInteretPercuAvance) {
		this.cpteInteretPercuAvance = cpteInteretPercuAvance;
	}
	public String getCpteTaxePercuAvance() {
		return cpteTaxePercuAvance;
	}
	public void setCpteTaxePercuAvance(String cpteTaxePercuAvance) {
		this.cpteTaxePercuAvance = cpteTaxePercuAvance;
	}
	public String getCpteInteret() {
		return cpteInteret;
	}
	public void setCpteInteret(String cpteInteret) {
		this.cpteInteret = cpteInteret;
	}
	public String getCpteTaxe() {
		return cpteTaxe;
	}
	public void setCpteTaxe(String cpteTaxe) {
		this.cpteTaxe = cpteTaxe;
	}
	public Double getTauxTaxe() {
		return tauxTaxe;
	}
	public void setTauxTaxe(Double tauxTaxe) {
		this.tauxTaxe = tauxTaxe;
	}
	public String getPeriodiciteRetenueGarantie() {
		return periodiciteRetenueGarantie;
	}
	public void setPeriodiciteRetenueGarantie(String periodiciteRetenueGarantie) {
		this.periodiciteRetenueGarantie = periodiciteRetenueGarantie;
	}
	public String getLeveeAutomatique() {
		return leveeAutomatique;
	}
	public void setLeveeAutomatique(String leveeAutomatique) {
		this.leveeAutomatique = leveeAutomatique;
	}
	public String getCollecteTotaliteCommission() {
		return collecteTotaliteCommission;
	}
	public void setCollecteTotaliteCommission(String collecteTotaliteCommission) {
		this.collecteTotaliteCommission = collecteTotaliteCommission;
	}
	public String getSuspensionEcheance() {
		return suspensionEcheance;
	}
	public void setSuspensionEcheance(String suspensionEcheance) {
		this.suspensionEcheance = suspensionEcheance;
	}
	public String getCommissionEcheance() {
		return commissionEcheance;
	}
	public void setCommissionEcheance(String commissionEcheance) {
		this.commissionEcheance = commissionEcheance;
	}
	
	public Long getIdDevise() {
		return idDevise;
	}
	public void setIdDevise(Long idDevise) {
		this.idDevise = idDevise;
	}
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}

}
