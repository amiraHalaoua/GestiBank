package com.gb.service;

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

	public void addConseiller(Conseiller c) {
		userDaoImpl.addConseiller(c);
		
	}
	
	
}
