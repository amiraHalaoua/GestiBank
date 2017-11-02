package com.gb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OP", discriminatorType=DiscriminatorType.STRING)
public abstract class Operation implements Serializable {

	/* Attributes */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_operation;
	private Date date_op;
	private Double montant;
	private String libelle_op;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_compte")
    private Compte compte;
	
	/* Constructors */
	public Operation() {
		super();
	}
	public Operation(Double montant, String libelle) {
		super();
		this.montant = montant;
		this.date_op = new Date();
		this.libelle_op = libelle;
	}
	
	/* Getters an Setters */
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public Integer getId_operation() {
		return id_operation;
	}
	public Date getDate_op() {
		return date_op;
	}
	public String getLibelle() {
		return libelle_op;
	}
	public void setLibelle(String libelle) {
		this.libelle_op = libelle;
	}
    
	
    
    
    
    
}
