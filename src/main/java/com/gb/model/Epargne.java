package com.gb.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_compte")
public class Epargne extends Compte {

	/* Attributes */
	private static final long serialVersionUID = 1L;
	private Double taux_interet;
	private Double seuilMin;
	
	/* Constructors */
	public Epargne() {
		super();
	}
	
	public Epargne(String rIB, Client client, Double decouvert, Double taux_interet, Double seuilMin) {
		super(rIB, client, decouvert);
		this.taux_interet = taux_interet;
		this.seuilMin = seuilMin;
	}

	/* Getters and Setters */
	
	public Double getTaux_interet() {
		return taux_interet;
	}

	public void setTaux_interet(Double taux_interet) {
		this.taux_interet = taux_interet;
	}


	public Double getSeuilMin() {
		return seuilMin;
	}

	public void setSeuilMin(Double seuilMin) {
		this.seuilMin = seuilMin;
	}

	@Override
	public String toString() {
		return "Epargne [taux_interet=" + taux_interet + ", seuilMin=" + seuilMin + "]";
	}

	
	
	
	
	
	
}
