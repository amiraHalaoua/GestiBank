package com.gb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.gb.model.DemCheque;



@Component
public class DemandeClientDaoImpl implements IDemandeClientDao {

	@PersistenceContext
	private EntityManager em;

	/**************************************
	 ***** GESTION DEMANDES CHEQUE ********
	 **************************************/
	
	public void addDemCheque(DemCheque d) {
		em.persist(d);
	}

	public void updateDemCheque(DemCheque d) {
		em.merge(d);
	}

	public DemCheque findDemChequeById(Integer idDemCheque) {
		return em.find(DemCheque.class, idDemCheque);
	}

	@SuppressWarnings("unchecked")
	public List<DemCheque> findAllDemCheque() {
		return em.createQuery("SELECT d FROM DemandeClient d WHERE d.TYPE_DC = 'DemCheque' ").getResultList();
	}


}