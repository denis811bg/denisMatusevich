package academy.by.academy.classwork.lesson4;

public class Task19 {
	public static void main(String[] args) {
		int count;
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				count = i * 100 + j;
				if (count % (i * j) == 0) {
					System.out.println("Число i - " +i + " Число j - " + j);
				}
			}
		}
	}
}
