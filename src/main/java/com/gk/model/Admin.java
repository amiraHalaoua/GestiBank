package com.gk.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id_admin", referencedColumnName = "id_user")
public class Admin extends User {

	private static final long serialVersionUID = 1L;

	/* Attributes */
	
	private String password;
	@OneToMany
	@JoinColumn(name = "FK_admin")
	private List<Conseiller> conseillers;

	/* Constructors */
	public Admin() {
		super();
	}

	public Admin(String password) {
		this.password = password;
	}

	/* Getters and Setters */

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Conseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(List<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}

	@Override
	public String toString() {
		return super.toString() + "Admin [password=" + password + "conseillers=" + conseillers + "]";
	}

}
