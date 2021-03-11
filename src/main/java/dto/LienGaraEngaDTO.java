package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.LienGaraEnga;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;
import java.util.Date;

public class LienGaraEngaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private Double monGaAff;
	private Date dateEch;
	private Double pourCouvert;
	private CompteDTOmin compteGarantie;
	private UniteBancaireDTOmin unite;
	private AgenceDTOmin agence;
	private EngagementDTOmin engagement;
	private GarantieDTOmin garantie;
	private ConditionAffectationDTOmin condaffect;
	private String actif;
	
	public void toDTO(LienGaraEnga lienGaraEnga){
		setId(lienGaraEnga.getId());
		setVersion(lienGaraEnga.getVersion());
		setMonGaAff(lienGaraEnga.getMonGaAff());
		setDateEch(lienGaraEnga.getDateEch());
		setPourCouvert(lienGaraEnga.getPourCouvert());
		setActif(lienGaraEnga.getActif().toString());
	}
	
	public LienGaraEnga toEntity(){
		LienGaraEnga lienGaraEnga = new LienGaraEnga();
		lienGaraEnga.setId(getId());
		lienGaraEnga.setVersion(getVersion());
		lienGaraEnga.setMonGaAff(getMonGaAff());
		lienGaraEnga.setDateEch(getDateEch());
		lienGaraEnga.setPourCouvert(getPourCouvert());
		lienGaraEnga.setCompteGarantie(getCompteGarantie().toEntity());
		lienGaraEnga.setUnite(getUnite().toEntity());
		lienGaraEnga.setAgence(getAgence().toEntity());
		lienGaraEnga.setEngagement(getEngagement().toEntity());
		lienGaraEnga.setGarantie(getGarantie().toEntity());
		lienGaraEnga.setCondaffect(getCondaffect().toEntity());
		lienGaraEnga.setActif(EYesNo.valueOf(getActif()));
		
		return lienGaraEnga;
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
	public Double getMonGaAff() {
		return monGaAff;
	}
	public void setMonGaAff(Double monGaAff) {
		this.monGaAff = monGaAff;
	}
	public Date getDateEch() {
		return dateEch;
	}
	public void setDateEch(Date dateEch) {
		this.dateEch = dateEch;
	}
	public Double getPourCouvert() {
		return pourCouvert;
	}
	public void setPourCouvert(Double pourCouvert) {
		this.pourCouvert = pourCouvert;
	}
	public CompteDTOmin getCompteGarantie() {
		return compteGarantie;
	}
	public void setCompteGarantie(CompteDTOmin compteGarantie) {
		this.compteGarantie = compteGarantie;
	}
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}
	public AgenceDTOmin getAgence() {
		return agence;
	}
	public void setAgence(AgenceDTOmin agence) {
		this.agence = agence;
	}
	public EngagementDTOmin getEngagement() {
		return engagement;
	}
	public void setEngagement(EngagementDTOmin engagement) {
		this.engagement = engagement;
	}
	public GarantieDTOmin getGarantie() {
		return garantie;
	}
	public void setGarantie(GarantieDTOmin garantie) {
		this.garantie = garantie;
	}
	public ConditionAffectationDTOmin getCondaffect() {
		return condaffect;
	}
	public void setCondaffect(ConditionAffectationDTOmin condaffect) {
		this.condaffect = condaffect;
	}
	public String getActif() {
		return actif;
	}
	public void setActif(String actif) {
		this.actif = actif;
	}
	
}
