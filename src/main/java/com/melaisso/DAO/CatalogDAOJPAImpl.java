package com.melaisso.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.melaisso.entities.Produit;

public class CatalogDAOJPAImpl  implements ICatalogDAO{
    
	@PersistenceContext 
	private EntityManager em ;
	
	public void addPrdoduit(Produit p) {
        em.persist(p);		
	}

	public List<Produit> listProduits() {
        Query req = em.createQuery("SELECT P FROM Produit p");
		return req.getResultList();
	}

	public Produit getProduit(String ref) {
		Produit p = em.find(Produit.class,ref );
		return p;
	}

	public void updateProduit(Produit p) {
        em.merge(p);		
	}

	public void deleteProduit(String ref) {
         Produit p = getProduit(ref);
         em.remove(p);
	}

}
