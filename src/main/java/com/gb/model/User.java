package com.gb.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	/* Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_user;
	private String prenom;
	private String nom;
	private String email;
	private String telephone;
	private String pseudo;
	@OneToOne(cascade = { CascadeType.ALL }, orphanRemoval = true)
	@JoinColumn(name="id_adresse")
	private Adresse adresse;
	
	/* Constructors */
	public User() {

	}

	public User(String prenom, String nom, String email) {
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
	}

	public User(String prenom, String nom, String email, String telephone) {
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.telephone = telephone;
	}

	public User(String prenom, String nom, String email, String telephone, Adresse adresse, String pseudo) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
		this.pseudo = pseudo;
	}

	/* Getters and Setters */
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getId_user() {
		return id_user;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", email="
				+ email + ", telephone=" + telephone + ", pseudo=" + pseudo + "]";
	}
}

	