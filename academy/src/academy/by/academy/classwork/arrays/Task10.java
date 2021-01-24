package academy.by.academy.classwork.arrays;

import java.util.Random;

public class Task10 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[11];

		// initialising array
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(3) - 1;
			System.out.print(array[i] + " ");
		}
		System.out.println();

		//
		int countZero = 0;
		int countOne = 0;
		int countNegativeOne = 0;
		int[] valueArray = { -1, 0, 1 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] == valueArray[0]) {
				countNegativeOne++;
			} else if (array[i] == valueArray[1]) {
				countZero++;
			} else if (array[i] == valueArray[2]) {
				countOne++;
			}
		}

		if (countZero > countOne && countZero > countNegativeOne) {
			System.out.println("Element " + valueArray[1] + " :" + countZero + " times.");
		} else if (countNegativeOne > countOne && countNegativeOne > countZero) {
			System.out.println("Element " + valueArray[0] + " :" + countNegativeOne + " times.");
		} else if (countOne > countNegativeOne && countOne > countZero) {
			System.out.println("Element " + valueArray[2] + " :" + countOne + " times.");
		}
	}
}
