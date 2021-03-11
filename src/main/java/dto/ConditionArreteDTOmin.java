package dto;

import com.afrikbrain.banque.corebanking.administration.arretes.entities.ConditionArrete;

import java.io.Serializable;

public class ConditionArreteDTOmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	private String code;
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
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public ConditionArrete toEntity(){
		ConditionArrete conditionArrete = new ConditionArrete();
		conditionArrete.setId(getId());
		conditionArrete.setVersion(getVersion());
		conditionArrete.setCode(getCode());
		return conditionArrete;
	}
}
