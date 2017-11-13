package com.gk.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Agios {

	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private Integer id_agios;
	private Date date_debut;
	private Date date_fin;
	private Double agios; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Compte compte;
	
	/* Constructors */
	public Agios() {
		
	}

	public Agios(Compte compte) {
		super();
		this.compte = compte;
		this.date_debut = new Date();
	
	}

	/* Getters and Setters */
	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public Double getAgios() {
		return agios;
	}

	public void setAgios(Double agios) {
		this.agios = agios;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Integer getId_agios() {
		return id_agios;
	}

	public Date getDate_debut() {
		return date_debut;
	}

}
