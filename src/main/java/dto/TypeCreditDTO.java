package dto;

import com.afrikbrain.banque.corebanking.administration.client.entities.CategorieInterne;
import com.afrikbrain.banque.corebanking.administration.commission.entities.TypeCommission;
import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.DeviseUnite;
import com.afrikbrain.banque.corebanking.administration.structures.entities.UniteBancaire;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.EPrioriteRemboursement;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.TypeCredit;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.EModeRecouvImpaye;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.enumeration.ETermeCredit;
import com.afrikbrain.util.enumeration.EYesNo;

import java.util.ArrayList;
import java.util.List;

public class TypeCreditDTO extends TypeEngagementDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer dureeMax;
	private Integer dureeMin;
	private Double seuilRecouvrement;
	private String priorite1;
	private String priorite2;
	private String priorite3;
	private String priorite4;
	private Double seuilRecouvrementImpaye;
	private Double minimaFracRecou;
	private Double montantMax;
	private String modeRecouvImpaye;
	private String recouFraction;
	private String garantiesObligatoire;
	private String pretConsortial;
	private String commentaire;
	private Integer delaiAttenteImp;
	private Double couvertureGar;
	private String compteProvisiontInteret;
	private String compteInteret;
	private String compteInteretRetard;
	private String cpteInteretImpaye;
	private String cpteCommissionRecu;
	private String cpteInteretCcionRecu;
	private String compteInteretTaxe;
	private String compteInteretRetardTaxe;
	private String terme;
	private String codeUnite;
	private Long idDeviseUnite;
	private List<String> codeCategoriesInternes = new ArrayList<String>();
	private List<TypeCommissionDTO> lstTypCom = new ArrayList<TypeCommissionDTO>();
	
	public void toDTO(TypeCredit typeCredit){
		setId(typeCredit.getId());
		setCode(typeCredit.getCode());
		setLibelle(typeCredit.getLibelle());
		setDureeMax(typeCredit.getDureeMax());
		setDureeMin(typeCredit.getDureeMin());
		setSeuilRecouvrement(typeCredit.getSeuilRecouvrement());
		setPriorite1(typeCredit.getPriorite1().toString());
		setPriorite2(typeCredit.getPriorite2().toString());
		setPriorite3(typeCredit.getPriorite3().toString());
		setPriorite4(typeCredit.getPriorite4().toString());
		setSeuilRecouvrementImpaye(typeCredit.getSeuilRecouvrementImpaye());
		setMinimaFracRecou(typeCredit.getMinimaFracRecou());
		setMontantMax(typeCredit.getMontantMax());
		setModeRecouvImpaye(typeCredit.getModeRecouvImpaye().toString());
		setRecouFraction(typeCredit.getRecouFraction().toString());
		setGarantiesObligatoire(typeCredit.getGarantiesObligatoire().toString());
		setPretConsortial(typeCredit.getPretConsortial().toString());
		setCommentaire(typeCredit.getCommentaire());
		setDelaiAttenteImp(typeCredit.getDelaiAttenteImp());
		setCouvertureGar(typeCredit.getCouvertureGar());
		setCompteProvisiontInteret(typeCredit.getCompteProvisiontInteret());
		setCompteInteret(typeCredit.getCompteInteret());
		setCompteInteretRetard(typeCredit.getCompteInteretRetard());
		setCpteInteretImpaye(typeCredit.getCpteInteretImpaye());
		setCpteCommissionRecu(typeCredit.getCpteCommissionRecu());
		setCompteInteretTaxe(typeCredit.getCompteInteretTaxe());
		setCompteInteretRetard(typeCredit.getCompteInteretRetardTaxe());
		setTerme(typeCredit.getTerme().toString());
		setCodeUnite(typeCredit.getUnite().getCode());
		setIdDeviseUnite(typeCredit.getDevise().getId());
		List<String> codeCategoriesInterneList = new ArrayList<String>();
		List<TypeCommissionDTO> typeCommissionDTOList = new ArrayList<TypeCommissionDTO>();
		for(CategorieInterne temp : typeCredit.getCategoriesInternes()){
			codeCategoriesInterneList.add(temp.getCode());
		}
		for(TypeCommission temp : typeCredit.getLstTypCom()){
			TypeCommissionDTO typeCommissionDTO = new TypeCommissionDTO();
			typeCommissionDTO.toDTO(temp);
			typeCommissionDTOList.add(typeCommissionDTO);
		}
		setCodeCategoriesInternes(codeCategoriesInterneList);
		setLstTypCom(typeCommissionDTOList);		

	}
	
	public TypeCredit toEntity() throws Exception{
		initContext();
		TypeCredit typeCredit = new TypeCredit();
		typeCredit.setId(getId());
		typeCredit.setCode(getCode());
		typeCredit.setLibelle(getLibelle());
		typeCredit.setDureeMax(getDureeMax());
		typeCredit.setDureeMin(getDureeMin());
		typeCredit.setSeuilRecouvrement(getSeuilRecouvrement());
		typeCredit.setPriorite1(EPrioriteRemboursement.valueOf(getPriorite1()));
		typeCredit.setPriorite2(EPrioriteRemboursement.valueOf(getPriorite2()));
		typeCredit.setPriorite3(EPrioriteRemboursement.valueOf(getPriorite3()));
		typeCredit.setPriorite4(EPrioriteRemboursement.valueOf(getPriorite4()));
		typeCredit.setSeuilRecouvrementImpaye(getSeuilRecouvrementImpaye());
		typeCredit.setMinimaFracRecou(getMinimaFracRecou());
		typeCredit.setMontantMax(getMontantMax());
		typeCredit.setModeRecouvImpaye(EModeRecouvImpaye.valueOf(getModeRecouvImpaye()));
		typeCredit.setRecouFraction(EYesNo.valueOf(getRecouFraction()));
		typeCredit.setGarantiesObligatoire(EYesNo.valueOf(getGarantiesObligatoire()));
		typeCredit.setPretConsortial(EYesNo.valueOf(getPretConsortial()));
		typeCredit.setCommentaire(getCommentaire());
		typeCredit.setDelaiAttenteImp(getDelaiAttenteImp());
		typeCredit.setCouvertureGar(getCouvertureGar());
		typeCredit.setCompteProvisiontInteret(getCompteProvisiontInteret());
		typeCredit.setCompteInteret(getCompteInteret());
		typeCredit.setCompteInteretRetard(getCompteInteretRetard());
		typeCredit.setCpteInteretImpaye(getCpteInteretImpaye());
		typeCredit.setCpteCommissionRecu(getCpteCommissionRecu());
		typeCredit.setCpteInteretCcionRecu(getCpteInteretCcionRecu());
		typeCredit.setCompteInteretTaxe(getCompteInteretTaxe());
		typeCredit.setCompteInteretRetardTaxe(getCompteInteretRetardTaxe());
		typeCredit.setTerme(ETermeCredit.valueOf(getTerme()));
		UniteBancaire uniteBancaire = null;
		List<UniteBancaire> uniteBancaireList = administrationBean.findUniteBancaire(getCodeUnite(), null, null, null, null, null, 0, -1);
		if(!uniteBancaireList.isEmpty()){
			uniteBancaire = uniteBancaireList.get(0);
		}
		DeviseUnite deviseUnite = administrationBean.findByPrimaryKey(DeviseUnite.class, getIdDeviseUnite(), null);
		List<CategorieInterne> categorieInterneList = new ArrayList<CategorieInterne>();
		for(String temp : getCodeCategoriesInternes()){
			List<CategorieInterne> categorieTemp = administrationBean.findParametre(CategorieInterne.class, null, temp, 0, 1);
			if(!categorieTemp.isEmpty()){
				categorieInterneList.add(categorieTemp.get(0));
			}
		}
		List<TypeCommission> typeCommisionList = new ArrayList<TypeCommission>();
		for(TypeCommissionDTO temp : getLstTypCom()){
			typeCommisionList.add(temp.toEntity());
		}
		typeCredit.setUnite(uniteBancaire);
		typeCredit.setDevise(deviseUnite);
		typeCredit.setCategoriesInternes(categorieInterneList);
		typeCredit.setLstTypCom(typeCommisionList);
		
		return typeCredit;
	}
	public Integer getDureeMax() {
		return dureeMax;
	}
	public void setDureeMax(Integer dureeMax) {
		this.dureeMax = dureeMax;
	}
	public Integer getDureeMin() {
		return dureeMin;
	}
	public void setDureeMin(Integer dureeMin) {
		this.dureeMin = dureeMin;
	}
	public Double getSeuilRecouvrement() {
		return seuilRecouvrement;
	}
	public void setSeuilRecouvrement(Double seuilRecouvrement) {
		this.seuilRecouvrement = seuilRecouvrement;
	}
	public String getPriorite1() {
		return priorite1;
	}
	public void setPriorite1(String priorite1) {
		this.priorite1 = priorite1;
	}
	public String getPriorite2() {
		return priorite2;
	}
	public void setPriorite2(String priorite2) {
		this.priorite2 = priorite2;
	}
	public String getPriorite3() {
		return priorite3;
	}
	public void setPriorite3(String priorite3) {
		this.priorite3 = priorite3;
	}
	public String getPriorite4() {
		return priorite4;
	}
	public void setPriorite4(String priorite4) {
		this.priorite4 = priorite4;
	}
	public Double getSeuilRecouvrementImpaye() {
		return seuilRecouvrementImpaye;
	}
	public void setSeuilRecouvrementImpaye(Double seuilRecouvrementImpaye) {
		this.seuilRecouvrementImpaye = seuilRecouvrementImpaye;
	}
	public Double getMinimaFracRecou() {
		return minimaFracRecou;
	}
	public void setMinimaFracRecou(Double minimaFracRecou) {
		this.minimaFracRecou = minimaFracRecou;
	}
	public Double getMontantMax() {
		return montantMax;
	}
	public void setMontantMax(Double montantMax) {
		this.montantMax = montantMax;
	}
	public String getModeRecouvImpaye() {
		return modeRecouvImpaye;
	}
	public void setModeRecouvImpaye(String modeRecouvImpaye) {
		this.modeRecouvImpaye = modeRecouvImpaye;
	}
	public String getRecouFraction() {
		return recouFraction;
	}
	public void setRecouFraction(String recouFraction) {
		this.recouFraction = recouFraction;
	}
	public String getGarantiesObligatoire() {
		return garantiesObligatoire;
	}
	public void setGarantiesObligatoire(String garantiesObligatoire) {
		this.garantiesObligatoire = garantiesObligatoire;
	}
	public String getPretConsortial() {
		return pretConsortial;
	}
	public void setPretConsortial(String pretConsortial) {
		this.pretConsortial = pretConsortial;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Integer getDelaiAttenteImp() {
		return delaiAttenteImp;
	}
	public void setDelaiAttenteImp(Integer delaiAttenteImp) {
		this.delaiAttenteImp = delaiAttenteImp;
	}
	public Double getCouvertureGar() {
		return couvertureGar;
	}
	public void setCouvertureGar(Double couvertureGar) {
		this.couvertureGar = couvertureGar;
	}
	public String getCompteProvisiontInteret() {
		return compteProvisiontInteret;
	}
	public void setCompteProvisiontInteret(String compteProvisiontInteret) {
		this.compteProvisiontInteret = compteProvisiontInteret;
	}
	public String getCompteInteret() {
		return compteInteret;
	}
	public void setCompteInteret(String compteInteret) {
		this.compteInteret = compteInteret;
	}
	public String getCompteInteretRetard() {
		return compteInteretRetard;
	}
	public void setCompteInteretRetard(String compteInteretRetard) {
		this.compteInteretRetard = compteInteretRetard;
	}
	public String getCpteInteretImpaye() {
		return cpteInteretImpaye;
	}
	public void setCpteInteretImpaye(String cpteInteretImpaye) {
		this.cpteInteretImpaye = cpteInteretImpaye;
	}
	public String getCpteCommissionRecu() {
		return cpteCommissionRecu;
	}
	public void setCpteCommissionRecu(String cpteCommissionRecu) {
		this.cpteCommissionRecu = cpteCommissionRecu;
	}
	public String getCpteInteretCcionRecu() {
		return cpteInteretCcionRecu;
	}
	public void setCpteInteretCcionRecu(String cpteInteretCcionRecu) {
		this.cpteInteretCcionRecu = cpteInteretCcionRecu;
	}
	public String getCompteInteretTaxe() {
		return compteInteretTaxe;
	}
	public void setCompteInteretTaxe(String compteInteretTaxe) {
		this.compteInteretTaxe = compteInteretTaxe;
	}
	public String getCompteInteretRetardTaxe() {
		return compteInteretRetardTaxe;
	}
	public void setCompteInteretRetardTaxe(String compteInteretRetardTaxe) {
		this.compteInteretRetardTaxe = compteInteretRetardTaxe;
	}
	public String getTerme() {
		return terme;
	}
	public void setTerme(String terme) {
		this.terme = terme;
	}
	public String getCodeUnite() {
		return codeUnite;
	}
	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}
	public Long getIdDeviseUnite() {
		return idDeviseUnite;
	}
	public void setIdDeviseUnite(Long idDeviseUnite) {
		this.idDeviseUnite = idDeviseUnite;
	}
	public List<String> getCodeCategoriesInternes() {
		return codeCategoriesInternes;
	}
	public void setCodeCategoriesInternes(List<String> codeCategoriesInternes) {
		this.codeCategoriesInternes = codeCategoriesInternes;
	}
	public List<TypeCommissionDTO> getLstTypCom() {
		return lstTypCom;
	}
	public void setLstTypCom(List<TypeCommissionDTO> lstTypCom) {
		this.lstTypCom = lstTypCom;
	}
	
	
	
	

	
}
