package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.FraisDivers;

import java.io.Serializable;

public class FraisDiversDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String libelle;
	private Double montant;
	
	public FraisDivers toEntity(){
		FraisDivers fraisDivers = new FraisDivers();
		fraisDivers.setId(getId());
		fraisDivers.setLibelle(getLibelle());
		fraisDivers.setMontant(getMontant());
		
		return fraisDivers;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	
}
