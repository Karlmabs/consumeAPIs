package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.LienGaraCaution;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;
import java.util.Date;

public class LienGaraCautionDTO implements Serializable{

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
	private CautionDTOmin caution;
	private GarantieDTOmin garantie;
	private ConditionAffectationCautionDTOmin condaffect;
	private String actif;
	
	public void toDTO(LienGaraCaution lienGaraCaution){
		setId(lienGaraCaution.getId());
		setVersion(lienGaraCaution.getVersion());
		setMonGaAff(lienGaraCaution.getMonGaAff());
		setDateEch(lienGaraCaution.getDateEch());
		setPourCouvert(lienGaraCaution.getPourCouvert());
		setActif(lienGaraCaution.getActif().toString());
	}
	
	public LienGaraCaution toEntity(){
		LienGaraCaution lienGaraCaution = new LienGaraCaution();
		lienGaraCaution.setId(getId());
		lienGaraCaution.setVersion(getVersion());
		lienGaraCaution.setMonGaAff(getMonGaAff());
		lienGaraCaution.setDateEch(getDateEch());
		lienGaraCaution.setPourCouvert(getPourCouvert());
		lienGaraCaution.setCompteGarantie(getCompteGarantie().toEntity());
		lienGaraCaution.setUnite(getUnite().toEntity());
		lienGaraCaution.setAgence(getAgence().toEntity());
		lienGaraCaution.setCaution(getCaution().toEntity());
		lienGaraCaution.setGarantie(getGarantie().toEntity());
		lienGaraCaution.setCondaffect(getCondaffect().toEntity());
		lienGaraCaution.setActif(EYesNo.valueOf(getActif()));
		
		return lienGaraCaution;
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
	public CautionDTOmin getCaution() {
		return caution;
	}
	public void setCaution(CautionDTOmin caution) {
		this.caution = caution;
	}
	public GarantieDTOmin getGarantie() {
		return garantie;
	}
	public void setGarantie(GarantieDTOmin garantie) {
		this.garantie = garantie;
	}
	public ConditionAffectationCautionDTOmin getCondaffect() {
		return condaffect;
	}
	public void setCondaffect(ConditionAffectationCautionDTOmin condaffect) {
		this.condaffect = condaffect;
	}
	public String getActif() {
		return actif;
	}
	public void setActif(String actif) {
		this.actif = actif;
	}
	
}
