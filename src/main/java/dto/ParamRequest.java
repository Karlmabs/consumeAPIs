package dto;

import java.io.Serializable;
import java.util.HashMap;

public class ParamRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HashMap<String, String> alias;
	private HashMap<String, String> like;
	private HashMap<String, Object> equal;
	
	private Integer first;
	private Integer max;
	private Long uniteId;
	private String code;

	public HashMap<String, String> getAlias() {
		return alias;
	}

	public void setAlias(HashMap<String, String> alias) {
		this.alias = alias;
	}

	public HashMap<String, String> getLike() {
		return like;
	}

	public void setLike(HashMap<String, String> like) {
		this.like = like;
	}

	public HashMap<String, Object> getEqual() {
		return equal;
	}

	public void setEqual(HashMap<String, Object> equal) {
		this.equal = equal;
	}

	public Integer getFirst() {
		return first;
	}

	public void setFirst(Integer first) {
		this.first = first;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Long getUniteId() {
		return uniteId;
	}

	public void setUniteId(Long uniteId) {
		this.uniteId = uniteId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
