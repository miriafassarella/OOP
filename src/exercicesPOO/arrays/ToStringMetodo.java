package exercicesPOO.arrays;

import java.util.Arrays;

public class ToStringMetodo {

	public static void main(String[] args) {
		
		int[] grades = {4,7,5,3,2};
		
		/*Class Arrays of the java.util*/
		
		/*Return an array in the form of a string*/
		String gradesInString = Arrays.toString(grades);
		
		System.out.println(gradesInString);
	}
	
}
