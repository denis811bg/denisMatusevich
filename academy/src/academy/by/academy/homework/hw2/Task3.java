package academy.by.academy.homework.hw2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstWord, secondWord;

		System.out.print("Insert two word: ");
		while (true) {
			firstWord = scanner.nextLine();
			secondWord = scanner.nextLine();

			if (firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {
				scanner.close();
				break;
			} else {
				System.out.print("Oooops...Insert two word (length word is even number): ");
			}
		}

		System.out.println("Result: " + (firstWord.substring(0, firstWord.length() / 2))
				+ (secondWord.substring(0, secondWord.length() / 2)));

	}
}
