package com.gb.model;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("CREDIT")
public class Credit extends Operation {

	
	private static final long serialVersionUID = 1L;

	public Credit() {
		
	}

	public Credit(Double montant, String libelle) {
		super(montant, libelle);
	}


}
