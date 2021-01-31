package academy.by.academy.homework.hw2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// initialising n
		int n = 0;
		System.out.print("Insert n (n > 0) = ");
		while (true) {
			n = scanner.nextInt();
			scanner.nextLine(); // read \n after nextInt();
			if (n > 0) {
				break;
			} else {
				System.out.print("Insert n (n > 0) = ");
			}
		}

		// initialising array strings and search min word
		System.out.println("Insert n word:");
		String[] strArray = new String[n];
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			int[] letters = new int[256];
			strArray[i] = scanner.nextLine();

			for (int j = 0; j < strArray[i].length(); j++) {
				letters[strArray[i].charAt(j)]++;
			}

			int count = 0;
			for (int j = 0; j < letters.length; j++) {
				if (letters[j] >= 1) {
					count++;
				}
			}
			result[i] = count;
		}

		int minIndex = Integer.MAX_VALUE;
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < result.length; i++) {
			if (result[i] < minValue) {
				minIndex = i;
				minValue = result[i];
			}
		}
		System.out.println("Result: " + strArray[minIndex]);
		scanner.close();
	}
}
