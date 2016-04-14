package org.sid.service;

import java.util.List;

import org.sid.dao.IcatalogueDAO;
import org.sid.entities.Produit;
import org.springframework.transaction.annotation.Transactional;
@Transactional //toutes les methodes sont transactionl et apres spring qui va gerer les transaction au niveau de chaque methode

public class CatalogueServiceImpl implements ICatalogueService {
IcatalogueDAO dao;


	public void setDao(IcatalogueDAO dao) {
	this.dao = dao;
}

	public void AjouterProduit(Produit produit) {
	dao.AjouterProduit(produit);
		
	}

	public List<Produit> ListProduit() {
		// TODO Auto-generated method stub
		return dao.ListProduit();
	}

	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return dao.getProduit(ref);
	}

	public void supprimerProduit(String ref) {
dao.supprimerProduit(ref);
		
	}

	public void updateProduit(Produit produit) {
	dao.updateProduit(produit);
		
	}

}
