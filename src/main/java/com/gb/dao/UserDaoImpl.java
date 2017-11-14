package com.gb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.gb.model.Client;
import com.gb.model.Conseiller;
import com.gb.model.User;


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
	 ******** GESTION CLIENT **********
	 **************************************/
	public Client addClient(Integer idUser) {
		return null;
	}

	public void removeClient(Client c) {
		em.remove(c);
	}

	public void updateClient(Client c) {
		em.merge(c);
	}

	public Client findClientById(Integer idClient) {
		return em.find(Client.class, idClient);
	}

	@SuppressWarnings("unchecked")
	public List<Client> findAllClient() {
		return em.createQuery("SELECT c FROM Client c").getResultList();
	}

	public List<Client> findClientByConseiller(Conseiller c) {
		// TODO Auto-generated method stub
		return null;
	}




	
	
	
}