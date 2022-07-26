package projeto.evidencia.loja.dto;

import java.io.Serializable;
import java.time.Instant;

import projeto.evidencia.loja.entities.User;

public class OrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Instant moment;

	private User client;

	public OrderDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

}