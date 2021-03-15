package academy.by.academy.classwork.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Task9 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arrayOne = new int[10];
		int[] arrayTwo = new int[10];
		double[] arrayThree = new double[10];

		// initialising arrays
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = random.nextInt(9) + 1;
			arrayTwo[i] = random.nextInt(9) + 1;
			arrayThree[i] = (double) arrayOne[i] / (double) arrayTwo[i];
		}

		System.out.println(
				Arrays.toString(arrayOne) + "\n" + Arrays.toString(arrayTwo) + "\n" + Arrays.toString(arrayThree));

		int count = 0;
		for (int i = 0; i < arrayThree.length; i++) {
			if (arrayThree[i] % 1 == 0) {
				count++;
			}
		}

		System.out.println("Number of integers = " + count);

	}
}
