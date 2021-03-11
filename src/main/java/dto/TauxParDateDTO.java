package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.TauxParDate;

import java.io.Serializable;
import java.util.Date;

public class TauxParDateDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Double valeur;
	private Date dateApplication;
	
	public void toDTO(TauxParDate tauxParDate){
		setId(tauxParDate.getId());
		setValeur(tauxParDate.getValeur());
		setDateApplication(tauxParDate.getDateApplication());
	}
	
	public TauxParDate toEntity(){
		TauxParDate tauxParDate = new TauxParDate();
		tauxParDate.setId(getId());
		tauxParDate.setValeur(getValeur());
		tauxParDate.setDateApplication(getDateApplication());
		
		return tauxParDate;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getValeur() {
		return valeur;
	}
	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}
	public Date getDateApplication() {
		return dateApplication;
	}
	public void setDateApplication(Date dateApplication) {
		this.dateApplication = dateApplication;
	}
	
	

}
