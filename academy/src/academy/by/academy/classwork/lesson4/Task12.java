package academy.by.academy.classwork.lesson4;

public class Task12 {
	public static void main(String[] args) {
		long result = 1;

		for (int i = 11; i < 100; i += 2) {
			if (i % 13 == 0) {
				result = result * i;
			}
		}

		System.out.println("Result: " + result);
	}
}
