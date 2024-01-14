package exercicesPOO.datastructure;

public class Stock {
	
	Produit[] produits;
	
	void listProduits() {
		System.out.println("\nProduits en stock");
		System.out.println("----------------------");
		
		for(int i = 0; i < produits.length; i++) {
			
			produits[i].decrire();
		}
		
	}

}
