package org.sid.web;

import java.util.List;

import org.sid.entities.Produit;
import org.sid.service.ICatalogueService;
import org.sid.service.Singletonservice;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class ProduitAction extends ActionSupport {
	public Produit produit = new Produit();
	public List<Produit> produits;
	public String ref;
	public boolean editmode = false;
	@Autowired 
	private ICatalogueService service ;//pour demander a sriing de chercher kl'objet  et de l'injecter dans le varaible service 

	public String index() {
		produits = service.ListProduit();
		return "succee";
	}

	public String save() {
		if (editmode == false) {
			service.AjouterProduit(produit);
		} else {
			service.updateProduit(produit);
			editmode=false;
			produit=new Produit();
		}
		produits = service.ListProduit();
		return "succee";

	}

	public String delete() {
		service.supprimerProduit(ref);
		produits = service.ListProduit();
		return "succee";
	}

	public String edit() {
		editmode = true;
		produit = service.getProduit(ref);
		service.updateProduit(produit);
		produits = service.ListProduit();
		return "succee";
	}

}
