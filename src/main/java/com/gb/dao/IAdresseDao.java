package com.gb.dao;

import com.gb.model.Adresse;

public interface IAdresseDao {

	/**************************************
	 ******** GESTION ADRESSE **********
	 **************************************/
	
	public void updateAdresse(Adresse a);
	public Adresse findAdresseById(Integer idAdresse);
	//l'ajout et la supression d'une adresse se fait à travers un client
}
