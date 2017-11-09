package com.gb.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gb.model.Conseiller;
import com.gb.service.IUserService;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/Spring.xml");
		IUserService userService = ctx.getBean(IUserService.class);
		
		
//		Conseiller c = new Conseiller("test", "test", "test@gmail.com", null, "test");
//		userService.addConseiller(c);
		
//		userService.removeConseiller(14);
		
//		Conseiller c =userService.findConseillerById(13);
//		c.setNom("testModif");
//		c.setPseudo("testos");
//		userService.updateConseiller(c);
		
//		List<Conseiller> conseillers = userService.findAllConseiller();
//		for(Conseiller c: conseillers){
//			System.out.println(c.toString());
//		}
		
//		System.out.println(userService.findConseillerByMatricule("tes141226").toString());
		
		ctx.close();
	}


}
