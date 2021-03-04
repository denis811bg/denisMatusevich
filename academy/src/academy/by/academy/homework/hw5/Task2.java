package academy.by.academy.homework.hw5;

/*
 * Можно писать все в main. Не нужно создавать новых классов.
 * Напишите метод, который добавляет 1_000_000 элементов в ArrayList и LinkedList.
 * Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100_000 раз.
 * Замерьте время, которое потрачено на это.
 * Сравните результаты и предположите, почему они именно такие.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {

    public static final int RANDOM = 100;
    public static final int INIT_MILLION = 1_000_000;
    public static final int ONE_HUNDRED_THOUSAND = 100_000;
    public static Random random = new Random();
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {

        long startTime;
        long endTime;
        int randomIndex;

        startTime = System.currentTimeMillis();
        initArrayList();
        endTime = System.currentTimeMillis();
        System.out.println("Время затраченное на заполнение ArrayList 1_000_000 элементами: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        initLinkedList();
        endTime = System.currentTimeMillis();
        System.out.println("Время затраченное на заполнение LinkedList 1_000_000 элементами: " + (endTime - startTime) + " ms");

        randomIndex = random.nextInt(INIT_MILLION);
        System.out.println("Случайный индекс: " + randomIndex);
        startTime = System.currentTimeMillis();
        getElementArrayList(randomIndex);
        endTime = System.currentTimeMillis();
        System.out.println("Время затраченное на получение элемента из ArrayList 100_000 раз: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        getElementLinkedList(randomIndex);
        endTime = System.currentTimeMillis();
        System.out.println("Время затраченное на получение элемента из LinkedList 100_000 раз: " + (endTime - startTime) + " ms");

    }

    public static void initArrayList() {
        for (int i = 0; i < INIT_MILLION; i++) {
            arrayList.add(random.nextInt(RANDOM));
        }
    }

    public static void initLinkedList() {
        for (int i = 0; i < INIT_MILLION; i++) {
            linkedList.add(random.nextInt(RANDOM));
        }
    }

    public static void getElementArrayList(int randomIndex) {
        for (int i = 0; i < ONE_HUNDRED_THOUSAND; i++) {
            arrayList.get(randomIndex);
        }
    }

    public static void getElementLinkedList(int randomIndex) {
        for (int i = 0; i < ONE_HUNDRED_THOUSAND; i++) {
            linkedList.get(randomIndex);
        }
    }
}
