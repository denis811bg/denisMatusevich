package academy.by.academy.classwork.arrays;

import java.util.Random;

public class Task17 {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] array = new int[6][7];

		// initialising array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// first element of string array is MAX
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
					maxIndex = j;
				}
			}
			int temp = array[i][0];
			array[i][0] = max;
			array[i][maxIndex] = temp;
			max = 0;
		}

		// print new array
		System.out.print("\n");
		for (int[] i : array) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
}
