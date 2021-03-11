package dto;

import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.DeviseUnite;
import com.afrikbrain.banque.corebanking.administration.structures.entities.UniteBancaire;
import com.afrikbrain.banque.corebanking.engagement.placement.EPeriodicitePlacement;
import com.afrikbrain.banque.corebanking.engagement.placement.entites.SimulationPlacem;
import com.afrikbrain.banque.corebanking.engagement.placement.entites.TypeDePlacem;
import com.afrikbrain.util.enumeration.EYesNo;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SimulationPlacemDTO extends BaseWebserviceBean implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String codeTypeDePlacem;
	private Long idDeviseUnite;
	private Double montant;
	private Date dateExecution;
	private Date dateEcheance;
	private Date dateEffet;
	private String interetPeriodique;
	private String periodeRgltInt;
	private String codeUnite;
	
	public void toDTO(SimulationPlacem simulationPlacem){
		setId(simulationPlacem.getId());
		setCodeTypeDePlacem(simulationPlacem.getTypeDePlacem().getCode());
		setIdDeviseUnite(simulationPlacem.getDeviseUnite().getId());
		setMontant(simulationPlacem.getMontant());
		setDateExecution(simulationPlacem.getDateExecution());
		setDateEcheance(simulationPlacem.getDateEcheance());
		setDateEffet(simulationPlacem.getDateEffet());
		setInteretPeriodique(simulationPlacem.getInteretPeriodique().toString());
		setPeriodeRgltInt(simulationPlacem.getPeriodeRgltInt().toString());
		setCodeUnite(simulationPlacem.getUnite().getCode());
	}
	
	public SimulationPlacem toEntity() throws Exception{
		initContext();
		SimulationPlacem simulationPlacem = new SimulationPlacem();
		simulationPlacem.setId(getId());
		List<TypeDePlacem> typeDePlacemList  = iplacement.findTypeDePlacem(null, getCodeTypeDePlacem(), null, null, null, 0, 1);
		TypeDePlacem typeDePlacem = null;
		if(!typeDePlacemList.isEmpty()){
			typeDePlacem = typeDePlacemList.get(0);
		}
		simulationPlacem.setTypeDePlacem(typeDePlacem);
		DeviseUnite deviseUnite = administrationBean.findByPrimaryKey(DeviseUnite.class, getIdDeviseUnite(), null);
		simulationPlacem.setDeviseUnite(deviseUnite);
		simulationPlacem.setMontant(getMontant());
		simulationPlacem.setDateExecution(getDateExecution());
		simulationPlacem.setDateEcheance(getDateEcheance());
		simulationPlacem.setDateEffet(getDateEffet());
		simulationPlacem.setInteretPeriodique(EYesNo.valueOf(getInteretPeriodique()));
		simulationPlacem.setPeriodeRgltInt(EPeriodicitePlacement.valueOf(getPeriodeRgltInt()));
		List<UniteBancaire> uniteBancaireList = administrationBean.findUniteBancaire(getCodeUnite(), null, null, null, null, null, 0, -1);
		if(!uniteBancaireList.isEmpty()){
			simulationPlacem.setUnite(uniteBancaireList.get(0));
		}
		
		return simulationPlacem;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeTypeDePlacem() {
		return codeTypeDePlacem;
	}
	public void setCodeTypeDePlacem(String codeTypeDePlacem) {
		this.codeTypeDePlacem = codeTypeDePlacem;
	}
	public Long getIdDeviseUnite() {
		return idDeviseUnite;
	}
	public void setIdDeviseUnite(Long idDeviseUnite) {
		this.idDeviseUnite = idDeviseUnite;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Date getDateExecution() {
		return dateExecution;
	}
	public void setDateExecution(Date dateExecution) {
		this.dateExecution = dateExecution;
	}
	public Date getDateEcheance() {
		return dateEcheance;
	}
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	public Date getDateEffet() {
		return dateEffet;
	}
	public void setDateEffet(Date dateEffet) {
		this.dateEffet = dateEffet;
	}
	public String getInteretPeriodique() {
		return interetPeriodique;
	}
	public void setInteretPeriodique(String interetPeriodique) {
		this.interetPeriodique = interetPeriodique;
	}
	public String getPeriodeRgltInt() {
		return periodeRgltInt;
	}
	public void setPeriodeRgltInt(String periodeRgltInt) {
		this.periodeRgltInt = periodeRgltInt;
	}
	public String getCodeUnite() {
		return codeUnite;
	}
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}
	
}
