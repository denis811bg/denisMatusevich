package academy.by.academy.classwork.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int lengthArray;

		// length array
		System.out.print("Enter number. Even and > 0 - ");
		while (true) {
			lengthArray = scanner.nextInt();

			if (lengthArray > 0 && lengthArray % 2 == 0) {
				scanner.close();
				break;
			} else {
				System.out.println("Oooops...Enter integer. Even and > 0. Thanks");
			}
		}

		// initialising array
		int[] array = new int[lengthArray];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(11) - 5;
		}
		System.out.println(Arrays.toString(array));

		//
		int moduleOne = 0;
		int moduleTwo = 0;
		for (int i = 0; i < array.length / 2; i++) {
			moduleOne = moduleOne + Math.abs(array[i]);
			moduleTwo = moduleTwo + Math.abs(array[array.length / 2 + i]);
		}

		if (moduleOne < moduleTwo) {
			System.out.println("Left half (" + moduleOne + ") < right half (" + moduleTwo + ")");
		} else if (moduleOne > moduleTwo) {
			System.out.println("Left half (" + moduleOne + ") > right half (" + moduleTwo + ")");
		} else if (moduleOne == moduleTwo) {
			System.out.println("Left half (" + moduleOne + ") = right half (" + moduleTwo + ")");
		}
	}
}
