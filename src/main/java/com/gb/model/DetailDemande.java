package com.gb.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetailDemande implements Serializable {

	private static final long serialVersionUID = 1L;

	/* Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_detailDemande;
	private String nom_fichier;
	private String path_fichier;
	@ManyToOne
	@JoinColumn(name="FK_demandeAdh")
	private DemandeAdhesion demandeAdhesion;

	/* Constructors */
	public DetailDemande() {

	}

	public DetailDemande(String nom_fichier, String path_fichier, DemandeAdhesion demandeAdhesion) {
		super();
		this.nom_fichier = nom_fichier;
		this.path_fichier = path_fichier;
		this.demandeAdhesion = demandeAdhesion;
	}

	/* Getters and Setters */
	public String getNom_fichier() {
		return nom_fichier;
	}

	public void setNom_fichier(String nom_fichier) {
		this.nom_fichier = nom_fichier;
	}

	public String getPath_fichier() {
		return path_fichier;
	}

	public void setPath_fichier(String path_fichier) {
		this.path_fichier = path_fichier;
	}

	public Integer getId_detailDemande() {
		return id_detailDemande;
	}

	public DemandeAdhesion getDemandeAdhesion() {
		return demandeAdhesion;
	}

	public void setDemandeAdhesion(DemandeAdhesion demandeAdhesion) {
		this.demandeAdhesion = demandeAdhesion;
	}

}
