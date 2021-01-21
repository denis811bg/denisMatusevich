package academy.by.academy.homework.hw1;

public class TaskFoutth {
	final static int LIMIT = 1_000_000;

	public static void main(String[] args) {
		int result = 2;
		int count = 1;

		System.out.println("Степень 2-ки:");
		while (result < LIMIT) {
			System.out.println("2^ " + count++ + " = " + result);
			result = result * 2;
		}
	}

}
