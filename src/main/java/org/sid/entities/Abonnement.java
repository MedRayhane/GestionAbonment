package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_AB", length = 3)
// cest une colun de troix cratere
public class Abonnement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idAbonnement;
	private Date dateAbonnement;
	private double solde;
	private boolean actif;

	public long getIdAbonnement() {
		return idAbonnement;
	}

	public void setIdAbonnement(long idAbonnement) {
		this.idAbonnement = idAbonnement;
	}

	public Date getDateAbonnement() {
		return dateAbonnement;
	}

	public void setDateAbonnement(Date dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public Abonnement(Date dateAbonnement, double solde, boolean actif) {
		super();
		this.dateAbonnement = dateAbonnement;
		this.solde = solde;
		this.actif = actif;
	}

	public Abonnement() {
		super();
		// TODO Auto-generated constructor stub
	}

}
