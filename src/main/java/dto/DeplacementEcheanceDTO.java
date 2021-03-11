package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.DeblocageParticipant;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.DeplacementEcheance;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.entities.Echeance;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeplacementEcheanceDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private Long userId;
	private String code;
	private String numEchDeplacer;
	private String numEchJumeler;
	private DeblocageDTOmin deblocage;
	private List<EcheanceDTOmin> echeances = new ArrayList<EcheanceDTOmin>();
	private List<EcheanceDTOmin> echeancesTeteFile = new ArrayList<EcheanceDTOmin>();
	private List<DeblocageParticipantDTOmin> deblocageParticipants = new ArrayList<DeblocageParticipantDTOmin>();
	
	public void toDTO(DeplacementEcheance deplacementEcheance){
		setId(deplacementEcheance.getId());
		setVersion(deplacementEcheance.getVersion());
		setCode(deplacementEcheance.getCode());
	}
	
	public DeplacementEcheance toEntity(){
		DeplacementEcheance deplacementEcheance = new DeplacementEcheance();
		deplacementEcheance.setId(getId());
		deplacementEcheance.setVersion(getVersion());
		deplacementEcheance.setUserId(getUserId());
		deplacementEcheance.setCode(getCode());
		deplacementEcheance.setNumEchDeplacer(getNumEchDeplacer());
		deplacementEcheance.setNumEchJumeler(getNumEchJumeler());
		deplacementEcheance.setDeblocage(getDeblocage().toEntity());
		
		List<Echeance> echeanceList = new ArrayList<Echeance>();
		for(EcheanceDTOmin temp : getEcheances()){
			echeanceList.add(temp.toEntity());
		}
		deplacementEcheance.setEcheances(echeanceList);
		List<Echeance> echeancesTeteFileList = new ArrayList<Echeance>();
		for(EcheanceDTOmin temp : getEcheancesTeteFile()){
			echeancesTeteFileList.add(temp.toEntity());
		}
		deplacementEcheance.setEcheancesTeteFile(echeancesTeteFileList);
		List<DeblocageParticipant> deblocageParticipantList = new ArrayList<DeblocageParticipant>();
		for(DeblocageParticipantDTOmin temp : getDeblocageParticipants()){
			deblocageParticipantList.add(temp.toEntity());
		}
		deplacementEcheance.setDeblocageParticipants(deblocageParticipantList);
		
		return deplacementEcheance;
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNumEchDeplacer() {
		return numEchDeplacer;
	}
	public void setNumEchDeplacer(String numEchDeplacer) {
		this.numEchDeplacer = numEchDeplacer;
	}
	public String getNumEchJumeler() {
		return numEchJumeler;
	}
	public void setNumEchJumeler(String numEchJumeler) {
		this.numEchJumeler = numEchJumeler;
	}
	public DeblocageDTOmin getDeblocage() {
		return deblocage;
	}
	public void setDeblocage(DeblocageDTOmin deblocage) {
		this.deblocage = deblocage;
	}
	public List<EcheanceDTOmin> getEcheances() {
		return echeances;
	}
	public void setEcheances(List<EcheanceDTOmin> echeances) {
		this.echeances = echeances;
	}
	public List<EcheanceDTOmin> getEcheancesTeteFile() {
		return echeancesTeteFile;
	}
	public void setEcheancesTeteFile(List<EcheanceDTOmin> echeancesTeteFile) {
		this.echeancesTeteFile = echeancesTeteFile;
	}
	public List<DeblocageParticipantDTOmin> getDeblocageParticipants() {
		return deblocageParticipants;
	}
	public void setDeblocageParticipants(List<DeblocageParticipantDTOmin> deblocageParticipants) {
		this.deblocageParticipants = deblocageParticipants;
	}
	
	
}
