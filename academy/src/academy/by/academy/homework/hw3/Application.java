package academy.by.academy.homework.hw3;


import academy.by.academy.homework.hw3.PatternDate.PatternDate;
import academy.by.academy.homework.hw3.Validator.AmericanPhoneValidator;
import academy.by.academy.homework.hw3.Validator.BelarusPhoneValidator;
import academy.by.academy.homework.hw3.Validator.EmailValidator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person personSeller = new Person("Some Seller", 33, "+375-29-0000000", "testseller.com", 1245.75);
        Person personBuyer = new Person("Some Guy", 16, "+1-303-000-00-00", "test@gmail.com", 10575.25);
        Deal deal = new Deal(personSeller, personBuyer, "08-02-2021");

        // Task5, Task9
//        System.out.println("Валидация телефона " + personSeller.getName() + " . Номер телефона: " + personSeller.getPhone());
//        System.out.println(new BelarusPhoneValidator().validate(personSeller.getPhone()));
//        System.out.println("Валидация телефона " + personBuyer.getName() + " . Номер телефона: " + personBuyer.getPhone());
//        System.out.println(new AmericanPhoneValidator().validate(personBuyer.getPhone()));
//        System.out.println("Валидация e-mail " + personSeller.getName() + " . E-mail: " + personSeller.getMail());
//        System.out.println(new EmailValidator().validate(personSeller.getMail()));
//        System.out.println("--------------------------------------------");

        // Task7
//        System.out.println(Deal.deadLine.toString());
//        System.out.println("--------------------------------------------");

        // Task3, Task8
//        System.out.print("Введите дату рождения покупателя: ");
//        String dateOfBirth = scanner.nextLine();
//        if (personBuyer.patternSlashDateOfBirth(dateOfBirth)){
//            System.out.println("Дата соответствует паттерну dd/MM/yyyy.");
//        } else if (personBuyer.patternDashDateOfBirth(dateOfBirth)){
//            System.out.println("Дата соответствует паттерну dd-MM-yyyy.");
//        } else {
//            System.out.println("Дата не соответствует ни одному паттерну.");
//        }
//        scanner.close();

        // Task1, Task2, Task6
        deal.initMenu();
    }
}
