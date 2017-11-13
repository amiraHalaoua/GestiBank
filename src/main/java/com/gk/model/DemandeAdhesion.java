package com.gk.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DemandeAdhesion implements Serializable {

	/* Attributes */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_demandeAdh;

	// enum statut
	@Enumerated(value=EnumType.STRING)
	private Statuts statut;
	
	private Date date_demande;
	private Date date_trait;
	@OneToOne
	@JoinColumn(name="FK_conseiller")
	private Conseiller conseiller;
	@OneToOne
	@JoinColumn(name="FK_user")
	private User user;
	@OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "demandeAdhesion")
	private List<DetailDemande> detailsDemande;

	/* Constructors */

	public DemandeAdhesion(User user) {
		super();
		this.date_demande = new Date();
		this.user = user;
		this.statut= Statuts.EN_ATTENTE;
	}

	public DemandeAdhesion() {
		super();
		this.date_demande = new Date();
		this.statut= Statuts.EN_ATTENTE;
	}

	/* Getters and Setters */

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<DetailDemande> getDetailsDemande() {
		return detailsDemande;
	}

	public void setDetailsDemande(List<DetailDemande> detailsDemande) {
		this.detailsDemande = detailsDemande;
	}

	public Integer getId_demandeAdh() {
		return id_demandeAdh;
	}

	public Statuts getStatut() {
		return statut;
	}

	public void setStatut(Statuts statut) {
		this.statut = statut;
	}
	
	public Date getDate_demande() {
		return date_demande;
	}

	public Date getDate_trait() {
		return date_trait;
	}

	public void setDate_trait(Date date_trait) {
		this.date_trait = date_trait;
	}

	@Override
	public String toString() {
		return "DemandeAdhesion [id_demandeAdh=" + id_demandeAdh + ", statut=" + statut + ", date_demande="
				+ date_demande + ", date_trait=" + date_trait + ", conseiller=" + conseiller + ", user=" + user + "]";
	}

	

}
