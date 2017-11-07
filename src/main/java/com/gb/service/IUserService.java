package com.gb.service;


import com.gb.model.Conseiller;

public interface IUserService {
	/************************************ GESTION CONSEILLER ***************************************/
	public void addConseiller(Conseiller c);
	public void removeConseiller(Integer idConseiller);
}
