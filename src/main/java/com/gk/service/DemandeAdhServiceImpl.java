package com.gk.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gk.dao.DemandeAdhDaoImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.gk.model.Conseiller;
import com.gk.model.DemandeAdhesion;
import com.gk.model.DetailDemande;
import com.gk.model.Statuts;

@Component
@Transactional
public class DemandeAdhServiceImpl implements IDemandeAdhService {

	@Autowired
	private DemandeAdhDaoImpl demandeDaoImpl;

	/**************************************
	 *** GESTION DEMANDES D'ADHESION ******
	 **************************************/
	
	public DemandeAdhesion addDemandeAdh(DemandeAdhesion d) {
		try {
			demandeDaoImpl.addDemandeAdh(d);
			System.out.println("AJOUT AVEC SUCCEE");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("ERROR LORS DE L'AJOUT");
		}
		return d;
	}

	public void updateDemande(DemandeAdhesion d) {
		try {
			demandeDaoImpl.updateDemande(d);
			System.out.println("OK POUR LA MODIFICATION");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("ERROR LORS DE LA MODIFICATION");
		}	
	}

	public void affecteDemandeToConseiller(Integer idDemandeAdh, Conseiller c) {
			demandeDaoImpl.affecteDemandeToConseiller(idDemandeAdh, c);
	}
	
	public List<DemandeAdhesion> findAllDemandeAdh() {
		return demandeDaoImpl.findAllDemandeAdh();
	}

	public List<DemandeAdhesion> findDemandeAdhByStatus(Statuts status) {
		return demandeDaoImpl.findDemandeAdhByStatus(status);
	}

	public DemandeAdhesion findDemandeById(Integer idDemandeAdh) {
		return demandeDaoImpl.findDemandeById(idDemandeAdh);
	}


	
	/**************************************
	 *** GESTION DETAILS DEMANDEADH ******
	 **************************************/
	
	public void addDetail(DetailDemande d, String path_fichier) {
		File file = new File(path_fichier);
		byte[] bFile  = new byte[(int) file.length()];	
		try{
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile );
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		d.setFichier(bFile);
		demandeDaoImpl.addDetail(d);		
	}

	public void updateDetail(DetailDemande d) {
		demandeDaoImpl.updateDetail(d);
	}

	public void removeDetail(DetailDemande d) {
		demandeDaoImpl.removeDetail(d);
	}

	public List<DetailDemande> findDetailByDemandeAdh(DemandeAdhesion d) {
		List<DetailDemande> details = demandeDaoImpl.findDetailByDemandeAdh(d);
		for(DetailDemande detail: details) {
			try{
		        FileOutputStream fos = new FileOutputStream(new File("src/images/"+detail.getNom_fichier()));
		        byte[] fichier = detail.getFichier();
		        fos.write(fichier);
		        fos.close();
		    }catch(Exception e){
		        e.printStackTrace();
		    }
		}
			return demandeDaoImpl.findDetailByDemandeAdh(d);
	}

	
}
