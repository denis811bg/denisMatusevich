package academy.by.academy.classwork.Arrays;

import java.util.Arrays;

public class Task7 {
	public static void main(String[] args) {
		int[] array = new int[20];
		// initialising array
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}

		// print array
		System.out.println(Arrays.toString(array));
	}
}
