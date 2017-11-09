package com.gb.dao;

import java.util.List;

import com.gb.model.Client;
import com.gb.model.Conseiller;

public interface IUserDao {
	
	
	
	
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
	 ******** GESTION CONSEILLER **********
	 **************************************/
	public void addClient(Client c);
	public void removeClientr(Client c);
	public void updateClient(Client c);
	public Client findClientById(Integer idClient);
	public List<Client> findAllClient();
	public List<Client> findClientByConseillet(Conseiller c); // soit ByIdConseiller
	
}
