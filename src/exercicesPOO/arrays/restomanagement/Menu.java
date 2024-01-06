package exercicesPOO.arrays.restomanagement;

import java.util.Arrays;

public class Menu {

	MenuItem[] itens = new MenuItem[0] ;

    void adicionarItem(MenuItem item) {
    	this.itens = Arrays.copyOf(this.itens, this.itens.length + 1);
    	this.itens[this.itens.length -1] = item;
    	
    }

    void removerItem(int indice) {
    	MenuItem[] newItens = new MenuItem[this.itens.length - 1];
    
    	System.arraycopy(this.itens, 0, newItens, 0, indice);
    	System.arraycopy(this.itens, indice + 1, newItens, indice, newItens.length - indice);
    	
    	this.itens = Arrays.copyOf(newItens, newItens.length);
    	
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
    	
    	MenuItem[] print1 = new MenuItem[0];
    	
    	for(int i = 0; i < itens.length; i++) {
    		
    		
    		if(itens[i].price > precoMinimo && itens[i].price < precoMaximo) {
    			
    			print1 = Arrays.copyOf(print1, print1.length + 1);
    			print1[print1.length - 1] = itens[i];
    			
        		System.out.println(print1[i].description);
        		System.out.println(print1[i].price);
        		System.out.println("----------------");
        	}
    	}
    	
        // TODO implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo
    }
}
