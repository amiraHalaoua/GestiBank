package com.gb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.jpa.criteria.predicate.IsEmptyPredicate;
import org.springframework.stereotype.Component;

import com.gb.model.Client;
import com.gb.model.Conseiller;

//@Repository("UserDao")
@Component
public class UserDaoImpl implements IUserDao {

	@PersistenceContext
	private EntityManager em;

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
	public List<Conseiller> findAllConseiller() {
		return em.createQuery("SELECT c FROM Conseiller c").getResultList();
	}

	public Conseiller findConseillerByMatricule(String matricule) {
		System.out.println("dao"+ matricule);
		return (Conseiller) em.createQuery("SELECT c FROM Conseiller c WHERE c.matricule LIKE :m")
							  .setParameter("m", matricule)
							  .getSingleResult();
	}

	/**************************************
	 ******** GESTION CONSEILLER **********
	 **************************************/
	public void addClient(Client c) {
		// TODO Auto-generated method stub
		
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