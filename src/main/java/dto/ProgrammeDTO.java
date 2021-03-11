package dto;

import com.afrikbrain.banque.corebanking.administration.tfjo.entities.Programme;
import com.afrikbrain.util.enumeration.EYesNo;

import java.io.Serializable;

public class ProgrammeDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String code;
	private String libelle;
	private String jndiName;
	private String tfjoJndiName;
	private String methodeName;
	private String description;
	private String report;
	private String system;
	private String editerEtat;
	private String nextDate;
	
	public Programme toEntity(){
		Programme programme = new Programme();
		programme.setId(getId());
		programme.setCode(getCode());
		programme.setLibelle(getLibelle());
		programme.setJndiName(getJndiName());
		programme.setTfjoJndiName(getTfjoJndiName());
		programme.setMethodeName(getMethodeName());
		programme.setDescription(getDescription());
		programme.setReport(getReport());
		programme.setSystem(EYesNo.valueOf(getSystem()));
		programme.setEditerEtat(EYesNo.valueOf(getEditerEtat()));
		programme.setNextDate(EYesNo.valueOf(getNextDate()));
		
		return programme;
	}
	
	public void toDTO(Programme programme){
		setId(programme.getId());
		setCode(programme.getCode());
		setLibelle(programme.getLibelle());
		setJndiName(programme.getJndiName());
		setTfjoJndiName(programme.getTfjoJndiName());
		setMethodeName(programme.getMethodeName());
		setDescription(programme.getDescription());
		setReport(programme.getReport());
		setSystem(programme.getSystem().toString());
		setEditerEtat(programme.getEditerEtat().toString());
		setNextDate(programme.getNextDate().toString());
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getJndiName() {
		return jndiName;
	}
	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}
	public String getTfjoJndiName() {
		return tfjoJndiName;
	}
	public void setTfjoJndiName(String tfjoJndiName) {
		this.tfjoJndiName = tfjoJndiName;
	}
	public String getMethodeName() {
		return methodeName;
	}
	public void setMethodeName(String methodeName) {
		this.methodeName = methodeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getEditerEtat() {
		return editerEtat;
	}
	public void setEditerEtat(String editerEtat) {
		this.editerEtat = editerEtat;
	}
	public String getNextDate() {
		return nextDate;
	}
	public void setNextDate(String nextDate) {
		this.nextDate = nextDate;
	}
	
	

}
