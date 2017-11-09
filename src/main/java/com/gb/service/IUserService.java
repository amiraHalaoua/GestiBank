package com.gb.service;


import java.util.List;

import com.gb.model.Conseiller;

public interface IUserService {
	/**************************************
	 ******** GESTION CONSEILLER **********
	 **************************************/
	public void addConseiller(Conseiller c);
	public void removeConseiller(Integer idConseiller);
	public void updateConseiller(Conseiller c);
	public Conseiller findConseillerById(Integer idConseiller);
	public List<Conseiller> findAllConseiller();
	public Conseiller findConseillerByMatricule(String matricule);
}
