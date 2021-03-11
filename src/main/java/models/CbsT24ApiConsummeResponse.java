package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CbsT24ApiConsummeResponse implements Serializable {
	
    private Object header;

    private Object body;
    
    /**
     * URL de la requette
     */
    @JsonIgnore
    private String requestUrl;
}
