package com.gk.mbean;

/**
 * Classe du dernier tp avec didier je l'ai pris telle qu'elle est pour le test
 */
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.gk.model.User;
import com.gk.service.IUserService;

//cette classe java correspond � un composant 
//qui joue le r�le de "managedBean" JSF (#{compteMBean...}
//et qui est techniquement:
//   - d'abord instanci�/initialis� par spring (@Autowired , ...)
//   - ensuite r�utilis� par JSF
@Component() //id/name par defaut de ce composant spring : 
             // compteMBean (nom de classe avec minuscule au debut)
@Scope("session") //equivalent spring de @SessionScoped
public class UserMBean {
	
	private Long numClient;//valeur diff�rente pour chaque utilisateur
	private String password;

	

	@PostConstruct
	public void apresInitSpring(){
		System.out.println("initialise par spring");
	}
	
	//une instance instance d'un service partag�e suffit
	@Autowired
	private IUserService userService ; /*= 
			       ServiceCompte.getInstance();*/
	
		
	public String login(){
		System.out.println("login() appel� sur " + this.toString());
		return null;
//		if(serviceCompte.verifAuth(numClient, password)){
//			this.message = "authentification ok"; 
//		    this.comptes = serviceCompte.comptesDuClient(this.numClient);
//		    if(this.comptes.size()>0)
//			    return "listeComptes";//pour naviguer vers listeComptes.xhtml
//		    else {
//		    	FacesContext.getCurrentInstance()
//		    	    .addMessage( null /* id = null pour message global */,
//		    		     new FacesMessage("aucun compte pour ce client" , "...details..."));
//		    	return null;//pour ne pas changer de page
//		    }
//		}
//		else{ this.message="echec authentification. veuillez r�essayer";
//			return null; 
//		}
	}
	
	
	//+get/set
	
	public Long getNumClient() {
		return numClient;
	}

	public void setNumClient(Long numClient) {
		this.numClient = numClient;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	
    private String message=null;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



}
