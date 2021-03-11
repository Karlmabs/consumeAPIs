package dto;

import com.afrikbrain.banque.corebanking.administration.commission.ENatureCom;
import com.afrikbrain.banque.corebanking.administration.commission.entities.MargeTypeCommision;
import com.afrikbrain.banque.corebanking.administration.commission.entities.Taxe;
import com.afrikbrain.banque.corebanking.administration.commission.entities.TypeCommission;
import com.afrikbrain.banque.corebanking.administration.structures.entities.UniteBancaire;
import com.afrikbrain.util.enumeration.EYesNo;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TypeCommissionDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String codeUnite;
	private String code;
	private String libelle;
	private String taxable;
	private String nature;
	private List<TaxeDTO> taxes = new ArrayList<TaxeDTO>();
	private List<MargeTypeCommissionDTO> marges = new ArrayList<MargeTypeCommissionDTO>();
	
	public void toDTO(TypeCommission typeCommission){
		setId(typeCommission.getId());
		setCode(typeCommission.getCode());
		setCodeUnite(typeCommission.getUnite().getCode());
		setLibelle(typeCommission.getLibelle());
		setTaxable(typeCommission.getTaxable().toString());
		setNature(typeCommission.getNature().toString());
	}
	
	public TypeCommission toEntity() throws Exception{
		initContext();
		TypeCommission typeCommission = new TypeCommission();
		typeCommission.setId(getId());
		UniteBancaire uniteBancaire = null;
		List<UniteBancaire> uniteBancaireList = administrationBean.findUniteBancaire(getCodeUnite(), null, null, null, null, null, 0, -1);
		if(!uniteBancaireList.isEmpty()){
			uniteBancaire = uniteBancaireList.get(0);
		}
		typeCommission.setUnite(uniteBancaire);
		typeCommission.setCode(getCode());
		typeCommission.setLibelle(getLibelle());
		typeCommission.setTaxable(EYesNo.valueOf(getTaxable()));
		typeCommission.setNature(ENatureCom.valueOf(getNature()));
		List<Taxe> taxeList = new ArrayList<Taxe>();
		for(TaxeDTO temp : getTaxes()){
			taxeList.add(temp.toEntity());
		}
		typeCommission.setTaxes(taxeList);
		
		List<MargeTypeCommision> margeList = new ArrayList<MargeTypeCommision>();
		for(MargeTypeCommissionDTO temp : getMarges()){
			margeList.add(temp.toEntity());
		}
		typeCommission.setMarges(margeList);
		
		return typeCommission;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeUnite() {
		return codeUnite;
	}
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
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
	public String getTaxable() {
		return taxable;
	}
	public void setTaxable(String taxable) {
		this.taxable = taxable;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public List<TaxeDTO> getTaxes() {
		return taxes;
	}
	public void setTaxes(List<TaxeDTO> taxes) {
		this.taxes = taxes;
	}
	public List<MargeTypeCommissionDTO> getMarges() {
		return marges;
	}
	public void setMarges(List<MargeTypeCommissionDTO> marges) {
		this.marges = marges;
	}

	
}
