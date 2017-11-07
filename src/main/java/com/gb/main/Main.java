package com.gb.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gb.model.Conseiller;
import com.gb.service.IUserService;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/Spring.xml");
		// creat user
		IUserService userService = ctx.getBean(IUserService.class);
//		Conseiller c = new Conseiller("amira", "halaoua", "test@gmail.com", null , "test", "C15E49");
//		userService.addConseiller(c);
		userService.removeConseiller(3);
		ctx.close();
	}


}
