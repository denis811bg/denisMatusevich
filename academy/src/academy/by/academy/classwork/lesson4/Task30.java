package academy.by.academy.classwork.lesson4;

public class Task30 {
	public static void main(String[] args) {
		int count = 1;
		int result = 0;

		while (count < 100) {
			result = result + count;
			count += 2;
		}

		System.out.println("Result: " + result);
	}
}
