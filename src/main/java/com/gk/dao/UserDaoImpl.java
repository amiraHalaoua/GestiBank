package com.gk.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.gk.model.Client;
import com.gk.model.Conseiller;
import com.gk.model.User;


@Component
public class UserDaoImpl implements IUserDao {

	@PersistenceContext
	private EntityManager em;

	/**************************************
	 ******** GESTION DES DEMANDES D'ADHESION ***************
	 **************************************/
	public User addUser(User u) {
		em.persist(u);
		return u;
	}
	
	public void updateUser(User u) {
		em.merge(u);
	}
	
	public User findUserById(Integer idUser) {
		return em.find(User.class, idUser);

	}
	/**************************************
	 ******** GESTION CONSEILLER **********
	 **************************************/

	public void addConseiller(Conseiller c) {
		em.persist(c);
	}

	public void removeConseiller(Conseiller c) {
		em.remove(c);
	}

	public void updateConseiller(Conseiller c) {
		em.merge(c);
	}

	public Conseiller findConseillerById(Integer idConseiller) {
		return em.find(Conseiller.class, idConseiller);

	}

	/* IF NOT FOUND => return null */
	@SuppressWarnings("unchecked")
	public List<Conseiller> findAllConseiller() {
		return em.createQuery("SELECT c FROM Conseiller c").getResultList();
	}

	public Conseiller findConseillerByMatricule(String matricule) {
		return (Conseiller) em.createQuery("SELECT c FROM Conseiller c WHERE c.matricule LIKE :m")
							  .setParameter("m", matricule)
							  .getSingleResult();
	}

	/**************************************
	 ******** GESTION CONSEILLER **********
	 **************************************/
	public Client addClient(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeClientr(Client c) {
		// TODO Auto-generated method stub
		
	}

	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		
	}

	public Client findClientById(Integer idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Client> findAllClient() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Client> findClientByConseillet(Conseiller c) {
		// TODO Auto-generated method stub
		return null;
	}




	
	
	
}