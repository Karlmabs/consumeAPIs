package dto;

import com.afrikbrain.banque.corebanking.administration.commission.entities.Taxe;
import com.afrikbrain.banque.corebanking.administration.structures.entities.UniteBancaire;
import com.afrikbrain.util.enumeration.EYesNo;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.List;

public class TaxeDTO extends BaseWebserviceBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String libelle;
	private Double taux;
	private String racine;
	private String deduction;
	private String codeUnite;
	
	public Taxe toEntity() throws Exception{
		initContext();
		Taxe taxe = new Taxe();
		taxe.setId(getId());
		taxe.setCode(getCode());
		taxe.setLibelle(getLibelle());
		taxe.setTaux(getTaux());
		taxe.setRacine(getRacine());
		taxe.setDeduction(EYesNo.valueOf(getDeduction()));
		UniteBancaire uniteBancaire = null;
		List<UniteBancaire> uniteBancaireList = administrationBean.findUniteBancaire(getCodeUnite(), null, null, null, null, null, 0, -1);
		if(!uniteBancaireList.isEmpty()){
			uniteBancaire = uniteBancaireList.get(0);
		}
		taxe.setUnite(uniteBancaire);
		
		return taxe;
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
	public Double getTaux() {
		return taux;
	}
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	public String getRacine() {
		return racine;
	}
	public void setRacine(String racine) {
		this.racine = racine;
	}
	public String getDeduction() {
		return deduction;
	}
	public void setDeduction(String deduction) {
		this.deduction = deduction;
	}
	public String getCodeUnite() {
		return codeUnite;
	}
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}

}
