package academy.by.academy.homework.hw4.Task2;

import java.util.Scanner;

public class Application {

    public static StringBuilder initMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--------------------------------------------------\n");
        stringBuilder.append("MENU:\n");
        stringBuilder.append("1. Добавить элемент в массив.\n");
        stringBuilder.append("2. Взять элемент из массива по индексу.\n");
        stringBuilder.append("3. Взять последний элемент массива.\n");
        stringBuilder.append("4. Взять первый элемент массива.\n");
        stringBuilder.append("5. Вывод размера массива.\n");
        stringBuilder.append("6. Вывод индекса последнего не пустого элемента.\n");
        stringBuilder.append("7. Удалить элемент по индексу.\n");
        stringBuilder.append("8. Удалить элемент по значению.\n");
        stringBuilder.append("9. Вывод массива на консоль.\n");
        stringBuilder.append("0. Выход.\n");
        stringBuilder.append("--------------------------------------------------");
        return stringBuilder;
    }

    public static void main(String[] args) {

        GenericTypes<Integer> generic = new GenericTypes<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println(initMenu().toString());
        while (true) {
            System.out.print("Введите пункт меню: ");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Добавить элемент в массив. Введите число: ");
                    if (generic.add(scanner.nextInt())) {
                        scanner.nextLine();
                        System.out.println("Элемент добавлен.");
                    }
                    System.out.println(initMenu().toString());
                    break;
                }
                case "2": {
                    System.out.print("Взять элемент из массива по индексу. Введите индекс: ");
                    System.out.println("Элемент массива: " + generic.get(scanner.nextInt()));
                    scanner.nextLine();
                    System.out.println(initMenu().toString());
                    break;
                }
                case "3": {
                    System.out.println("Взять последний элемент массива: ");
                    System.out.println(generic.getLast());
                    System.out.println(initMenu().toString());
                    break;
                }
                case "4": {
                    System.out.println("Взять первый элемент массива: ");
                    System.out.println(generic.getFirst());
                    System.out.println(initMenu().toString());
                    break;
                }
                case "5": {
                    System.out.println("Вывод размера массива: " + generic.length());
                    System.out.println(initMenu().toString());
                    break;
                }
                case "6": {
                    System.out.println("Вывод индекса последнего не пустого элемента: " + generic.lastIndexNotNullElement());
                    System.out.println(initMenu().toString());
                    break;
                }
                case "7": {
                    System.out.print("Удалить элемент по индексу. Введите индекс: ");
                    if (generic.removeOfIndex(scanner.nextInt())) {
                        System.out.println("Элемент удален.");
                    }
                    scanner.nextLine();
                    System.out.println(initMenu().toString());
                    break;
                }
                case "8": {
                    System.out.print("Удалить элемент по значению. Введите значение: ");
                    if (generic.removeOfValue(scanner.nextInt())) {
                        System.out.println("Элемент удален.");
                    } else {
                        System.out.println("Элемент не найден.");
                    }
                    scanner.nextLine();
                    System.out.println(initMenu().toString());
                    break;
                }
                case "9": {
                    System.out.println("Вывод массива на консоль: ");
                    generic.printArrayT();
                    System.out.println(initMenu().toString());
                    break;
                }
                case "0": {
                    scanner.close();
                    return;
                }
                default: {
                    System.out.println("Вы ввели некорректный номер. Введите значение от 0 до 9.");
                    System.out.println(initMenu().toString());
                    break;
                }
            }
        }
    }
}
