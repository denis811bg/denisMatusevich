package academy.by.academy.homework.hw3;


import academy.by.academy.homework.hw3.PatternDate.PatternDate;
import academy.by.academy.homework.hw3.Validator.AmericanPhoneValidator;
import academy.by.academy.homework.hw3.Validator.BelarusPhoneValidator;
import academy.by.academy.homework.hw3.Validator.EmailValidator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    public static final String strMenu =
            "Добавить товар на склад (введите 1)" +
                    "\nУдалить товар со склада (введите 2)" +
                    "\nПровести сделку (введите 3)" +
                    "\nВывести список товаров на складе (введите 4)" +
                    "\nВыход (введите 0)" +
                    "\n--------------------------------------------";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person personSeller;
        Person personBuyer;
        Deal deal;

        while (true) {
            String phoneSeller, phoneBuyer;
            String mailSeller, mailBuyer;
            while (true) {
                System.out.print("Введите номер телефона продавца: ");
                phoneSeller = scanner.nextLine();
                System.out.println("--------------------------------------------");
                if (new BelarusPhoneValidator().validate(phoneSeller) || new AmericanPhoneValidator().validate(phoneSeller)) {
                    break;
                }
            }

            while (true) {
                System.out.print("Введите e-mail продавца: ");
                mailSeller = scanner.nextLine();
                System.out.println("--------------------------------------------");
                if (new EmailValidator().validate(mailSeller)) {
                    break;
                }
            }

            while (true) {
                System.out.print("Введите номер телефона покупателя: ");
                phoneBuyer = scanner.nextLine();
                System.out.println("--------------------------------------------");
                if (new BelarusPhoneValidator().validate(phoneBuyer) || new AmericanPhoneValidator().validate(phoneBuyer)) {
                    break;
                }
            }

            while (true) {
                System.out.print("Введите e-mail покупателя: ");
                mailBuyer = scanner.nextLine();
                System.out.println("--------------------------------------------");
                if (new EmailValidator().validate(mailBuyer)) {
                    break;
                }
            }
            personSeller = new Person("Some Seller", 33, phoneSeller, mailSeller, 1245.75);
            personBuyer = new Person("Some Guy", 16, phoneBuyer, mailBuyer, 10575.25);
            if (personSeller != null && personBuyer != null) {
                break;
            }
        }

        System.out.print("Введите дату сделки в формате dd-MM-yyyy или dd/MM/yyyy: ");
        String dealDate;
        PatternDate patternDate = new PatternDate();
        while (true) {
            dealDate = scanner.nextLine().trim();
            System.out.println("--------------------------------------------");
            if (patternDate.validateDash(dealDate)) {
                deal = new Deal(personSeller, personBuyer, LocalDate.parse(dealDate, DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                break;
            } else if (patternDate.validateSlash(dealDate)) {
                deal = new Deal(personSeller, personBuyer, LocalDate.parse(dealDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                break;
            } else {
                System.out.println("Вы ввели некорректный формат даты. dd/MM/yyyy или dd-MM-yyyy");
                System.out.println("--------------------------------------------");
            }
        }

//        System.out.print("Введите дату рождения покупателя: ");
//        String dateOfBirth = scanner.nextLine();
//        if (patternDate.validateSlash(dateOfBirth)){
//            System.out.println("Дата соответствует паттерну dd/MM/yyyy.");
//        } else if (patternDate.validateDash(dateOfBirth)){
//            System.out.println("Дата соответствует паттерну dd-MM-yyyy.");
//        } else {
//            System.out.println("Дата не соответствует ни одному паттерну.");
//        }

        System.out.println("Меню: ");
        System.out.println(strMenu);
        String str = scanner.nextLine().trim();
        while (!"0".equals(str)) {
            switch (str) {
                case "1": {
                    deal.initProductArray();
                    System.out.println(strMenu);
                    break;
                }
                case "2": {
                    System.out.print("Введите наименование продукта: ");
                    deal.deleteProduct(scanner.nextLine());
                    System.out.println(strMenu);
                    break;
                }
                case "3": {
                    deal.checkBill();
                    System.out.println(strMenu);
                    break;
                }
                case "4": {
                    deal.printProductArray();
                    System.out.println(strMenu);
                    break;
                }
                default: {
                    System.out.println("Вы ввели некорректные данные!");
                    System.out.println("--------------------------------------------");
                    System.out.println(strMenu);
                }
            }
            str = scanner.nextLine().trim();
        }

        scanner.close();
    }
}
