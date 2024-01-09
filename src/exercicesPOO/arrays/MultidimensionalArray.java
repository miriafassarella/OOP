package exercicesPOO.arrays;

import java.util.Arrays;

public class MultidimensionalArray {
	
	public static void main(String[] args) {
		
		String[][] newArray = new String[3][];
		
		newArray[0] = new String[3];
		newArray[0][0] = "Miria";
		newArray[0][1] = "Adriano";
		newArray[0][2] = "Bart";
		
		newArray[1] = new String[3];
		newArray[1][0] = "Suzana";
		newArray[1][1] = "Marcio";
		newArray[1][2] = "Murilo";
		
		newArray[2] = new String[3];
		newArray[2][0] = "Fred";
		newArray[2][1] = "Aghata";
		newArray[2][2] = "Theo";
		
		
		
		
		 
		for(String[] names : newArray) {
			for(String name : names) {
				System.out.println(name); 
			}
		}
		
		
		
		 
		 
	}

}
