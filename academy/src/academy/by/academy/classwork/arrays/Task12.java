package academy.by.academy.classwork.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task12 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[12];

		// initialising array
		int countPlus = 0;
		int countMinus = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(21) - 10;

			// reload zero
			while (array[i] == 0) {
				array[i] = random.nextInt(21) - 10;
			}

			// count - and +
			if (array[i] < 0) {
				countMinus++;
			} else {
				countPlus++;
			}
		}
		//System.out.println(countMinus + " " + countPlus);
		//System.out.println(Arrays.toString(array));

		// half past + and -
		int count = (countMinus - countPlus) / 2;
		if (count > 0) {
			while (count != 0) {
				int temp = random.nextInt(array.length);
				if (array[temp] < 0) {
					array[temp] = Math.abs(array[temp]);
					count--;
				}
			}
		} else if (count < 0) {
			count = Math.abs(count);

			while (count != 0) {
				int temp = random.nextInt(array.length);
				if (array[temp] > 0) {
					array[temp] = array[temp] - 2 * array[temp];
					count--;
				}
			}
		}

		System.out.println(Arrays.toString(array));
	}
}
