package academy.by.academy.classwork.lesson4;

public class Task27 {
	public static void main(String[] args) {
		double m = 100;
		double k = 13.20;
		int count = 0;
		double temp = m;

		while (temp > 0) {
			temp = temp - k;
			count++;
		}

		System.out.println("Result: " + (temp + k));
		System.out.println(count - 1);
	}
}
