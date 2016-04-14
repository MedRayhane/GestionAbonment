package org.sid.dao;

import java.util.List;

import org.sid.entities.Produit;

public interface IcatalogueDAO {
public void AjouterProduit(Produit produit);
public List<Produit> ListProduit();
public Produit getProduit(String ref);
public void supprimerProduit(String ref);
public void updateProduit(Produit produit);
}
