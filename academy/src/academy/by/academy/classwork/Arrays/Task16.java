package academy.by.academy.classwork.Arrays;

import java.util.Random;

public class Task16 {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] array = new int[7][4];

		// initialising array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(11) - 5;
			}
		}

		// print array
		for (int[] i : array) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// abs multiply
		int multiply = 1;
		int maxMultiply = 0;
		int maxIndex = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				multiply = multiply * array[i][j];
			}

			multiply = Math.abs(multiply);
			System.out.println(multiply);
			if (maxMultiply < multiply) {
				maxMultiply = multiply;
				maxIndex = i;
			}
			multiply = 1;
		}

		System.out.println("Max index = " + (maxIndex + 1));
	}
}
