package dto;

import com.afrikbrain.banque.corebanking.engagement.tresorerie.comite.entities.DossierSession;
import com.afrikbrain.banque.corebanking.engagement.tresorerie.comite.entities.DossierSessionPK;

import java.io.Serializable;

public class DossierSessionDTOmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long sessionId;
	private Long dossierId;
	private int version;
	
	public DossierSession toEntity(){
		DossierSession dossierSession = new DossierSession();
		DossierSessionPK id = new DossierSessionPK();
		id.setDossierId(getDossierId());
		id.setSessionId(getSessionId());
		dossierSession.setId(id);
		dossierSession.setVersion(getVersion());
		
		return dossierSession;
	}
	
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	public Long getDossierId() {
		return dossierId;
	}
	public void setDossierId(Long dossierId) {
		this.dossierId = dossierId;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
}
