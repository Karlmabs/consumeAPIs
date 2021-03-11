package dto;

import com.afrikbrain.banque.corebanking.administration.gestionnaire.entities.NiveauForcage;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.VariationTaux;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.List;

public class VariationTauxDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Double varPlus;
	private Double varMoins;
	private String codeNiveauForcage;
	
	public void toDTO(VariationTaux variationTaux){
		setId(variationTaux.getId());
		setVarPlus(variationTaux.getVarPlus());
		setVarMoins(variationTaux.getVarMoins());
		setCodeNiveauForcage(variationTaux.getNiveauForcage().getCode());
	}
	
	public VariationTaux toEntity() throws Exception{
		initContext();
		VariationTaux variationTaux = new VariationTaux();
		NiveauForcage niveauForcage = null;
		List<NiveauForcage> niveauForcageList = administrationBean.findNiveauForcage(getCodeNiveauForcage(), null, null, 0, 1);
		if(!niveauForcageList.isEmpty()){
			niveauForcage = niveauForcageList.get(0);
		}
		variationTaux.setId(getId());
		variationTaux.setVarPlus(getVarPlus());
		variationTaux.setVarMoins(getVarMoins());
		variationTaux.setNiveauForcage(niveauForcage);
		
		return variationTaux;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getVarPlus() {
		return varPlus;
	}
	public void setVarPlus(Double varPlus) {
		this.varPlus = varPlus;
	}
	public Double getVarMoins() {
		return varMoins;
	}
	public void setVarMoins(Double varMoins) {
		this.varMoins = varMoins;
	}
	public String getCodeNiveauForcage() {
		return codeNiveauForcage;
	}
	public void setCodeNiveauForcage(String codeNiveauForcage) {
		this.codeNiveauForcage = codeNiveauForcage;
	}

	
}
