package com.gk.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse implements Serializable {

	private static final long serialVersionUID = 1L;
	/* Attributes */
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id_adresse;
	private String ville;
	private String rue;
	private String cdp;
	private String complement;
	
	/* Constructors */

	public Adresse() {
		
	}
	
	public Adresse(String ville, String rue, String cdp, String complement) {
		super();
		this.ville = ville;
		this.rue = rue;
		this.cdp = cdp;
		this.complement = complement;
	}

	/* Getters and Setters */
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCdp() {
		return cdp;
	}
	public void setCdp(String cdp) {
		this.cdp = cdp;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}


	public Integer getId_adresse() {
		return id_adresse;
	}


	@Override
	public String toString() {
		return "Adresse [Id_adresse=" + id_adresse + ", ville=" + ville + ", rue=" + rue + ", cdp=" + cdp
				+ ", complement=" + complement + "]";
	}


	
	
	
	
	
}
