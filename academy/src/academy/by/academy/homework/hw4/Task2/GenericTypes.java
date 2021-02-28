package academy.by.academy.homework.hw4.Task2;

import java.util.Arrays;

/**
 * Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
 * Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
 * Содержит конструктор, принимающий значение int и инитает им размер нашего массива.
 * ********************************************************************************************
 * Содержит методы:
 * 1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен,
 * нам нужно его расширить с помощью Arrays.copyOf)
 * 2) взятие по индексу get(int i)
 * 3) взятие последнего элемента getLast()
 * 4) взятие первого элемента getFirst()
 * 5) вывод размера массива
 * 6) вывод индекса последнего заполненого элемента (не путать с размерностью)
 * 7) удаление элемента по индексу (remove(int i)
 * 8) удаление элемента по значению (remove(T obj))
 */
public class GenericTypes<T> {

    public static final int NUMBER_ARRAY_SIZE = 16;

    private T[] arrayT;
    private int countArrayT = 0;

    @SuppressWarnings("unchecked")
    public GenericTypes() {
        super();
        arrayT = (T[]) new Object[NUMBER_ARRAY_SIZE];
    }

    @SuppressWarnings("unchecked")
    public GenericTypes(int size) {
        super();
        arrayT = (T[]) new Object[size];
    }

    /**
     * Добавления в массив объекта типа T - add(T obj).
     */
    public boolean add(T obj) {
        if (countArrayT == arrayT.length - 1) {
            arrayT = Arrays.copyOf(arrayT, arrayT.length * 2 + 1);
        }
        arrayT[countArrayT++] = obj;
        return true;
    }

    /**
     * Взятие по индексу get(int i).
     */
    public T get(int i) {
        if (i < 0 || i >= arrayT.length) {
            System.out.println("Вы ввели некорректный индекс.");
            return null;
        }
        return arrayT[i];
    }

    /**
     * Взятие последнего элемента getLast().
     */
    public T getLast() {
        return arrayT[arrayT.length - 1];
    }

    /**
     * Взятие первого элемента getFirst().
     */
    public T getFirst() {
        return arrayT[0];
    }

    /**
     * Вывод размера массива.
     */
    public int length() {
        return arrayT.length;
    }

    /**
     * Вывод индекса последнего не пустого элемента.
     */
    public int lastIndexNotNullElement() {
        if (isEmpty()) {
            System.out.println("Массив пустой. Добавьте элементы в массив.");
        }
        return countArrayT - 1;
    }

    /**
     * Удалить элемент по индексу.
     */
    public boolean removeOfIndex(int i) {
        if (isEmpty()) {
            System.out.println("Массив пустой. Добавьте элементы в массив.");
            return false;
        }
        if (i < 0 || i >= arrayT.length) {
            System.out.println("Вы ввели некорректный индекс.");
            return false;
        } else {
            if (arrayT[i] != null) {
                System.arraycopy(arrayT, i + 1, arrayT, i, arrayT.length - (i + 1));
                countArrayT--;
                return true;
            } else {
                System.out.println("Элемент по заданному индексу пустой.");
                return false;
            }
        }
    }

    /**
     * Удалить элемент по значению.
     */
    public boolean removeOfValue(T value) {
        if (isEmpty()) {
            System.out.println("Массив пустой. Добавьте элементы в массив.");
            return false;
        }

        int count = countArrayT;
        for (int i = 0; i < countArrayT; i++) {
            if (value.equals(arrayT[i])) {
                System.arraycopy(arrayT, i + 1, arrayT, i, arrayT.length - (i + 1));
                countArrayT--;
                i--;
            }
        }
        return count != countArrayT;
    }

    /**
     * Вывод массива на консоль.
     */
    public void printArrayT() {
        for (T t : arrayT) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    /**
     * Проверка массива на наличие элементов
     * пустой = true
     * заполненный = false
     */
    private boolean isEmpty() {
        int count = 0;
        for (T t : arrayT) {
            if (t == null) {
                count++;
            }
        }
        return count == arrayT.length;
    }
}
