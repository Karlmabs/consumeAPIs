package dto;

import com.afrikbrain.banque.corebanking.administration.compte.entities.Reservation;

import java.io.Serializable;

public class ReservationDTOmin implements Serializable{

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
	public Reservation toEntity(){
		Reservation reservation = new Reservation();
		reservation.setId(getId());
		reservation.setVersion(getVersion());
		reservation.setCode(getCode());
		return reservation;
	}
}
