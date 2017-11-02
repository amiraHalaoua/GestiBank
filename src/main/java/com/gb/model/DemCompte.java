package com.gb.model;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("NCOMPTE")
public class DemCompte extends DemandeClient{

	private static final long serialVersionUID = 1L;

	public DemCompte() {
		// TODO Auto-generated constructor stub
	}

	public DemCompte(String libelle_dem, Client client) {
		super(libelle_dem, client);
	}

}
