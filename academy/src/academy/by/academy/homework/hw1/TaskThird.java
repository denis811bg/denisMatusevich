package academy.by.academy.homework.hw1;

import java.util.Scanner;

public class TaskThird {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите число от 1 до 10 - ");
		while (true) {
			number = scanner.nextInt();

			if (number > 0 && number <= 10) {
				scanner.close();
				break;
			} else {
				System.out.print("Вы ввели некорректное число. Введите число от 1 до 10 - ");
			}
		}

		System.out.println("Таблица умножения для числа " + number);
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
	}
}
