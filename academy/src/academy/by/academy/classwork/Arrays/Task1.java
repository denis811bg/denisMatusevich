package academy.by.academy.classwork.Arrays;

public class Task1 {
	public static void main(String[] args) {
		int[] array = new int[10];
		int count = 2;

		// initialising array
		for (int i = 0; i < array.length; i++) {
			array[i] = count;
			count += 2;
		}

		// print array
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// print array
		for (int i : array) {
			System.out.print(i + "\n");
		}

	}
}
