package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.comite.ESession;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.comite.entities.DossierSession;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.comite.entities.Membre;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.comite.entities.SessionComite;

import java.io.Serializable;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

public class SessionComiteDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private UniteBancaireDTOmin unite;
	private ComiteCreditDTOmin comite;
	private Set<MembreDTOmin> participants = new HashSet<>();
	private Set<DossierSessionDTOmin> dossiers = new HashSet<>();
	private Time heureDebut;
	private Time heureFin;
	private String lieuSession;
	private String etat;
	
	public void toDTO(SessionComite sessionComite){
		setId(sessionComite.getId());
		setVersion(sessionComite.getVersion());
		setHeureDebut(sessionComite.getHeureDebut());
		setHeureFin(sessionComite.getHeureFin());
		setEtat(sessionComite.getEtat().toString());
	}
	
	public SessionComite toEntity(){
		SessionComite sessionComite = new SessionComite();
		sessionComite.setId(getId());
		sessionComite.setVersion(getVersion());
		sessionComite.setUnite(getUnite().toEntity());
		sessionComite.setComite(getComite().toEntity());
		sessionComite.setHeureDebut(getHeureDebut());
		sessionComite.setHeureFin(getHeureFin());
		sessionComite.setLieuSession(getLieuSession());
		sessionComite.setEtat(ESession.valueOf(getEtat()));
		Set<Membre> participantList = new HashSet<>();
		for(MembreDTOmin temp: getParticipants()){
			participantList.add(temp.toEntity());
		}
		Set<DossierSession> dossierList = new HashSet<>();
		for(DossierSessionDTOmin temp : getDossiers()){
			dossierList.add(temp.toEntity());
		}
		sessionComite.setParticipants(participantList);
		sessionComite.setDossiers(dossierList);
		
		return sessionComite;
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
	public ComiteCreditDTOmin getComite() {
		return comite;
	}
	public void setComite(ComiteCreditDTOmin comite) {
		this.comite = comite;
	}
	public Set<MembreDTOmin> getParticipants() {
		return participants;
	}
	public void setParticipants(Set<MembreDTOmin> participants) {
		this.participants = participants;
	}
	public Set<DossierSessionDTOmin> getDossiers() {
		return dossiers;
	}
	public void setDossiers(Set<DossierSessionDTOmin> dossiers) {
		this.dossiers = dossiers;
	}
	public Time getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(Time heureDebut) {
		this.heureDebut = heureDebut;
	}
	public Time getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Time heureFin) {
		this.heureFin = heureFin;
	}
	public String getLieuSession() {
		return lieuSession;
	}
	public void setLieuSession(String lieuSession) {
		this.lieuSession = lieuSession;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	

}
