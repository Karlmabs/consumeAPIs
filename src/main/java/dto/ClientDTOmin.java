package dto;

import com.afrikbrain.banque.corebanking.administration.client.entities.Client;

import java.io.Serializable;

public class ClientDTOmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	
	public void toDTO(Client client){
		setId(client.getId());
		setVersion(client.getVersion());
	}
	
	public Client toEntity(){
		Client client = new Client();
		client.setId(getId());
		client.setVersion(getVersion());
		
		return client;
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
}
