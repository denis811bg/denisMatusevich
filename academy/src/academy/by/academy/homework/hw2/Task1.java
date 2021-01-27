package academy.by.academy.homework.hw2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insert first string: ");
		String strOne = scanner.nextLine();
		System.out.print("Insert second string: ");
		String strTwo = scanner.nextLine();
		scanner.close();

		System.out.println("Result: " + stringToString(strOne, strTwo));
	}

	public static boolean stringToString(String strOne, String strTwo) {
		boolean result = true;

		int[] letters = new int[256];
		if (strOne.length() == strTwo.length()) {

			// quantity char's
			for (int i = 0; i < strOne.length(); i++) {
				char c = strOne.charAt(i);
				letters[c]++;
			}

			for (int i = 0; i < strTwo.length(); i++) {
				int c = (int) strTwo.charAt(i);
				if (letters[c]-- <= 0) {
					result = false;
				}
			}
		} else {
			result = false;
		}
		return result;
	}
}
