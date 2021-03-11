package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Modele de reponse au resultat des api
 * @author <a href="mailto:nacis_djiomou@afrilandfirstbank.com">Nacis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @version 1.0
 * @since 2020-08-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CbsApiResponse {
	
	/**
	 * Result
	 */
    private Boolean success = false;
    
    /**
     * Message
     */
    private String message;
    
    /**
     * Valeur retournee
     */
    private Object value;
    
}
