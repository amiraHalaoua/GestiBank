package com.gb.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gb.dao.IDemandeClientDao;
import com.gb.model.Adresse;
import com.gb.model.Client;
import com.gb.model.Conseiller;
import com.gb.model.DemCheque;
import com.gb.model.DemandeAdhesion;
import com.gb.model.DetailDemande;
import com.gb.model.Statuts;
import com.gb.model.User;
import com.gb.service.IAdresseService;
import com.gb.service.IDemandeAdhService;
import com.gb.service.IDemandeClientService;
import com.gb.service.IUserService;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/Spring.xml");
		IUserService userService = ctx.getBean(IUserService.class);
//		IAdresseService adrService = ctx.getBean(IAdresseService.class);
		
//		Adresse a = new Adresse("rueil", "albert", "92240", null);
//		User u =new User("user", "user", null, null, a, "test");
//		userService.addUser(u);
		
//		Adresse a = userService.findUserById(3).getAdresse();
//		a.setComplement("bât 3");
//		adrService.updateAdresse(a);
		
		
//		Conseiller c = new Conseiller("test", "test", "test@gmail.com", null, "test");
//		userService.addConseiller(c);
		
//		userService.removeConseiller(14);
		
//		System.out.println(userService.findConseillerById(9).toString());
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
		
		/*************************************************************************************************/
		
		Client c = userService.findClientById(11);
		IDemandeClientService demandeClientServ = ctx.getBean(IDemandeClientService.class);
		demandeClientServ.addDemCheque(new DemCheque("cheque", c));
		
		ctx.close();
	}


}
