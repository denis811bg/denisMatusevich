package academy.by.academy.classwork.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] array;
		int[] arrayTwo;
		int n;

		System.out.println("Enter n. n > 3. Thanks.");
		while (true) {
			n = scanner.nextInt();

			if (n > 3) {
				scanner.close();
				break;
			} else {
				System.out.println("Ooooops....Enter correct n. n > 3. Thanks.");
			}
		}

		// initialising array
		array = new int[n];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(n + 1);
			if (array[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println(Arrays.toString(array));

		// second array initialising
		arrayTwo = new int[count];
		int countArrayTwo = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				arrayTwo[countArrayTwo++] = array[i];
			}
		}

		System.out.println(Arrays.toString(arrayTwo));
	}
}
