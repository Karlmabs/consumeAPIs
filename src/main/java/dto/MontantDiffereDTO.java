package dto;

import java.io.Serializable;
import java.util.Date;

public class MontantDiffereDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String estTaxable;
	private Date dateMiseEnPlace;
	private Date dateDebutEch;
	private double capital;
	private double tauxInteret;
	private double tauxTaxe;
	private String periodeDiff;
	private String modeDiff;
	private Long uniteId;
	private Long idDevise;
	public String getEstTaxable() {
		return estTaxable;
	}
	public void setEstTaxable(String estTaxable) {
		this.estTaxable = estTaxable;
	}
	public Date getDateMiseEnPlace() {
		return dateMiseEnPlace;
	}
	public void setDateMiseEnPlace(Date dateMiseEnPlace) {
		this.dateMiseEnPlace = dateMiseEnPlace;
	}
	public Date getDateDebutEch() {
		return dateDebutEch;
	}
	public void setDateDebutEch(Date dateDebutEch) {
		this.dateDebutEch = dateDebutEch;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	public double getTauxTaxe() {
		return tauxTaxe;
	}
	public void setTauxTaxe(double tauxTaxe) {
		this.tauxTaxe = tauxTaxe;
	}
	public String getPeriodeDiff() {
		return periodeDiff;
	}
	public void setPeriodeDiff(String periodeDiff) {
		this.periodeDiff = periodeDiff;
	}
	public String getModeDiff() {
		return modeDiff;
	}
	public void setModeDiff(String modeDiff) {
		this.modeDiff = modeDiff;
	}
	public Long getUniteId() {
		return uniteId;
	}
	public void setUniteId(Long uniteId) {
		this.uniteId = uniteId;
	}
	public Long getIdDevise() {
		return idDevise;
	}
	public void setIdDevise(Long idDevise) {
		this.idDevise = idDevise;
	}
	
	
}
