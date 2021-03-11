package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Facture;

import java.io.Serializable;
import java.util.Date;

public class FactureDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String reference;
	private Double montant;
	private Date dateFacture;
	private String emetteur;
	private String objet;
	private UniteBancaireDTOmin uniteBancaireDTOmin;
	
	public void toDTO(Facture facture){
		setId(facture.getId());
		setVersion(facture.getVersion());
		setReference(facture.getReference());
		setMontant(facture.getMontant());
		setDateFacture(facture.getDateFacture());
		setEmetteur(facture.getEmetteur());
		setObjet(facture.getObjet());
	}
	
	
	public Facture toEntity(){
		Facture facture = new Facture();
		facture.setId(getId());
		facture.setVersion(getVersion());
		facture.setReference(getReference());
		facture.setMontant(getMontant());
		facture.setDateFacture(getDateFacture());
		facture.setEmetteur(getEmetteur());
		facture.setObjet(getEmetteur());
		facture.setUniteBancaire(getUniteBancaireDTOmin().toEntity());
		
		return facture;
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

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public String getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(String emetteur) {
		this.emetteur = emetteur;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public UniteBancaireDTOmin getUniteBancaireDTOmin() {
		return uniteBancaireDTOmin;
	}

	public void setUniteBancaireDTOmin(UniteBancaireDTOmin uniteBancaireDTOmin) {
		this.uniteBancaireDTOmin = uniteBancaireDTOmin;
	}
	
	
}
