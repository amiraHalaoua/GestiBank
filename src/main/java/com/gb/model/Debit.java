package com.gb.model;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("DEBIT")
public class Debit extends Operation {

	private static final long serialVersionUID = 1L;

	public Debit() {
	}

	public Debit(Double montant, String libelle) {
		super(montant, libelle);
	}


}
