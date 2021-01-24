package academy.by.academy.classwork.lesson4;

public class Task6 {
	public static void main(String[] args) {
		double S = 1000;
		int N = 5;

		for (int i = 0; i < N; i++) {
			S = S + S * 0.03;
		}

		System.out.printf("Total cash: %.2f", S);
	}
}
