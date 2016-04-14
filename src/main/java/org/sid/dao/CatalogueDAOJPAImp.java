package org.sid.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.entities.Produit;

public class CatalogueDAOJPAImp implements IcatalogueDAO {
	@PersistenceContext
	private EntityManager em;

	public void AjouterProduit(Produit produit) {
		em.persist(produit);

	}

	public List<Produit> ListProduit() {
		Query req = em.createQuery("select c from Produit c");
		return req.getResultList();
	}

	public Produit getProduit(String ref) {
		/*		Query req = em.createQuery("select c from Produit p where p.ref=:x");
		req.setParameter(x, ref);*/
		return em.find(Produit.class, ref);
	}

	public void supprimerProduit(String ref) {
		em.remove(em.find(Produit.class, ref));

	}

	public void updateProduit(Produit produit) {
	em.merge(produit);

	}

}
