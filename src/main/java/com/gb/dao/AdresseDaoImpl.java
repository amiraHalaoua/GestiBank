package com.gb.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.gb.model.Adresse;
@Component
public class AdresseDaoImpl implements IAdresseDao {

	@PersistenceContext
	private EntityManager em;
	
	/**************************************
	 ******** GESTION ADRESSE **********
	 **************************************/
	
	public void updateAdresse(Adresse a) {
		em.merge(a);
	}

	public Adresse findAdresseById(Integer idAdresse) {
		return em.find(Adresse.class, idAdresse);
	}

	
}
