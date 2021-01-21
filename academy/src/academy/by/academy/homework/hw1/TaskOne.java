package academy.by.academy.homework.hw1;

import java.util.Scanner;

public class TaskOne {
	public static void main(String[] args) {
		double price;
		int age;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Введите сумму покупки: ");
			price = scanner.nextDouble();
			System.out.print("Введите Ваш возраст: ");
			age = scanner.nextInt();

			if (price < 0 || age < 0) {
				System.out.println("Вы ввели некорректные данные. "
						+ "Поле сумма покупки или возраст должны быть положительными.");
			} else {
				scanner.close();
				break;
			}
		}

		System.out.println("Итоговая цена с учетом скидки = " + discount(price, age));
	}

	// метод расчета скидки
	public static double discount(double price, int age) {
		double priceResult = 0.00;

		if (price < 100) {
			priceResult = price - price * 0.05;
		} else if (price >= 100 && price < 200) {
			priceResult = price - price * 0.07;
		} else if (price >= 200 && price < 300) {
			if (age > 18) {
				priceResult = price - price * 0.12 - price * 0.04;
			} else {
				priceResult = price - price * 0.12 + price * 0.03;
			}
		} else if (price >= 300 && price < 400) {
			priceResult = price - price * 0.15;
		} else if (price >= 400) {
			priceResult = price - price * 0.20;
		}

		return priceResult;
	}
}
