package com.melaisso.service;

import java.util.List;

import com.melaisso.entities.Produit;

public interface ICatalogService {
	
	 void addPrdoduit(Produit p);
	 List<Produit> listProduits();
	 Produit getProduit(String ref);
	 void updateProduit(Produit p);
	 void deleteProduit(String ref);

}
