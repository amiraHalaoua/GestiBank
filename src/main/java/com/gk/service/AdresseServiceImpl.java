package com.gk.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gk.dao.AdresseDaoImpl;
import com.gk.model.Adresse;

@Component
@Transactional
public class AdresseServiceImpl implements IAdresseService {

	@Autowired
	private AdresseDaoImpl adressDaoImpl;
	
	public void updateAdresse(Adresse a) {
		try {
			adressDaoImpl.updateAdresse(a);;
			System.out.println("OK POUR LA MODIFICATION");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("ERROR LORS DE LA MODIFICATION");
		}	

	}

	public Adresse findAdresseById(Integer idAdresse) {
		return adressDaoImpl.findAdresseById(idAdresse);
	}

}
