package com.gk.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class DetailDemande implements Serializable {

	private static final long serialVersionUID = 1L;

	/* Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_detailDemande;
	private String nom_fichier;
	@Lob
	private byte[] fichier;
	@ManyToOne
	@JoinColumn(name="FK_demandeAdh")
	private DemandeAdhesion demandeAdhesion;

	/* Constructors */
	public DetailDemande() {

	}

	public DetailDemande(String nom_fichier,DemandeAdhesion demandeAdhesion) {
		super();
		this.nom_fichier = nom_fichier;
		this.demandeAdhesion = demandeAdhesion;
	}

	/* Getters and Setters */
	public String getNom_fichier() {
		return nom_fichier;
	}

	public void setNom_fichier(String nom_fichier) {
		this.nom_fichier = nom_fichier;
	}

	public byte[] getFichier() {
		return fichier;
	}

	public void setFichier(byte[] fichier) {
		this.fichier = fichier;
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

	@Override
	public String toString() {
		return "DetailDemande [id_detailDemande=" + id_detailDemande + ", nom_fichier=" + nom_fichier
				+ ", fichier=" + fichier + ", demandeAdhesion=" + demandeAdhesion + "]";
	}


	
}
