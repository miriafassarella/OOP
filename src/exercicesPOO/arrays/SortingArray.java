package exercicesPOO.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArray {
	
	public static void main(String[] args) {
		int [] grades = new int[]{7,3,4,6,5,2};
		/*Direct order*/
		Arrays.sort(grades);
		
		Integer[] numbers = {10,9,11,8,13,12};
		
		/*The interface Comparator works only with class and not with primitives*/
		/*Reverse order*/
		Arrays.sort(numbers, Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(grades));
		
		System.out.println(Arrays.toString(numbers));
	}

}
