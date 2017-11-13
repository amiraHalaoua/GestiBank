package com.gk.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_notif;
	private Date date_notif;
	private String objet;
	private String message;
	@ManyToOne(fetch = FetchType.LAZY)
	private Client client;

	/* constructor */
	public Notification() {
		super();
	}

	public Notification(String objet, String message, Client client) {
		super();
		this.date_notif = new Date();
		this.objet = objet;
		this.message = message;
		this.client = client;
	}

	/* getters and setters */
	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Integer getId_notif() {
		return id_notif;
	}

	public Date getDate_notif() {
		return date_notif;
	}

}
