package com.gk.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte implements Serializable {
	
	/* Attributes */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private Integer id_compte;
	private String RIB;
	private Date date_creation;
	private Double solde;
    private Double decouvert;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="FK_client")
	private Client client;
    @OneToMany( cascade= { CascadeType.ALL }, fetch = FetchType.LAZY, orphanRemoval= true , mappedBy ="compte")
	private List<Operation> operations;
	
	/* Constructors */

	public Compte() {
}

	public Compte(String rIB, Client client, Double decouvert) {
		this.RIB = rIB;
		this.date_creation = new Date();
		this.client = client;
		this.decouvert = decouvert;
		this.solde= (double) 0;
	}
	
	/* Getters and Setters */

	public String getRIB() {
		return RIB;
	}

	public void setRIB(String rIB) {
		RIB = rIB;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public Double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	public Integer getId_compte() {
		return id_compte;
	}
	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [id_compte=" + id_compte + ", RIB=" + RIB + ", date_creation=" + date_creation + ", solde="
				+ solde + ", decouvert=" + decouvert + ", client=" + client + ", operations=" + operations + "]";
	}

	

}
