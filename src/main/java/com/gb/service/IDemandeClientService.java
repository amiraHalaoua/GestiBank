package com.gb.service;

import java.util.List;

import com.gb.model.DemCheque;

public interface IDemandeClientService {

	public void addDemCheque(DemCheque d);
	public void updateDemCheque(DemCheque d);
	public DemCheque findDemChequeById(Integer idDemCheque);
	public List<DemCheque> findAllDemCheque();

}
