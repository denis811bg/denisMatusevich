package academy.by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scanner.nextInt();
		System.out.print("Enter b: ");
		int b = scanner.nextInt();
		int result = a;

		scanner.close();

		for (int i = 1; i < b; i++) {
			result = result * a;
		}

		System.out.println("Result " + a + " ^ " + b + " = " + result);
	}
}
