package com.melaisso.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.melaisso.entities.Produit;
import com.melaisso.service.ICatalogService;
import com.opensymphony.xwork2.ActionSupport;

public class ProduitAction extends ActionSupport {

	@Autowired
	private ICatalogService service ;
	
	public Produit produit = new Produit();
	public String ref;
	public List<Produit> produits;
	public boolean editMode;

	public String index() {
		produits = service.listProduits();
		return SUCCESS;
	}

	public String save() {
		if (editMode == false)
			service.addPrdoduit(produit);
		else {
			service.updateProduit(produit) ;
		    editMode = false ;
		    produit = new Produit() ;
		}
		produits = service.listProduits();
		return SUCCESS ;
	}

	public String delete() {
		service.deleteProduit(ref) ;
		produits = service.listProduits() ;
		return SUCCESS ;
	}

	public String edit() {
		editMode = true ;
		produits = service.listProduits() ;
		produit = service.getProduit(ref) ;
		return SUCCESS ;
	}
}
