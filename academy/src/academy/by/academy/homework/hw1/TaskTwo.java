package academy.by.academy.homework.hw1;

import java.util.Scanner;

public class TaskTwo {
	public static void main(String[] args) {
		String dataType;
		String variable;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите тип данных. int, double, float, char или String - ");
		dataType = scanner.nextLine();
		System.out.print("Введите значение переменной - ");
		variable = scanner.nextLine();
		scanner.close();

		// проверка, если String ввели с прописной буквы
		if (dataType.equals("string")) {
			dataType = dataType.substring(0, 1).toUpperCase() + dataType.substring(1);
		}

		switch (dataType) {
		case "int":
			System.out.println("Тип int. Остаток от деления на 2 = " + Integer.parseInt(variable) % 2);
			break;
		case "double":
			System.out.println("Тип double. 70% от числа = " + Double.parseDouble(variable) * 0.70);
			break;
		case "float":
			System.out.println("Тип float. Квадрат числа = " + square(Float.parseFloat(variable)));
			break;
		case "char":
			System.out.println("Тип char. ASCII-код смивола = " + (int) variable.charAt(0));
			break;
		case "String":
			System.out.println("Тип String. Итоговая строка = Hello " + variable);
			break;
		default:
			System.out.println("Unsupported type");
			break;
		}
	}

	// метод возведения в степень 2
	public static float square(float number) {
		return number * number;
	}

}
