package academy.by.academy.classwork.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[15];
		int count = 0;

		// initialising array
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count++;
			}
		}

		System.out.println(Arrays.toString(array));
		System.out.println(count);
	}
}
