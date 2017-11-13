package com.gk.service;


import java.util.List;

import com.gk.model.Conseiller;
import com.gk.model.User;

public interface IUserService {
	/**************************************
	 ******** GESTION CONSEILLER **********
	 **************************************/
	public User addUser(User u);
	public void updateUser(User u);
	public User findUserById(Integer idUser);
	
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
