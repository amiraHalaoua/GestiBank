package com.gk.dao;

import com.gk.model.Adresse;

public interface IAdresseDao {

	/**************************************
	 ******** GESTION ADRESSE **********
	 **************************************/
	
	public void updateAdresse(Adresse a);
	public Adresse findAdresseById(Integer idAdresse);
	//l'ajout et la supression d'une adresse se fait � travers un user
}
