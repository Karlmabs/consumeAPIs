package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Echeance;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.PayementEcheance;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.RemboursementAnticipe;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PayementEcheanceDTO extends BaseWebserviceBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long idEcheance;
	private Long idRemboursementAnticipe;
	private Date datePayement;
	private String codeOperation;
	private Double traite;
	private Double amortissement;
	private Double interet;
	private Double taxe;
	private Double interetDiffere;
	private Double taxeDiffere;
	private Double comEng;
	private Double taxeComEng;
	private Double interetRetard;
	private Double taxeInteretRetard;
	private Double montantComAvpaye;
	private Double montantTaxeComAvPaye;
	private Double montantInteretAvPaye;
	private Double montantTaxeIntAvPaye;
	private Double montantPenaliteAvPaye;
	private Double montantTaxePenaliteAvPaye;
	
	public PayementEcheance toEntity() throws Exception{
		initContext();
		PayementEcheance payementEcheance = new PayementEcheance();
		List<Echeance> echeanceList = engagementBean.findEcheance(getIdEcheance(), null, 0, 1);
		RemboursementAnticipe remboursementAnticipe = null;
		remboursementAnticipe = administrationBean.findByPrimaryKey(RemboursementAnticipe.class, getIdRemboursementAnticipe(), null);
		payementEcheance.setId(getId());
		if(!echeanceList.isEmpty()){
			payementEcheance.setEcheance(echeanceList.get(0));
		}
		payementEcheance.setAnticipe(remboursementAnticipe);
		payementEcheance.setDatePayement(getDatePayement());
		payementEcheance.setCodeOperation(getCodeOperation());
		payementEcheance.setTraite(getTraite());
		payementEcheance.setAmortissement(getAmortissement());
		payementEcheance.setInteret(getInteret());
		payementEcheance.setTaxe(getTaxe());
		payementEcheance.setInteretDiffere(getInteretDiffere());
		payementEcheance.setTaxeDiffere(getTaxeDiffere());
		payementEcheance.setComEng(getComEng());
		payementEcheance.setTaxeComEng(getTaxeComEng());
		payementEcheance.setInteretRetard(getInteretRetard());
		payementEcheance.setTaxeInteretRetard(getTaxeInteretRetard());
		payementEcheance.setMontantComAvpaye(getMontantComAvpaye());
		payementEcheance.setMontantTaxeComAvPaye(getMontantTaxeComAvPaye());
		payementEcheance.setMontantInteretAvPaye(getMontantInteretAvPaye());
		payementEcheance.setMontantTaxeIntAvPaye(getMontantTaxeIntAvPaye());
		payementEcheance.setMontantPenaliteAvPaye(getMontantPenaliteAvPaye());
		payementEcheance.setMontantTaxePenaliteAvPaye(getMontantTaxePenaliteAvPaye());
		
		return payementEcheance;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdEcheance() {
		return idEcheance;
	}
	public void setIdEcheance(Long idEcheance) {
		this.idEcheance = idEcheance;
	}
	public Long getIdRemboursementAnticipe() {
		return idRemboursementAnticipe;
	}
	public void setIdRemboursementAnticipe(Long idRemboursementAnticipe) {
		this.idRemboursementAnticipe = idRemboursementAnticipe;
	}
	public Date getDatePayement() {
		return datePayement;
	}
	public void setDatePayement(Date datePayement) {
		this.datePayement = datePayement;
	}
	public String getCodeOperation() {
		return codeOperation;
	}
	public void setCodeOperation(String codeOperation) {
		this.codeOperation = codeOperation;
	}
	public Double getTraite() {
		return traite;
	}
	public void setTraite(Double traite) {
		this.traite = traite;
	}
	public Double getAmortissement() {
		return amortissement;
	}
	public void setAmortissement(Double amortissement) {
		this.amortissement = amortissement;
	}
	public Double getInteret() {
		return interet;
	}
	public void setInteret(Double interet) {
		this.interet = interet;
	}
	public Double getTaxe() {
		return taxe;
	}
	public void setTaxe(Double taxe) {
		this.taxe = taxe;
	}
	public Double getInteretDiffere() {
		return interetDiffere;
	}
	public void setInteretDiffere(Double interetDiffere) {
		this.interetDiffere = interetDiffere;
	}
	public Double getTaxeDiffere() {
		return taxeDiffere;
	}
	public void setTaxeDiffere(Double taxeDiffere) {
		this.taxeDiffere = taxeDiffere;
	}
	public Double getComEng() {
		return comEng;
	}
	public void setComEng(Double comEng) {
		this.comEng = comEng;
	}
	public Double getTaxeComEng() {
		return taxeComEng;
	}
	public void setTaxeComEng(Double taxeComEng) {
		this.taxeComEng = taxeComEng;
	}
	public Double getInteretRetard() {
		return interetRetard;
	}
	public void setInteretRetard(Double interetRetard) {
		this.interetRetard = interetRetard;
	}
	public Double getTaxeInteretRetard() {
		return taxeInteretRetard;
	}
	public void setTaxeInteretRetard(Double taxeInteretRetard) {
		this.taxeInteretRetard = taxeInteretRetard;
	}
	public Double getMontantComAvpaye() {
		return montantComAvpaye;
	}
	public void setMontantComAvpaye(Double montantComAvpaye) {
		this.montantComAvpaye = montantComAvpaye;
	}
	public Double getMontantTaxeComAvPaye() {
		return montantTaxeComAvPaye;
	}
	public void setMontantTaxeComAvPaye(Double montantTaxeComAvPaye) {
		this.montantTaxeComAvPaye = montantTaxeComAvPaye;
	}
	public Double getMontantInteretAvPaye() {
		return montantInteretAvPaye;
	}
	public void setMontantInteretAvPaye(Double montantInteretAvPaye) {
		this.montantInteretAvPaye = montantInteretAvPaye;
	}
	public Double getMontantTaxeIntAvPaye() {
		return montantTaxeIntAvPaye;
	}
	public void setMontantTaxeIntAvPaye(Double montantTaxeIntAvPaye) {
		this.montantTaxeIntAvPaye = montantTaxeIntAvPaye;
	}
	public Double getMontantPenaliteAvPaye() {
		return montantPenaliteAvPaye;
	}
	public void setMontantPenaliteAvPaye(Double montantPenaliteAvPaye) {
		this.montantPenaliteAvPaye = montantPenaliteAvPaye;
	}
	public Double getMontantTaxePenaliteAvPaye() {
		return montantTaxePenaliteAvPaye;
	}
	public void setMontantTaxePenaliteAvPaye(Double montantTaxePenaliteAvPaye) {
		this.montantTaxePenaliteAvPaye = montantTaxePenaliteAvPaye;
	}

}
