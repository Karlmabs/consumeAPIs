package dto;

import com.afrikbrain.banque.corebanking.administration.deviseCours.entities.DeviseUnite;
import com.afrikbrain.banque.corebanking.administration.typeoperation.EDecision;
import com.afrikbrain.banque.corebanking.administration.typeoperation.ENatureTypOpe;
import com.afrikbrain.banque.corebanking.administration.typeoperation.entities.*;
import com.afrikbrain.util.enumeration.EYesNo;
import org.pkfrc.banque.corebanking.digibank.services.BaseWebserviceBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TypeOperationDTO extends BaseWebserviceBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private UniteBancaireDTOmin unite;
	private NatureTransactionDTOmin natTrans;
	private String code;
	private String codeIB;
	private String reference;
	private String libelle;
	private String libEcriture;
	private String nature;
	private Double montMaxAuto;
	private Double montMaxAutoSM;
	private Long idDevExpMont;
	private String ctrlChapAuto;
	private String ctrlOppo;
	private String ctrlMontMax;
	private String ctrlFerCpte;
	private String ctrlProvision;
	private String impAvis;
	private String impBord;
	private String accordSign;
	private TypeImprimeDTOmin typeImprime;
	private TypeDateValeurDTOmin dateValeur;
	private List<ChapitreOperationDTOmin> chapitres = new ArrayList<ChapitreOperationDTOmin>();
	private String derogeable;
	private Integer nbreValidat;
	private Integer nbreJrRecy;
	private String deciRecycl;
	private String multiValid;
	private List<ValidationOperationDTOmin> validations = new ArrayList<ValidationOperationDTOmin>();
	private List<DeviseOperationDTOmin> positions = new ArrayList<DeviseOperationDTOmin>();
	private List<OppositionOperationDTOmin> oppositions = new ArrayList<OppositionOperationDTOmin>();
	
	public void toDTO(TypeOperation typeOperation){
		setId(typeOperation.getId());
		setVersion(typeOperation.getVersion());
		setCode(typeOperation.getCode());
		setLibelle(typeOperation.getLibelle());
	}
	
	public TypeOperation toEntity() throws Exception{
		initContext();
		TypeOperation typeOperation = new TypeOperation();
		typeOperation.setId(getId());
		typeOperation.setVersion(getVersion());
		typeOperation.setUnite(getUnite().toEntity());
		typeOperation.setNatTrans(getNatTrans().toEntity());
		typeOperation.setCode(getCode());
		typeOperation.setCodeIB(getCodeIB());
		typeOperation.setReference(getReference());
		typeOperation.setLibelle(getLibelle());
		typeOperation.setLibEcriture(getLibEcriture());
		typeOperation.setNature(ENatureTypOpe.valueOf(getNature()));
		typeOperation.setMontMaxAuto(getMontMaxAuto());
		typeOperation.setMontMaxAutoSM(getMontMaxAutoSM());
		DeviseUnite deviseUnite = administrationBean.findByPrimaryKey(DeviseUnite.class, getIdDevExpMont(), null);
		typeOperation.setDevExpMont(deviseUnite);
		typeOperation.setCtrlChapAuto(EYesNo.valueOf(getCtrlChapAuto()));
		typeOperation.setCtrlOppo(EYesNo.valueOf(getCtrlOppo()));
		typeOperation.setCtrlMontMax(EYesNo.valueOf(getCtrlMontMax()));
		typeOperation.setCtrlFerCpte(EYesNo.valueOf(getCtrlFerCpte()));
		typeOperation.setCtrlProvision(EYesNo.valueOf(getCtrlProvision()));
		typeOperation.setImpAvis(EYesNo.valueOf(getImpAvis()));
		typeOperation.setImpBord(EYesNo.valueOf(getImpBord()));
		typeOperation.setAccordSign(EYesNo.valueOf(getAccordSign()));
		typeOperation.setTypeImprime(getTypeImprime().toEntity());
		typeOperation.setDateValeur(getDateValeur().toEntity());
		List<ChapitreOperation> chapitreList = new ArrayList<ChapitreOperation>();
		for(ChapitreOperationDTOmin temp : getChapitres()){
			chapitreList.add(temp.toEntity());
		}
		typeOperation.setChapitres(chapitreList);
		typeOperation.setDerogeable(EYesNo.valueOf(getDerogeable()));
		typeOperation.setNbreValidat(getNbreValidat());
		typeOperation.setNbreJrRecy(getNbreJrRecy());
		typeOperation.setDeciRecycl(EDecision.valueOf(getDeciRecycl()));
		typeOperation.setMultiValid(EYesNo.valueOf(getMultiValid()));
		
		List<ValidationOperation> validationList = new ArrayList<ValidationOperation>();
		for(ValidationOperationDTOmin temp : getValidations()){
			validationList.add(temp.toEntity());
		}
		typeOperation.setValidations(validationList);
		
		List<DeviseOperation> positionList = new ArrayList<DeviseOperation>();
		for(DeviseOperationDTOmin temp : getPositions()){
			positionList.add(temp.toEntity());
		}
		typeOperation.setPositions(positionList);
		
		List<OppositionOperation> oppositionList = new ArrayList<OppositionOperation>();
		for(OppositionOperationDTOmin temp : getOppositions()){
			oppositionList.add(temp.toEntity());
		}
		typeOperation.setOppositions(oppositionList);
		
		return typeOperation;
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
	public UniteBancaireDTOmin getUnite() {
		return unite;
	}
	public void setUnite(UniteBancaireDTOmin unite) {
		this.unite = unite;
	}
	
	public NatureTransactionDTOmin getNatTrans() {
		return natTrans;
	}
	public void setNatTrans(NatureTransactionDTOmin natTrans) {
		this.natTrans = natTrans;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeIB() {
		return codeIB;
	}
	public void setCodeIB(String codeIB) {
		this.codeIB = codeIB;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getLibEcriture() {
		return libEcriture;
	}
	public void setLibEcriture(String libEcriture) {
		this.libEcriture = libEcriture;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public Double getMontMaxAuto() {
		return montMaxAuto;
	}
	public void setMontMaxAuto(Double montMaxAuto) {
		this.montMaxAuto = montMaxAuto;
	}
	public Double getMontMaxAutoSM() {
		return montMaxAutoSM;
	}
	public void setMontMaxAutoSM(Double montMaxAutoSM) {
		this.montMaxAutoSM = montMaxAutoSM;
	}
	
	public Long getIdDevExpMont() {
		return idDevExpMont;
	}
	public void setIdDevExpMont(Long idDevExpMont) {
		this.idDevExpMont = idDevExpMont;
	}
	public String getCtrlChapAuto() {
		return ctrlChapAuto;
	}
	public void setCtrlChapAuto(String ctrlChapAuto) {
		this.ctrlChapAuto = ctrlChapAuto;
	}
	public String getCtrlOppo() {
		return ctrlOppo;
	}
	public void setCtrlOppo(String ctrlOppo) {
		this.ctrlOppo = ctrlOppo;
	}
	public String getCtrlMontMax() {
		return ctrlMontMax;
	}
	public void setCtrlMontMax(String ctrlMontMax) {
		this.ctrlMontMax = ctrlMontMax;
	}
	public String getCtrlFerCpte() {
		return ctrlFerCpte;
	}
	public void setCtrlFerCpte(String ctrlFerCpte) {
		this.ctrlFerCpte = ctrlFerCpte;
	}
	public String getCtrlProvision() {
		return ctrlProvision;
	}
	public void setCtrlProvision(String ctrlProvision) {
		this.ctrlProvision = ctrlProvision;
	}
	public String getImpAvis() {
		return impAvis;
	}
	public void setImpAvis(String impAvis) {
		this.impAvis = impAvis;
	}
	public String getImpBord() {
		return impBord;
	}
	public void setImpBord(String impBord) {
		this.impBord = impBord;
	}
	public String getAccordSign() {
		return accordSign;
	}
	public void setAccordSign(String accordSign) {
		this.accordSign = accordSign;
	}
	public TypeImprimeDTOmin getTypeImprime() {
		return typeImprime;
	}
	public void setTypeImprime(TypeImprimeDTOmin typeImprime) {
		this.typeImprime = typeImprime;
	}
	public TypeDateValeurDTOmin getDateValeur() {
		return dateValeur;
	}
	public void setDateValeur(TypeDateValeurDTOmin dateValeur) {
		this.dateValeur = dateValeur;
	}
	public List<ChapitreOperationDTOmin> getChapitres() {
		return chapitres;
	}
	public void setChapitres(List<ChapitreOperationDTOmin> chapitres) {
		this.chapitres = chapitres;
	}
	public String getDerogeable() {
		return derogeable;
	}
	public void setDerogeable(String derogeable) {
		this.derogeable = derogeable;
	}
	public Integer getNbreValidat() {
		return nbreValidat;
	}
	public void setNbreValidat(Integer nbreValidat) {
		this.nbreValidat = nbreValidat;
	}
	public Integer getNbreJrRecy() {
		return nbreJrRecy;
	}
	public void setNbreJrRecy(Integer nbreJrRecy) {
		this.nbreJrRecy = nbreJrRecy;
	}
	public String getDeciRecycl() {
		return deciRecycl;
	}
	public void setDeciRecycl(String deciRecycl) {
		this.deciRecycl = deciRecycl;
	}
	public String getMultiValid() {
		return multiValid;
	}
	public void setMultiValid(String multiValid) {
		this.multiValid = multiValid;
	}
	public List<ValidationOperationDTOmin> getValidations() {
		return validations;
	}
	public void setValidations(List<ValidationOperationDTOmin> validations) {
		this.validations = validations;
	}
	public List<DeviseOperationDTOmin> getPositions() {
		return positions;
	}
	public void setPositions(List<DeviseOperationDTOmin> positions) {
		this.positions = positions;
	}
	public List<OppositionOperationDTOmin> getOppositions() {
		return oppositions;
	}
	public void setOppositions(List<OppositionOperationDTOmin> oppositions) {
		this.oppositions = oppositions;
	}
	
	

}
