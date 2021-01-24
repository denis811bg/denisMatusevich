package academy.by.academy.classwork.arrays;

import java.util.Random;

public class Task15 {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] array = new int[5][8];

		// initialising array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(199) - 99;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// print array and max value array
		int maxValue = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > maxValue) {
					maxValue = array[i][j];
				}
			}
		}

		System.out.println("Max value = " + maxValue);
		

	}

}
