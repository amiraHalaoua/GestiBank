package com.gk.service;

import java.util.List;

import com.gk.model.Conseiller;
import com.gk.model.DemandeAdhesion;
import com.gk.model.DetailDemande;
import com.gk.model.Statuts;

public interface IDemandeAdhService {

	public DemandeAdhesion addDemandeAdh(DemandeAdhesion d);
	public void updateDemande(DemandeAdhesion d);
	public void affecteDemandeToConseiller(Integer idDemandeAdh,  Conseiller c);
	public DemandeAdhesion findDemandeById(Integer idDemandeAdh);
	public List<DemandeAdhesion> findAllDemandeAdh();
	public List<DemandeAdhesion> findDemandeAdhByStatus(Statuts status);
	
	/**************************************
	 *** GESTION DETAILS DEMANDEADH ******
	 **************************************/
	
	public void addDetail(DetailDemande d,String path_fihcier);
	public void updateDetail(DetailDemande d);
	public void removeDetail(DetailDemande d);
	public List<DetailDemande> findDetailByDemandeAdh(DemandeAdhesion d);
}
