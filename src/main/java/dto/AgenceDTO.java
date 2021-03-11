/**
 * 
 */
package dto;

import com.afrikbrain.banque.corebanking.administration.structures.entities.Agence;

import java.io.Serializable;

/**
 * Desing Pattern DTO used to transform an Agence object
 * @author Stephane Fedim</a>
 * @since 06 Jan 2021
 */
public class AgenceDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Code de l'agence
	 */
	private String agenceCode;
	/**
	 * Nom de l'agence
	 */
	private String agenceName;

	/**
	 * Default COnstructor
	 */
	public AgenceDTO() {}

	/**
	 * @param agenceCode = Code Agence
	 * @param agenceName = Nom de l'agence
	 */
	public AgenceDTO(String agenceCode, String agenceName) {
		super();
		this.agenceCode = agenceCode;
		this.agenceName = agenceName;
	}



	public String getAgenceCode() {
		return agenceCode;
	}

	public void setAgenceCode(String agenceCode) {
		this.agenceCode = agenceCode;
	}

	public String getAgenceName() {
		return agenceName;
	}

	public void setAgenceName(String agenceName) {
		this.agenceName = agenceName;
	}
	
	public void toDTO(Agence agence){
		this.agenceCode = agence.getCode();
		this.agenceName = agence.getNom();
	}
	
	@Override
	public String toString() {
		return "AgenceDTO [Code agence=" + agenceCode + ", Nom agence=" + agenceCode + "]";
	}

}
