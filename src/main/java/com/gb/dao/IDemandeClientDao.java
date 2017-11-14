package com.gb.dao;

import java.util.List;

import com.gb.model.DemCheque;


public interface IDemandeClientDao {
	
//	public List<DemandeClient> findAllDemClientByClient(Client c);
//	public List<DemandeClient> findAllDemClientByConseiller(Conseiller c);
	
	/**************************************
	 ***** GESTION DEMANDES CHEQUE ********
	 **************************************/

	public void addDemCheque(DemCheque d);
	public void updateDemCheque(DemCheque d);
	public DemCheque findDemChequeById(Integer idDemCheque);
	public List<DemCheque> findAllDemCheque();

	/**************************************
	 ****** GESTION NOTIFICATIONS **********
	 **************************************/
	
	
	
	
}
