package academy.by.academy.classwork.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Task14 {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] array = new int[8][5];

		// initialising array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(90) + 10;
			}
		}

		// print array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// print array two
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}

		// print third
		System.out.println(Arrays.toString(array));
	}
}
