package com.gb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gb.dao.UserDaoImpl;
import com.gb.model.Conseiller;

@Component
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserDaoImpl userDaoImpl;

	/**************************************
	 ******** GESTION CONSEILLER **********
	 **************************************/
	public void addConseiller(Conseiller c) {
		try {
			userDaoImpl.addConseiller(c);
			System.out.println("AJOUT AVEC SUCCEE");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("ERROR LORS DE L'AJOUT");
		}
	}

	public void removeConseiller(Integer idConseiller) {
		Conseiller c = findConseillerById(idConseiller);
		if ((c != null) && (c.getClients().isEmpty())) {
			try {		
				userDaoImpl.removeConseiller(c);
				System.out.println("DELETE AVEC SUCCEE");
			} catch (Exception e) {
				e.getMessage();
				System.out.println("ERROR LORS DE LA SUPPRESSION");
			}
		}else{
			System.out.println("OBJET NOT FOUND");
		}
	}

	public void updateConseiller(Conseiller c) {
		try {
			userDaoImpl.updateConseiller(c);
			System.out.println("OK POUR LA MODIFICATION");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("ERROR LORS DE LA MODIFICATION");
		}
	}

	public Conseiller findConseillerById(Integer idConseiller) {
		return userDaoImpl.findConseillerById(idConseiller);
	}

	public List<Conseiller> findAllConseiller() {
		return userDaoImpl.findAllConseiller();
	}

	public Conseiller findConseillerByMatricule(String matricule) {
		return userDaoImpl.findConseillerByMatricule(matricule);
	}

}
