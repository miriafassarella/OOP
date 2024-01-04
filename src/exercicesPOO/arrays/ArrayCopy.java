package exercicesPOO.arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] currentGame = {25,11,8,46,37,14,55};
		int[] newGame = new int[currentGame.length - 1];
		
		int exclusionIndex = 2;
		
		System.arraycopy(currentGame, 0, newGame, 0, exclusionIndex);
		System.arraycopy(currentGame, exclusionIndex + 1, newGame, exclusionIndex, newGame.length - exclusionIndex);
		
		System.out.println(Arrays.toString(currentGame));
		System.out.println(Arrays.toString(newGame));
	}
}
