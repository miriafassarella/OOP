package exercicesPOO.arrays;


public class MultidimensionalArray {
	
	public static void main(String[] args) {
		
		String[][] newArray = new String[3][3];
		
		newArray[0][0] = "Miria";
		newArray[0][1] = "Adriano";
		newArray[0][2] = "Bart";
		
		newArray[1][0] = "Suzana";
		newArray[1][1] = "Marcio";
		newArray[1][2] = "Murilo";
		
		newArray[2][0] = "Fred";
		newArray[2][1] = "Aghata";
		newArray[2][2] = "Theo";
		
		
		
		System.out.println(newArray[0][0]);
		System.out.println(newArray[0][1]);
		System.out.println(newArray[0][2]);
		
		System.out.println(newArray[1][0]);
		System.out.println(newArray[1][1]);
		System.out.println(newArray[1][2]);
		
		System.out.println(newArray[2][0]);
		System.out.println(newArray[2][1]);
		System.out.println(newArray[2][2]);
	}

}
