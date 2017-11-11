package com.gb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.gb.model.Conseiller;
import com.gb.model.DemandeAdhesion;
import com.gb.model.DetailDemande;
import com.gb.model.Statuts;


@Component
public class DemandeAdhDaoImpl implements IDemandeAdhDao {

	@PersistenceContext
	private EntityManager em;

	
	
	/**************************************
	 *** GESTION DEMANDES D'ADHESION ******
	 **************************************/

	
	
	public DemandeAdhesion addDemandeAdh(DemandeAdhesion d) {
		em.persist(d);
		return d;
	}
	
	public void updateDemande(DemandeAdhesion d) {
		em.merge(d);
	}

	public void affecteDemandeToConseiller(Integer idDemandeAdh, Conseiller c) {
		em.createQuery("UPDATE DemandeAdhesion d SET d.conseiller = :c WHERE d.id_demandeAdh LIKE :idD")
            .setParameter("c", c)
            .setParameter("idD", idDemandeAdh)
            .executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	public List<DemandeAdhesion> findAllDemandeAdh() {
		return em.createQuery("SELECT d FROM DemandeAdhesion d").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<DemandeAdhesion> findDemandeAdhByStatus(Statuts status) {
		return em.createQuery("SELECT d FROM DemandeAdhesion d WHERE d.statut LIKE :s")
				  .setParameter("s", status)
				  .getResultList();
	}

	public DemandeAdhesion findDemandeById(Integer idDemandeAdh) {
		return em.find(DemandeAdhesion.class, idDemandeAdh);
	}

	
	
	
	
	/**************************************
	 *** GESTION DETAILS DEMANDEADH ******
	 **************************************/
	
	
	public void addDetail(DetailDemande d) {
		em.persist(d);		
	}

	public void updateDetail(DetailDemande d) {
		em.merge(d);		
	}

	public void removeDetail(DetailDemande d) {
		em.remove(d);		
	}

	@SuppressWarnings("unchecked")
	public List<DetailDemande> findDetailByDemandeAdh(DemandeAdhesion demande) {	
		return em.createQuery("SELECT d FROM DetailDemande d WHERE d.demandeAdhesion LIKE :dem")
				  .setParameter("dem", demande)
				  .getResultList();
	}

	
}