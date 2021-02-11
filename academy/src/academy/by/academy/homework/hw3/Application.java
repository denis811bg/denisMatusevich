package academy.by.academy.homework.hw3;


import academy.by.academy.homework.hw3.Validator.AmericanPhoneValidator;
import academy.by.academy.homework.hw3.Validator.BelarusPhoneValidator;
import academy.by.academy.homework.hw3.Validator.EmailValidator;

public class Application {
    public static void main(String[] args) {
        Person personSeller = new Person("Some Seller", 33, "+375-29-0000000", "testseller.com", 1245.75);
        Person personBuyer = new Person("Some Guy", 16, "+1-303-000-00-00", "test@gmail.com", 10575.25);
        Deal deal = new Deal(personSeller, personBuyer, "08/02/2021");

        System.out.println("Валидация телефона " + personSeller.getName() + " . Номер телефона: " + personSeller.getPhone());
        System.out.println(new BelarusPhoneValidator().validate(personSeller.getPhone()));
        System.out.println("Валидация телефона " + personBuyer.getName() + " . Номер телефона: " + personBuyer.getPhone());
        System.out.println(new AmericanPhoneValidator().validate(personBuyer.getPhone()));
        System.out.println("Валидация e-mail " + personSeller.getName() + " . E-mail: " + personSeller.getMail());
        System.out.println(new EmailValidator().validate(personSeller.getMail()));
        System.out.println("--------------------------------------------");

        deal.initMenu();
    }
}
