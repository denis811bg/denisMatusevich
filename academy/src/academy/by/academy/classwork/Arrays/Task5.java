package academy.by.academy.classwork.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arrayOne = new int[5];
		int[] arrayTwo = new int[5];

		// initialising arrays
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = random.nextInt(6);
			arrayTwo[i] = random.nextInt(6);
		}

		// print arrays
		System.out.println(Arrays.toString(arrayOne) + "\n" + Arrays.toString(arrayTwo));

		// average
		double resultAverageArrayOne = 0;
		double resultAverageArrayTwo = 0;
		for (int i = 0; i < arrayOne.length; i++) {
			resultAverageArrayOne = resultAverageArrayOne + arrayOne[i];
			resultAverageArrayTwo = resultAverageArrayTwo + arrayTwo[i];
		}

		if (resultAverageArrayOne / 2.00 < resultAverageArrayTwo / 2.00) {
			System.out.println("Average first array " + resultAverageArrayOne / 2.0 + " < Average second array "
					+ resultAverageArrayTwo / 2.0);
		} else if (resultAverageArrayOne / 2.00 > resultAverageArrayTwo / 2.00) {
			System.out.println("Average first array " + resultAverageArrayOne / 2.0 + " > Average second array "
					+ resultAverageArrayTwo / 2.0);
		} else if (resultAverageArrayOne / 2.00 == resultAverageArrayTwo / 2.00) {
			System.out.println("Average first array " + resultAverageArrayOne / 2.0 + " = Average second array "
					+ resultAverageArrayTwo / 2.0);
		}
	}
}
