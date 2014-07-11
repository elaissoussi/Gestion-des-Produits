package com.melaisso.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.melaisso.DAO.ICatalogDAO;
import com.melaisso.entities.Produit;

@Transactional
public class CatalogServiceImpl implements ICatalogService{

	private ICatalogDAO dao ; 
	
	public void setDao(ICatalogDAO dao) {
		this.dao = dao;
	}

	public void addPrdoduit(Produit p) {
        dao.addPrdoduit(p);		
	}

	public List<Produit> listProduits() {
		return dao.listProduits();
	}

	public Produit getProduit(String ref) {
		return dao.getProduit(ref);
	}

	public void updateProduit(Produit p) {
       dao.updateProduit(p);    
		
	}

	public void deleteProduit(String ref) {
		dao.deleteProduit(ref);
	}

}
