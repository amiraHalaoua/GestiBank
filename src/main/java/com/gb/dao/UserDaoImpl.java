package com.gb.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.jpa.criteria.predicate.IsEmptyPredicate;
import org.springframework.stereotype.Component;

import com.gb.model.Conseiller;

//@Repository("UserDao")
@Component
public class UserDaoImpl implements IUserDao {

	@PersistenceContext
	private EntityManager em;

	/************************************ GESTION CONSEILLER ***************************************/
	public void addConseiller(Conseiller c) {
		em.persist(c);
	}

	public void removeConseiller(Integer idConseiller) {
		Conseiller c= em.find(Conseiller.class, idConseiller);
		if ((c != null) && (c.getClients().isEmpty())) {
			em.remove(c);
		}else{
			System.out.println("Impossible de supprimer ce conseiller");
		}
	}

}