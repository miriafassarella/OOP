package exercicesPOO.arrays.restomanagement;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

	ArrayList<MenuItem> itens = new ArrayList<>();

    void adicionarItem(MenuItem item) {
    	itens.add(item);
    	
    }

    void removerItem(MenuItem indice) {
    	
    	itens.remove(indice);
    	
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
    	
    	MenuItem[] print1 = new MenuItem[0];
    	
    	for(int i = 0; i < itens.size(); i++) {
    		
    		
    		if(itens.get(i).price > precoMinimo && itens.get(i).price < precoMaximo) {
    			
    			print1 = Arrays.copyOf(print1, print1.length + 1);
    			print1[print1.length - 1] = itens.get(i);
    			
        		System.out.println(print1[i].description);
        		System.out.println(print1[i].price);
        		System.out.println("----------------");
        	}
    	}
    	
       
}
}