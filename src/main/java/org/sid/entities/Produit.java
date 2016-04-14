package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Produit implements Serializable {
	@Id
	private String ref;
	private String designation;
	private double prix;
	private  int quantite ;
	private boolean promo;
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public boolean isPromo() {
		return promo;
	}
	public void setPromo(boolean promo) {
		this.promo = promo;
	}

	public Produit(String ref, String designation, double prix, int quantite,
			boolean promo) {
		super();
		this.ref = ref;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
		this.promo = promo;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	} 
	

}
