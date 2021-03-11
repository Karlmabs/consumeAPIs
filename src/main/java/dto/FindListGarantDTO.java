package dto;

import java.io.Serializable;

public class FindListGarantDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UniteBancaireDTOmin uniteBancaire;
	private AgenceDTOmin agence;
	private ClientDTOmin client;
	private TiersDTOmin tiers;
	private String codeGarant;
	private String code;
	private String nom;
	private String natureGarant;
	private String estSuspendu;
	private int firstResult;
	private int maxResult;
	public UniteBancaireDTOmin getUniteBancaire() {
		return uniteBancaire;
	}
	public void setUniteBancaire(UniteBancaireDTOmin uniteBancaire) {
		this.uniteBancaire = uniteBancaire;
	}
	public AgenceDTOmin getAgence() {
		return agence;
	}
	public void setAgence(AgenceDTOmin agence) {
		this.agence = agence;
	}
	public ClientDTOmin getClient() {
		return client;
	}
	public void setClient(ClientDTOmin client) {
		this.client = client;
	}
	public TiersDTOmin getTiers() {
		return tiers;
	}
	public void setTiers(TiersDTOmin tiers) {
		this.tiers = tiers;
	}
	public String getCodeGarant() {
		return codeGarant;
	}
	public void setCodeGarant(String codeGarant) {
		this.codeGarant = codeGarant;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNatureGarant() {
		return natureGarant;
	}
	public void setNatureGarant(String natureGarant) {
		this.natureGarant = natureGarant;
	}
	public String getEstSuspendu() {
		return estSuspendu;
	}
	public void setEstSuspendu(String estSuspendu) {
		this.estSuspendu = estSuspendu;
	}
	public int getFirstResult() {
		return firstResult;
	}
	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}
	public int getMaxResult() {
		return maxResult;
	}
	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}
	
	
}
