package com.gb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gb.dao.DemandeClientDaoImpl;
import com.gb.model.DemCheque;

@Component
@Transactional
public class DemandeClientServiceImpl implements IDemandeClientService {

	@Autowired
	private DemandeClientDaoImpl demandeClientDao;

	/**************************************
	 ***** GESTION DEMANDES CHEQUE ********
	 **************************************/
	
	public void addDemCheque(DemCheque d) {
		demandeClientDao.addDemCheque(d);
	}

	public void updateDemCheque(DemCheque d) {
		demandeClientDao.updateDemCheque(d);
	}

	public DemCheque findDemChequeById(Integer idDemCheque) {
		return demandeClientDao.findDemChequeById(idDemCheque);
	}

	public List<DemCheque> findAllDemCheque() {
		return demandeClientDao.findAllDemCheque();
	}

	
}
