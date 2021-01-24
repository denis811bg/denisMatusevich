package academy.by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long result = 1;
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= n; i++) {
			result = result * i;
		}

		System.out.println("Result: " + result);
	}
}
