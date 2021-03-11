package dto;

import com.afrikbrain.banque.corebanking.administration.compte.entities.Compte;
import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.DeviseUnite;
import com.afrikbrain.banque.corebanking.administration.evenement.EEtatOperation;
import com.afrikbrain.banque.corebanking.administration.structures.entities.Agence;
import com.afrikbrain.banque.corebanking.administration.structures.entities.UniteBancaire;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.SourceFinancement;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.SourceFinancementSecteurActivite;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.ESourceFinancement;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SourceFinancementDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String libelle;
	private Double montantAlloue;
	private Double montantRestant;
	private Double oldMontant;
	private String etat;
	private String etatOp;
	private String codeUnite;
	private String codeAgence;
	private Long idDevise;
	private Long idCompteSource;
	private Long idCompteBudget;
	private List<Long> idSourceFinancementSecteurActivites = new ArrayList<Long>();
	
	public void toDTO(SourceFinancement sourceFinancement){
		setId(sourceFinancement.getId());
		setCode(sourceFinancement.getCode());
		setLibelle(sourceFinancement.getLibelle());
		setMontantAlloue(sourceFinancement.getMontantAlloue());
		setMontantRestant(sourceFinancement.getMontantRestant());
		setOldMontant(sourceFinancement.getOldMontant());
		setEtat(sourceFinancement.getEtat().toString());
		setEtatOp(sourceFinancement.getEtatOp().toString());
		setCodeUnite(sourceFinancement.getUnite().getCode());
		setCodeAgence(sourceFinancement.getAgence().getCode());
		setIdDevise(sourceFinancement.getDevise().getId());
		setIdCompteSource(sourceFinancement.getCompteSource().getId());
		setIdCompteBudget(sourceFinancement.getCompteBudget().getId());
		List<Long> idSourceFinancementSecteurActivites = new ArrayList<Long>();
		for(SourceFinancementSecteurActivite sourceFinancementSecteurActivite: sourceFinancement.getSourceFinancementSecteurActivites()){
			idSourceFinancementSecteurActivites.add(sourceFinancementSecteurActivite.getId());
		}
		setIdSourceFinancementSecteurActivites(idSourceFinancementSecteurActivites);
	}
	
	public SourceFinancement toEntity() throws Exception{
		initContext();
		Agence agence = administrationBean.findAgenceByCode(getCodeAgence());
		Compte compteSource = administrationBean.findByPrimaryKey(Compte.class, getIdCompteSource(), null);
		Compte compteBudget = administrationBean.findByPrimaryKey(Compte.class, getIdCompteBudget(), null);
		DeviseUnite deviseUnite = administrationBean.findByPrimaryKey(DeviseUnite.class, getIdDevise(), null);
		UniteBancaire uniteBancaire = null;
		List<UniteBancaire> uniteBancaireList = administrationBean.findUniteBancaire(getCodeUnite(), null, null, null, null, null, 0, -1);
		if(!uniteBancaireList.isEmpty()){
			uniteBancaire = uniteBancaireList.get(0);
		}
		SourceFinancement sourceFinancement = new SourceFinancement();
		sourceFinancement.setId(getId());
		sourceFinancement.setCode(getCode());
		sourceFinancement.setLibelle(getLibelle());
		sourceFinancement.setMontantAlloue(getMontantAlloue());
		sourceFinancement.setMontantRestant(getMontantRestant());
		sourceFinancement.setOldMontant(getOldMontant());
		sourceFinancement.setEtat(ESourceFinancement.valueOf(getEtat()));
		sourceFinancement.setEtatOp(EEtatOperation.valueOf(getEtatOp()));
		sourceFinancement.setUnite(uniteBancaire);
		sourceFinancement.setAgence(agence);
		sourceFinancement.setDevise(deviseUnite);
		sourceFinancement.setCompteSource(compteSource);
		sourceFinancement.setCompteBudget(compteBudget);
		List<SourceFinancementSecteurActivite> sourceFinancementSecteurActivites = new ArrayList<SourceFinancementSecteurActivite>();
		for(Long id : getIdSourceFinancementSecteurActivites()){
			SourceFinancementSecteurActivite sourceFinancementSecteurActivite = administrationBean.findByPrimaryKey(SourceFinancementSecteurActivite.class, id, null);
			sourceFinancementSecteurActivites.add(sourceFinancementSecteurActivite);
		}
		sourceFinancement.setSourceFinancementSecteurActivites(sourceFinancementSecteurActivites);
		
		return sourceFinancement;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Double getMontantAlloue() {
		return montantAlloue;
	}
	public void setMontantAlloue(Double montantAlloue) {
		this.montantAlloue = montantAlloue;
	}
	public Double getMontantRestant() {
		return montantRestant;
	}
	public void setMontantRestant(Double montantRestant) {
		this.montantRestant = montantRestant;
	}
	public Double getOldMontant() {
		return oldMontant;
	}
	public void setOldMontant(Double oldMontant) {
		this.oldMontant = oldMontant;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getEtatOp() {
		return etatOp;
	}
	public void setEtatOp(String etatOp) {
		this.etatOp = etatOp;
	}
	public String getCodeUnite() {
		return codeUnite;
	}
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}
	public String getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}
	public Long getIdDevise() {
		return idDevise;
	}
	public void setIdDevise(Long idDevise) {
		this.idDevise = idDevise;
	}
	public Long getIdCompteSource() {
		return idCompteSource;
	}
	public void setIdCompteSource(Long idCompteSource) {
		this.idCompteSource = idCompteSource;
	}
	public Long getIdCompteBudget() {
		return idCompteBudget;
	}
	public void setIdCompteBudget(Long idCompteBudget) {
		this.idCompteBudget = idCompteBudget;
	}
	public List<Long> getIdSourceFinancementSecteurActivites() {
		return idSourceFinancementSecteurActivites;
	}
	public void setIdSourceFinancementSecteurActivites(List<Long> idSourceFinancementSecteurActivites) {
		this.idSourceFinancementSecteurActivites = idSourceFinancementSecteurActivites;
	}

	
}
