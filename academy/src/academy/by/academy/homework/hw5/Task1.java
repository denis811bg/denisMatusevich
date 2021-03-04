package academy.by.academy.homework.hw5;

/*
  Можно писать все в main. Не нужно создавать новых классов.
  Напишите метод, который на вход получает коллекцию объектов,
  а возвращает коллекцию уже без дубликатов.
 */

import java.util.*;

public class Task1 {

    public static final int RANDOM = 100;
    public static final int COUNT_ARRAY = 100;
    public static final Random random = new Random();
    public static Collection<Integer> collection = new ArrayList<>();

    public static void main(String[] args) {

        HashSet<?> hashSet = duplicate(initCollection());

        for (Object o : hashSet) {
            System.out.print(o + " ");
        }
    }

    public static Collection<?> initCollection() {
        for (int i = 0; i < COUNT_ARRAY; i++) {
            collection.add(random.nextInt(RANDOM));
        }
        return collection;
    }

    public static HashSet<?> duplicate(Collection<?> collection) {
        return new HashSet<>(collection);
    }
}
