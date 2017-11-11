package com.gb.service;

import java.util.List;

import com.gb.model.Conseiller;
import com.gb.model.DemandeAdhesion;
import com.gb.model.DetailDemande;
import com.gb.model.Statuts;

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
