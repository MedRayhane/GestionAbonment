package org.sid.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.sid.entities.Produit;

public class catalogueDAOimpl implements IcatalogueDAO {
	private Map<String, Produit> produits = new HashMap<String, Produit>();

	// Logger loge=Logger.getLogger(this.getClass());
	public void AjouterProduit(Produit produit) {
		produits.put(produit.getRef(), produit);

	}

	public List<Produit> ListProduit() {
		// TODO Auto-generated method stub
		return new ArrayList<Produit>(produits.values());
	}

	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return produits.get(ref);
	}

	public void supprimerProduit(String ref) {
		produits.remove(ref);

	}

	public void updateProduit(Produit produit) {
		produits.put(produit.getRef(), produit);

	}
	public void init()
	{
		AjouterProduit(new Produit("grioui", "bn.com", 123, 3, true));
		AjouterProduit(new Produit("med", "am.com", 741, 6, true));
		AjouterProduit(new Produit("rayhane", "qw.com", 963, 8, true));
		System.out.println("inti des catalogue");
		
	}

}
