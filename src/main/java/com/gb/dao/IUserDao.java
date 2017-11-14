package com.gb.dao;

import java.util.List;

import com.gb.model.Client;
import com.gb.model.Conseiller;
import com.gb.model.User;

public interface IUserDao {
	/**************************************
	 ******** GESTION USER ***************
	 **************************************/
	public User addUser(User u);
	public void updateUser(User u);
	public User findUserById(Integer idUser);
	
	/**************************************
	 ******** GESTION CONSEILLER **********
	 **************************************/
	public void addConseiller(Conseiller c);
	public void removeConseiller(Conseiller c);
	public void updateConseiller(Conseiller c);
	public Conseiller findConseillerById(Integer idConseiller);
	public List<Conseiller> findAllConseiller();
	public Conseiller findConseillerByMatricule(String matricule);
	
	
	
	/**************************************
	 ******** GESTION CLIENT *************
	 **************************************/
	public Client addClient(Integer idUser); // il est déjà dans la table user => au lieu .persist plutôt creatQuery insert
	public void removeClient(Client c);
	public void updateClient(Client c);
	public Client findClientById(Integer idClient);
	public List<Client> findAllClient();
	public List<Client> findClientByConseiller(Conseiller c); 
	

}
