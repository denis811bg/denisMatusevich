package academy.by.academy.homework.hw5;

/*
 * Попробовать добавить в массив int на 8 элементов 10 чисел.
 * Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
 * "Array is to small, expand the array".
 */

import java.util.Random;

public class Task6 {

    public static final int RANDOM = 100;
    public static final Random random = new Random();

    public static void main(String[] args) {

        int[] array = new int[8];

        try {
            for (int i = 0; i < 10; i++) {
                array[i] = random.nextInt(RANDOM);
            }
        } catch (ArrayIndexOutOfBoundsException message) {
            System.out.println("Array is to small, expand the array");
        }
    }
}
