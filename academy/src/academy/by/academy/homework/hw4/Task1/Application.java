package academy.by.academy.homework.hw4.Task1;

import java.util.Calendar;
import java.util.Scanner;

public class Application {
    public static final Scanner scanner = new Scanner(System.in);
    private static Date date = null;
    private static Date date1 = null;

    public static void main(String[] args) {

        System.out.println(MainMenu.initMainMenu().toString());
        while (true) {
            System.out.print("Введите пункт меню: ");
            String line = scanner.nextLine();

            switch (line) {

                case "1": {
                    System.out.print("Задать дату: ");
                    date = Date.initDate();
                    System.out.println(MainMenu.initMainMenu().toString());
                    break;
                }

                case "2": {
                    System.out.println("Вывести дату: ");
                    if (date != null) {
                        System.out.println(date.toString());
                    } else {
                        System.out.println("Дата не создана.");
                    }
                    System.out.println(MainMenu.initMainMenu().toString());
                    break;
                }

                case "3": {
                    System.out.println("Вывести на консоль день недели по заданной дате: ");
                    if (date != null) {
                        System.out.println("Текущая дата: \n" + date.toString());
                        System.out.println("День недели: " + date.getDay().dayOfWeekValue());
                    } else {
                        System.out.println("Дата не создана.");
                    }
                    System.out.println(MainMenu.initMainMenu().toString());
                    break;
                }

                case "4": {
                    System.out.println("Рассчитать количество дней, в заданном временном промежутке: ");
                    System.out.print("Задайте другую дату: ");
                    date1 = Date.initDate();

                    Calendar cal1 = Calendar.getInstance();
                    Calendar cal2 = Calendar.getInstance();
                    if (date != null && date1 != null) {
                        cal1.set(date.getYear().getYear(), date.getMonth().getMonth() - 1, date.getDay().getDay());
                        cal2.set(date1.getYear().getYear(), date1.getMonth().getMonth() - 1, date1.getDay().getDay());
                        System.out.println("Количество дней: " + Date.daysBetween(cal1.getTime(), cal2.getTime()));
                    } else {
                        System.out.println("Не задана первая дата.");
                    }

                    System.out.println(MainMenu.initMainMenu().toString());
                    break;
                }

                case "5": {
                    System.out.println("Высокосный год или нет: ");
                    if (date != null) {
                        System.out.println("Текущий год: " + date.getYear().getYear());
                        if (date.getYear().isLeapYear()) {
                            System.out.println("Год высокосный.");
                        } else {
                            System.out.println("Год не высокосный.");
                        }
                    } else {
                        System.out.println("Дата не создана.");
                    }
                    System.out.println(MainMenu.initMainMenu().toString());
                    break;
                }

                case "0": {
                    System.out.println("Выход.");
                    scanner.close();
                    return;
                }

                default: {
                    System.out.println("Вы ввели некорректный номер. Введите значение от 0 до 5.");
                    System.out.println(MainMenu.initMainMenu().toString());
                    break;
                }

            }
        }

    }
}
