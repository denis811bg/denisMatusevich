package academy.by.academy.classwork.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[12];

		// initialising array
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(31) - 15;
		}

		System.out.println(Arrays.toString(array));

		// max value
		int max = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		System.out.println("Max value = " + max + "\nLast index value = " + index);
	}
}
