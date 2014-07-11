package com.melaisso.DAO;

import com.melaisso.entities.Produit;
import java.util.List;


public interface ICatalogDAO {
	
 void addPrdoduit(Produit p);
 List<Produit> listProduits();
 Produit getProduit(String ref);
 void updateProduit(Produit p);
 void deleteProduit(String ref);
}
