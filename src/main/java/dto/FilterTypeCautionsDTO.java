package dto;

import java.io.Serializable;
import java.util.List;

public class FilterTypeCautionsDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String libelle;
	private List<Integer> dureeEnJoursInterval;
	private List<Double> valeurCommissionPeriodiqueInterval;
	private String nature;
	private List<Double> tauxPenaliteInterval;
	private List<Double> tauxProvisionnementInitialInterval;
	private List<Double> tauxRetenueGarantieInterval;
	private List<Integer> periodicitePrelevementFraisInterval;
	private List<Integer> periodiciteRetenueGarantieInterval;
	private String leveeAutomatique;
	private String collecteTotaliteCommission;
	private String suspensionEcheance;
	private String deviseCode;
	private String uniteBancaireCode;
	private int beginIndex;
	private int lineNumbers;
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
	public List<Integer> getDureeEnJoursInterval() {
		return dureeEnJoursInterval;
	}
	public void setDureeEnJoursInterval(List<Integer> dureeEnJoursInterval) {
		this.dureeEnJoursInterval = dureeEnJoursInterval;
	}
	public List<Double> getValeurCommissionPeriodiqueInterval() {
		return valeurCommissionPeriodiqueInterval;
	}
	public void setValeurCommissionPeriodiqueInterval(List<Double> valeurCommissionPeriodiqueInterval) {
		this.valeurCommissionPeriodiqueInterval = valeurCommissionPeriodiqueInterval;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public List<Double> getTauxPenaliteInterval() {
		return tauxPenaliteInterval;
	}
	public void setTauxPenaliteInterval(List<Double> tauxPenaliteInterval) {
		this.tauxPenaliteInterval = tauxPenaliteInterval;
	}
	public List<Double> getTauxProvisionnementInitialInterval() {
		return tauxProvisionnementInitialInterval;
	}
	public void setTauxProvisionnementInitialInterval(List<Double> tauxProvisionnementInitialInterval) {
		this.tauxProvisionnementInitialInterval = tauxProvisionnementInitialInterval;
	}
	public List<Double> getTauxRetenueGarantieInterval() {
		return tauxRetenueGarantieInterval;
	}
	public void setTauxRetenueGarantieInterval(List<Double> tauxRetenueGarantieInterval) {
		this.tauxRetenueGarantieInterval = tauxRetenueGarantieInterval;
	}
	public List<Integer> getPeriodicitePrelevementFraisInterval() {
		return periodicitePrelevementFraisInterval;
	}
	public void setPeriodicitePrelevementFraisInterval(List<Integer> periodicitePrelevementFraisInterval) {
		this.periodicitePrelevementFraisInterval = periodicitePrelevementFraisInterval;
	}
	public List<Integer> getPeriodiciteRetenueGarantieInterval() {
		return periodiciteRetenueGarantieInterval;
	}
	public void setPeriodiciteRetenueGarantieInterval(List<Integer> periodiciteRetenueGarantieInterval) {
		this.periodiciteRetenueGarantieInterval = periodiciteRetenueGarantieInterval;
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
	public String getDeviseCode() {
		return deviseCode;
	}
	public void setDeviseCode(String deviseCode) {
		this.deviseCode = deviseCode;
	}
	public String getUniteBancaireCode() {
		return uniteBancaireCode;
	}
	public void setUniteBancaireCode(String uniteBancaireCode) {
		this.uniteBancaireCode = uniteBancaireCode;
	}
	public int getBeginIndex() {
		return beginIndex;
	}
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	public int getLineNumbers() {
		return lineNumbers;
	}
	public void setLineNumbers(int lineNumbers) {
		this.lineNumbers = lineNumbers;
	}
	
}
