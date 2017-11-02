package com.gb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_client", referencedColumnName = "id_user")
public class Client extends User {

	private static final long serialVersionUID = 1L;
	/* Attributes */
	private String password;
	
	@OneToMany(cascade= {CascadeType.ALL},orphanRemoval = true, mappedBy="client")
	private List<Compte> comptes;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_conseiller")
	private Conseiller conseiller;
	
	@OneToMany(cascade= {CascadeType.ALL},orphanRemoval = true, mappedBy="client")
	private List<DemandeClient> demandes;
	
	
	/* Constructors */
	public Client() {

	}

	public Client(String prenom, String nom, String email, String telephone, Adresse adresse, String password, String pseudo) {
		super(prenom, nom, email, telephone, adresse, pseudo);
		this.password = password;
	}

	
	/* Getters and Setters */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public List<DemandeClient> getDemandes() {
		return demandes;
	}

	public void setDemandes(List<DemandeClient> demandes) {
		this.demandes = demandes;
	}

	@Override
	public String toString() {
		return super.toString() + "Client [comptes=" + comptes + "]";
	}
}
