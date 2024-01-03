package exercicesPOO.arrays;

import java.util.Arrays;

public class ExpandArray {

	public static void main(String[] args) {
		int[] numbers1 = {25,11,8,46,37,14};
		String array1  = Arrays.toString(numbers1);
		
		int[] numbers2 = Arrays.copyOf(numbers1, numbers1.length + 2);
		
		numbers2[numbers2.length - 1] = 44;
		numbers2[numbers2.length - 2] = 35;
		
		String array2  = Arrays.toString(numbers2);
		
		
		
		System.out.println(array1);
		System.out.println(array2);
	}
}
