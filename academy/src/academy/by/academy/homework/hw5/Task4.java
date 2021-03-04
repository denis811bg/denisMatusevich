package academy.by.academy.homework.hw5;

/*
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task4 {

    public static final int COUNT_SCHOOLBOY = 10;
    public static final int RATING_RANDOM = 101;
    public static Random random = new Random();

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int rating;

        System.out.print("Журнал оценок: ");
        Iterator<Integer> iterator = initGradeBook().iterator();
        while (iterator.hasNext()) {
            rating = iterator.next();
            System.out.print(rating + " ");
            if (rating > max) {
                max = rating;
            }
        }
        System.out.println("\nМаксимальная оценка: " + max);
    }

    public static ArrayList<Integer> initGradeBook() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < COUNT_SCHOOLBOY; i++) {
            arrayList.add(random.nextInt(RATING_RANDOM));
        }
        return arrayList;
    }
}
