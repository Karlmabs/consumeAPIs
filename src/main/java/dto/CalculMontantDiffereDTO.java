package dto;

import java.io.Serializable;

public class CalculMontantDiffereDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String estTaxable; 
	private double capital;
	private double tauxInteret;
	private double tauxTaxe;
	private int nbDiffere;
	private int nbJourDiffRestant;
	private String periodeDiff;
	private String modeDiff;
	private int precision;
	public String getEstTaxable() {
		return estTaxable;
	}
	public void setEstTaxable(String estTaxable) {
		this.estTaxable = estTaxable;
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
	public int getNbDiffere() {
		return nbDiffere;
	}
	public void setNbDiffere(int nbDiffere) {
		this.nbDiffere = nbDiffere;
	}
	public int getNbJourDiffRestant() {
		return nbJourDiffRestant;
	}
	public void setNbJourDiffRestant(int nbJourDiffRestant) {
		this.nbJourDiffRestant = nbJourDiffRestant;
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
	public int getPrecision() {
		return precision;
	}
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	
	
	
}
