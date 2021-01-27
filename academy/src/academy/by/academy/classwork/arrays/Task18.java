package academy.by.academy.classwork.arrays;

import java.util.Random;

public class Task18 {
	final static int TWO = 2;
	final static int LENGTH_ARRAY = 36;	

	public static void main(String[] args) {
		Random random = new Random();
		String[] multiply = new String[LENGTH_ARRAY];

		// initialising multiply
		int countArray = 0;
		System.out.println("Table multiply: ");
		for (int i = 2; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				multiply[countArray++] = i + " x " + j + " = ?";
			}
		}

		// result
		String[] result = new String[15]; // 15 number of children in class
		String tmpStr = null;
		int count = 0;
		for (int i = 0; i < result.length; i++) {
			boolean flag = true;
			tmpStr = multiply[random.nextInt(multiply.length)];
			// System.out.println(tmpStr);
			for (int j = 0; j < count; j++) {
				if (tmpStr.equals(result[j])) {
					i--;
					flag = false;
					break;
				}
			}
			if (flag) {
				result[count++] = tmpStr;
				System.out.println((i + 1) + ": " + result[i]);
			}
		}
	}
}
