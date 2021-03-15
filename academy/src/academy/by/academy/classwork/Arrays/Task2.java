package academy.by.academy.classwork.Arrays;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		int[] array = new int[50];
		int count = 1;

		// initialising array
		for (int i = 0; i < array.length; i++) {
			array[i] = count;
			count += 2;
		}

		// print array
		System.out.println(Arrays.toString(array));

		// print sort
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(array));
	}
}
