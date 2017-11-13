package com.gk.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_DC", discriminatorType = DiscriminatorType.STRING)
public abstract class DemandeClient implements Serializable {

	/* Attributes */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_demandeClient;
	private Date date_dem;
	private Date date_trait;
	private String libelle_dem;
	private Statuts statut;
	@ManyToOne
	private Client client;
	
	/* Constructors */
	public DemandeClient() {

	}

	

	public DemandeClient(String libelle_dem, Client client) {
		super();
		this.libelle_dem = libelle_dem;
		this.statut = Statuts.EN_ATTENTE;
		this.client = client;
		this.date_dem = new Date();
		
	}



	/* Getters and Settters */
	public String getLibelle_dem() {
		return libelle_dem;
	}

	public void setLibelle_dem(String libelle_dem) {
		this.libelle_dem = libelle_dem;
	}

	public Statuts getStatut() {
		return statut;
	}

	public void setStatut(Statuts statut) {
		this.statut = statut;
	}

	public Integer getId_demandeClient() {
		return id_demandeClient;
	}

	public Date getDate_dem() {
		return date_dem;
	}

	public Date getDate_trait() {
		return date_trait;
	}

	public void setDate_trait(Date date_trait) {
		this.date_trait = date_trait;
	}

}
