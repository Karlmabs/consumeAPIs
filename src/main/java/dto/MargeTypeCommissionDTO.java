package dto;

import com.afrikbrain.banque.corebanking.administration.commission.entities.MargeTypeCommision;
import com.afrikbrain.banque.corebanking.administration.gestionnaire.entities.NiveauForcage;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.List;

public class MargeTypeCommissionDTO extends BaseWebserviceBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Double margePlus;
	private Double margeMoins;
	private String codeNiveauForcage;
	
	public MargeTypeCommision toEntity() throws Exception{
		initContext();
		MargeTypeCommision margeTypeCommision = new MargeTypeCommision();
		margeTypeCommision.setId(getId());
		margeTypeCommision.setMargeMoins(getMargeMoins());
		margeTypeCommision.setMargePlus(getMargePlus());
		NiveauForcage niveauForcage = null;
		List<NiveauForcage> niveauForcageList = administrationBean.findNiveauForcage(getCodeNiveauForcage(), null, null, 0, 1);
		if(!niveauForcageList.isEmpty()){
			niveauForcage = niveauForcageList.get(0);
		}
		margeTypeCommision.setNiveauForcage(niveauForcage);
		
		return margeTypeCommision;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getMargePlus() {
		return margePlus;
	}
	public void setMargePlus(Double margePlus) {
		this.margePlus = margePlus;
	}
	public Double getMargeMoins() {
		return margeMoins;
	}
	public void setMargeMoins(Double margeMoins) {
		this.margeMoins = margeMoins;
	}
	public String getCodeNiveauForcage() {
		return codeNiveauForcage;
	}
	public void setCodeNiveauForcage(String codeNiveauForcage) {
		this.codeNiveauForcage = codeNiveauForcage;
	}
	
	
}
