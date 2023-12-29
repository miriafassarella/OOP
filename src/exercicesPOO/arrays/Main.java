package exercicesPOO.arrays;

public class Main {

	public static void main(String[] args) {
		/*Arrays are objects*/
		
		/*Declaring and instantiating an array*/
		/*int[] grades = new int[5];*/
		 int[] grades ={8,5,4,9,10};
		
		/*Initializing with values*/
		/*int[] grades = new int[]{8,5,4,9,10};*/
		
		
		int position = 5;
		
		System.out.println(grades[position - 1]);
		
		double average = calcAverage(grades);
		System.out.println(average);
		
	}
		
	static double calcAverage(int[] numbers) {
		double total = 0;
		
		/*Enhanced loop*/
		for (int number : numbers) {
			total += number;
		}
		
		
		/* for(int i = 0; i < numbers.length; i++) { total += numbers[i]; }*/
		
		
		return total/numbers.length;
	}
}
