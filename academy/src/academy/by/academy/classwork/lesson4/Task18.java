package academy.by.academy.classwork.lesson4;

public class Task18 {
	public static void main(String[] args) {
		int N = 256;
		int count = 0;

		for (int i = 1; i < N; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
				count++;
			}
		}

		System.out.println("Result: " + count);

	}
}
