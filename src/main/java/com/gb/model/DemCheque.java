package com.gb.model;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("CHEQUE")
public class DemCheque extends DemandeClient{

	private static final long serialVersionUID = 1L;

	public DemCheque() {
		
	}

	public DemCheque(String libelle_dem, Client client) {
		super(libelle_dem, client);
	}

	
}
