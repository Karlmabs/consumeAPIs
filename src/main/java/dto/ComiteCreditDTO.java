package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.comite.EComite;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.comite.entities.ComiteCredit;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.comite.entities.Membre;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ComiteCreditDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private UniteBancaireDTOmin unite;
	private NiveauComiteDTOmin niveau;
	private Set<MembreDTOmin> membres = new HashSet<>();
	private String code;
	private String intitule;
	private Double montantMaximumCredit;
	private Date dateCreation;
	private String etat;
	
	public void toDTO(ComiteCredit comiteCredit){
		setId(comiteCredit.getId());
		setVersion(comiteCredit.getVersion());
		setCode(comiteCredit.getCode());
		setIntitule(comiteCredit.getIntitule());
	}
	
	public ComiteCredit toEntity(){
		ComiteCredit comiteCredit = new ComiteCredit();
		comiteCredit.setId(getId());
		comiteCredit.setVersion(getVersion());
		comiteCredit.setUnite(getUnite().toEntity());
		comiteCredit.setNiveau(getNiveau().toEntity());
		comiteCredit.setCode(getCode());
		comiteCredit.setIntitule(getIntitule());
		comiteCredit.setMontantMaximumCredit(getMontantMaximumCredit());
		comiteCredit.setDateCreation(getDateCreation());
		comiteCredit.setEtat(EComite.valueOf(getEtat()));
		Set<Membre> membreList = new HashSet<>();
		for(MembreDTOmin temp: getMembres()){
			membreList.add(temp.toEntity());
		}
		comiteCredit.setMembres(membreList);
		
		return comiteCredit;
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
	public NiveauComiteDTOmin getNiveau() {
		return niveau;
	}
	public void setNiveau(NiveauComiteDTOmin niveau) {
		this.niveau = niveau;
	}
	public Set<MembreDTOmin> getMembres() {
		return membres;
	}
	public void setMembres(Set<MembreDTOmin> membres) {
		this.membres = membres;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public Double getMontantMaximumCredit() {
		return montantMaximumCredit;
	}
	public void setMontantMaximumCredit(Double montantMaximumCredit) {
		this.montantMaximumCredit = montantMaximumCredit;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
}
