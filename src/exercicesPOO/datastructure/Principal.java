package exercicesPOO.datastructure;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Combien de produits?");
		int quantiteProduits = entree.nextInt();
		
		entree.nextLine();
		
		Stock stock = new Stock();
		
		stock.produits = new Produit[quantiteProduits]; //initialisation de l'array.
		
		for(int i = 0; i < stock.produits.length; i++) {
			stock.produits[i] = new Produit();
			
			System.out.println("\nProduit " + i);
			System.out.println("----------------------");
			
			System.out.println("Decription:");
			stock.produits[i].description = entree.nextLine();
			
			System.out.println("Quantite d'elements:");
			stock.produits[i].quantite = entree.nextInt();
			entree.nextLine();
		}
		stock.listProduits();
		System.out.println("Le stock contien " + stock.produits.length + ".");

	}

}
