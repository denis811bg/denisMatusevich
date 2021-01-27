package academy.by.academy.homework.hw2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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

		System.out.println("Insert n word");
		String[] strArray = new String[n];
		int minLength = Integer.MAX_VALUE;
		String minWord = null;
		for (int i = 0; i < n; i++) {
			strArray[i] = scanner.nextLine();
			if (strArray[i].length() < minLength) {
				minLength = strArray[i].length();
				minWord = strArray[i];
			}
		}

		scanner.close();
		System.out.println("Result: " + minWord);
	}
}
