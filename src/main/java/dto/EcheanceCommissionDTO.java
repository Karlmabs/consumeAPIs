package dto;

import com.afrikbrain.banque.corebanking.administration.commission.ENatureCom;
import com.afrikbrain.banque.corebanking.administration.commission.entities.Commission;
import com.afrikbrain.banque.corebanking.administration.compte.entities.Compte;
import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.DeviseUnite;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.EcheanceCommission;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.TaxeEcheance;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EcheanceCommissionDTO extends BaseWebserviceBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long idCommission;
	private String nature;
	private Double valeur;
	private String libCom;
	private Long idDeviseUnite;
	private Double tauxChgDevCom;
	private Long idCpteDebCom;
	private Double montComDevCpteDB;
	private Double montComDevCom;
	private Double montComDevNat;
	private List<Long> idTaxeList = new ArrayList<Long>(0);
	
	public EcheanceCommission toEntity() throws Exception{
		initContext();
		EcheanceCommission echeanceCommission = new EcheanceCommission();
		echeanceCommission.setId(getId());
		Commission commission = administrationBean.findByPrimaryKey(Commission.class, getIdCommission(), null);
		echeanceCommission.setCommission(commission);
		echeanceCommission.setNature(ENatureCom.valueOf(getNature()));
		echeanceCommission.setValeur(getValeur());
		echeanceCommission.setLibCom(getLibCom());
		DeviseUnite deviseUnite = administrationBean.findByPrimaryKey(DeviseUnite.class, getIdDeviseUnite(), null);
		echeanceCommission.setDevCom(deviseUnite);
		echeanceCommission.setTauxChgDevCom(getTauxChgDevCom());
		Compte compte = administrationBean.findByPrimaryKey(Compte.class, getIdCpteDebCom(), null);
		echeanceCommission.setCpteDebCom(compte);
		echeanceCommission.setMontComDevCpteDB(getMontComDevCpteDB());
		echeanceCommission.setMontComDevCom(getMontComDevCom());
		echeanceCommission.setMontComDevNat(getMontComDevNat());
		List<TaxeEcheance> taxes = new ArrayList<TaxeEcheance>(0);
		for(Long temp : getIdTaxeList()){
			TaxeEcheance taxe = administrationBean.findByPrimaryKey(TaxeEcheance.class, temp, null);
			taxes.add(taxe);
		}
		echeanceCommission.setTaxes(taxes);
		
		return echeanceCommission;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdCommission() {
		return idCommission;
	}
	public void setIdCommission(Long idCommission) {
		this.idCommission = idCommission;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public Double getValeur() {
		return valeur;
	}
	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}
	public String getLibCom() {
		return libCom;
	}
	public void setLibCom(String libCom) {
		this.libCom = libCom;
	}
	public Long getIdDeviseUnite() {
		return idDeviseUnite;
	}
	public void setIdDeviseUnite(Long idDeviseUnite) {
		this.idDeviseUnite = idDeviseUnite;
	}
	public Double getTauxChgDevCom() {
		return tauxChgDevCom;
	}
	public void setTauxChgDevCom(Double tauxChgDevCom) {
		this.tauxChgDevCom = tauxChgDevCom;
	}
	public Long getIdCpteDebCom() {
		return idCpteDebCom;
	}
	public void setIdCpteDebCom(Long idCpteDebCom) {
		this.idCpteDebCom = idCpteDebCom;
	}
	public Double getMontComDevCpteDB() {
		return montComDevCpteDB;
	}
	public void setMontComDevCpteDB(Double montComDevCpteDB) {
		this.montComDevCpteDB = montComDevCpteDB;
	}
	public Double getMontComDevCom() {
		return montComDevCom;
	}
	public void setMontComDevCom(Double montComDevCom) {
		this.montComDevCom = montComDevCom;
	}
	public Double getMontComDevNat() {
		return montComDevNat;
	}
	public void setMontComDevNat(Double montComDevNat) {
		this.montComDevNat = montComDevNat;
	}
	public List<Long> getIdTaxeList() {
		return idTaxeList;
	}
	public void setIdTaxeList(List<Long> idTaxeList) {
		this.idTaxeList = idTaxeList;
	}
	
	

}
