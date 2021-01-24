package academy.by.academy.classwork.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[8];

		// initialising array
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1;
		}

		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 1) {
				array[i] = 0;
			}
		}

		System.out.println(Arrays.toString(array));

	}
}
