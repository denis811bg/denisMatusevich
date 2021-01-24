package academy.by.academy.classwork.lesson4;

import java.util.Random;

public class Task21 {
	public static void main(String[] args) {
		int[] array = new int[10];
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextInt(100);
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i : array) {
			System.out.println(i);
		}
	}
}
