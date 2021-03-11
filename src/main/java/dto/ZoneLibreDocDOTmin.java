package dto;

import com.afrikbrain.banque.corebanking.engagement.garantie.entities.ZoneLibreDoc;

import java.io.Serializable;

public class ZoneLibreDocDOTmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String valeur;
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
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	
	public ZoneLibreDoc toEntity(){
		ZoneLibreDoc zoneLibreDoc = new ZoneLibreDoc();
		zoneLibreDoc.setId(getId());
		zoneLibreDoc.setValeur(getValeur());
		zoneLibreDoc.setVersion(getVersion());
		
		return zoneLibreDoc;
	}
	
}
