package exercicesPOO.arrays.restomanagement;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		Menu menu = new Menu();

        MenuItem item1 = new MenuItem();
        item1.description = "Rib Eye 500g";
        item1.price = 95;

        MenuItem item2 = new MenuItem();
        item2.description = "Picanha 400g";
        item2.price = 102.5;

        MenuItem item3 = new MenuItem();
        item3.description = "Batata frita 300g";
        item3.price = 12;

        menu.adicionarItem(item1);
        menu.adicionarItem(item2);
        menu.adicionarItem(item3);
        
        

		menu.imprimirItensCardapio(80, 150);
		  
		//menu.removerItem(2); System.out.println("---");
		
		menu.imprimirItensCardapio(0, 150);
		
		}
		
}
        
		  
		
		 
    
	


