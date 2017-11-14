package com.gk.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.service.IAdresseService;
import com.gk.service.IDemandeAdhService;
import com.gk.service.IUserService;
import com.gk.model.Adresse;
import com.gk.model.Conseiller;
import com.gk.model.DemandeAdhesion;
import com.gk.model.DetailDemande;
import com.gk.model.Statuts;
import com.gk.model.User;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/springContext.xml");
		IUserService userService = ctx.getBean(IUserService.class);
		IAdresseService adrService = ctx.getBean(IAdresseService.class);
		
		Adresse a = new Adresse("rueil", "albert", "92240", null);
		User u =new User("test", "user", null, null, a, "test");
		userService.addUser(u);
		
//		Adresse a = userService.findUserById(3).getAdresse();
//		a.setComplement("bât 3");
//		adrService.updateAdresse(a);
		
		
//		Conseiller c = new Conseiller("test", "test", "test@gmail.com", null, "test");
//		userService.addConseiller(c);
		
//		userService.removeConseiller(14);
		
//		Conseiller c =userService.findConseillerById(2);
//		c.setNom("testModif");
//		c.setPseudo("testos");
//		userService.updateConseiller(c);
		
//		List<Conseiller> conseillers = userService.findAllConseiller();
//		for(Conseiller c: conseillers){
//			System.out.println(c.toString());
//		}
		
//		System.out.println(userService.findConseillerByMatricule("tes141226").toString());
		
		/*************************************************************************************************/
		
//		IDemandeAdhService demandeService = ctx.getBean(IDemandeAdhService.class);
		
//		Adresse a = new Adresse("paris", "albert", "75005", null);
//		User u =new User("user", "userName", null, null, a, "testos");
//		userService.addUser(u);
//		DemandeAdhesion d = new DemandeAdhesion(u);
//		demandeService.addDemandeAdh(d);
		
//		List<DemandeAdhesion> demandes = demandeService.findAllDemandeAdh();
//		List<DemandeAdhesion> demandes = demandeService.findDemandeAdhByStatus(Statuts.EN_ATTENTE);
//		for(DemandeAdhesion d: demandes) {
//			System.out.println(d.toString());
//		}
		
//		DemandeAdhesion d = demandeService.findDemandeById(1);
//		d.setStatut(Statuts.EN_COURS);
//		demandeService.updateDemande(d);
		
//		DetailDemande det = new DetailDemande("cv", d);
//		demandeService.addDetail(det,"C:\\xx\\CV.pdf");
		
//		List<DetailDemande> details = demandeService.findDetailByDemandeAdh(d);
//		for(DetailDemande det: details) {
//			System.out.println(det.toString());
//		}
	    
//		demandeService.affecteDemandeToConseiller(1, c);
		ctx.close();
	}


}
