package com.gb.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.gb.model.Conseiller;
//@Repository("UserDao")
@Component
public class UserDaoImpl implements IUserDao{

	@PersistenceContext
	private EntityManager em;

	/********* GESTION CONSEILLER ************/
	public void addConseiller(Conseiller c) {
		em.persist(c);	
	}


	
}