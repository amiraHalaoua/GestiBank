package com.gb.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_conseiller", referencedColumnName = "id_user")
public class Conseiller extends User {

	private static final long serialVersionUID = 1L;

	/* Attributes */
	@Column(nullable = false)
	private String password;
	@Column(unique = true, nullable = false)
	private String matricule;
	private Date date_debut;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "conseiller")
	private List<Client> clients;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "conseiller")
	private List<DemandeAdhesion> demandes;

	/* Constructors */
	public Conseiller() {
		super();
	}

	public Conseiller(String prenom, String nom, String email, String telephone, String password) {
		super(prenom, nom, email, telephone);
		this.password = password;
		this.matricule =nom.substring(0,3)+new SimpleDateFormat("HHmmss").format(new Date()); // matricule unique 
		this.date_debut = new Date();
	}

	/* Getters and Setters */
	public String getPassword() {
		return password;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMatricule() {
		return matricule;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	@Override
	public String toString() {
		return super.toString() + "Conseiller [password=" + password + ", matricule=" + matricule + ", date_debut="
				+ date_debut + ", clients=" + clients + "]";
	}

}
