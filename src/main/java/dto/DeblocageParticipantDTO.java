package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.DeblocageParticipant;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Echeance;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeblocageParticipantDTO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private ParticipationBanquePretDTOmin participationBanquePret;
	private Double quotePart;
	private Double montant;
	private Double mntComReparti;
	private Double mntTaxeReparti;
	private Double mntComNonReparti;
	private Double mntTaxeNonReparti;
	private Double mntRembAnt;
	private List<EcheanceDTOmin> echeances = new ArrayList<EcheanceDTOmin>();
	
	public void toDTO(DeblocageParticipant deblocageParticipant){
		setId(deblocageParticipant.getId());
		setVersion(deblocageParticipant.getVersion());
		setQuotePart(deblocageParticipant.getQuotePart());
		setMontant(deblocageParticipant.getMontant());
	}
	
	public DeblocageParticipant toEntity(){
		DeblocageParticipant deblocageParticipant = new DeblocageParticipant();
		deblocageParticipant.setId(getId());
		deblocageParticipant.setVersion(getVersion());
		deblocageParticipant.setParticipationBanquePret(getParticipationBanquePret().toEntity());
		deblocageParticipant.setQuotePart(getQuotePart());
		deblocageParticipant.setMontant(getMontant());
		deblocageParticipant.setMntComReparti(getMntComReparti());
		deblocageParticipant.setMntTaxeReparti(getMntTaxeReparti());
		deblocageParticipant.setMntComNonReparti(getMntComNonReparti());
		deblocageParticipant.setMntTaxeNonReparti(getMntTaxeNonReparti());
		deblocageParticipant.setMntRembAnt(getMntRembAnt());
		List<Echeance> echeanceList = new ArrayList<Echeance>();
		for(EcheanceDTOmin temp : getEcheances()){
			echeanceList.add(temp.toEntity());
		}
		deblocageParticipant.setEcheances(echeanceList);
		
		return deblocageParticipant;
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
	public ParticipationBanquePretDTOmin getParticipationBanquePret() {
		return participationBanquePret;
	}
	public void setParticipationBanquePret(ParticipationBanquePretDTOmin participationBanquePret) {
		this.participationBanquePret = participationBanquePret;
	}
	public Double getQuotePart() {
		return quotePart;
	}
	public void setQuotePart(Double quotePart) {
		this.quotePart = quotePart;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Double getMntComReparti() {
		return mntComReparti;
	}
	public void setMntComReparti(Double mntComReparti) {
		this.mntComReparti = mntComReparti;
	}
	public Double getMntTaxeReparti() {
		return mntTaxeReparti;
	}
	public void setMntTaxeReparti(Double mntTaxeReparti) {
		this.mntTaxeReparti = mntTaxeReparti;
	}
	public Double getMntComNonReparti() {
		return mntComNonReparti;
	}
	public void setMntComNonReparti(Double mntComNonReparti) {
		this.mntComNonReparti = mntComNonReparti;
	}
	public Double getMntTaxeNonReparti() {
		return mntTaxeNonReparti;
	}
	public void setMntTaxeNonReparti(Double mntTaxeNonReparti) {
		this.mntTaxeNonReparti = mntTaxeNonReparti;
	}
	public Double getMntRembAnt() {
		return mntRembAnt;
	}
	public void setMntRembAnt(Double mntRembAnt) {
		this.mntRembAnt = mntRembAnt;
	}
	public List<EcheanceDTOmin> getEcheances() {
		return echeances;
	}
	public void setEcheances(List<EcheanceDTOmin> echeances) {
		this.echeances = echeances;
	}
	
	

}
