package com.gk.dao;

import java.util.List;

import com.gk.model.Client;
import com.gk.model.Conseiller;
import com.gk.model.User;

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
	public Client addClient(Client c); // il est d�j� dans la table user => au lieu .persist plut�t creatQuery insert
	public void removeClient(Client c);
	public void updateClient(Client c);
	public Client findClientById(Integer idClient);
	public List<Client> findAllClient();
	public List<Client> findClientByConseiller(Conseiller c); // soit ByIdConseiller
	
}
