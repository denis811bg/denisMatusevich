package academy.by.academy.classwork.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[4];

		// initialising array
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(90) + 10;
		}

		// print array
		System.out.println(Arrays.toString(array));
		int[] tmp = array.clone(); // clone array

		// sort array
		for (int i = 0; i < array.length; i++) {
			int min = Integer.MAX_VALUE;
			int count = 0;
			for (int j = i; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					count = j;
				}
			}
			// swap
			int temp = array[i];
			array[i] = min;
			array[count] = temp;
		}

		// result
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == tmp[i]) {
				count++;
			} else {
				count--;
			}
		}
		if (count == array.length) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
