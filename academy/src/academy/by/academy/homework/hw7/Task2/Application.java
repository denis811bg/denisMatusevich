package academy.by.academy.homework.hw7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

/**
 * a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth
 * b)	Добавить класс User, который наследуется от Person, с полями: login, password, email
 * c)	Добавить гетеры, сетеры. Добавить метод printUserInfo в User. Вывести с помощью рефлексии все поля и методы, сначала через
 * getMethod("name")
 * getMethods()
 * getField("name")
 * getFields()
 * а затем через
 * getDeclaredMethod("name")
 * getDeclaredMethods()
 * getDeclaredField("name")
 * getDeclaredFields()
 * Посмотреть разницу. Просетать все значения через Reflection. (set метод класса Field).
 * Вывести значения полей через Reflection. (get метод класса Field). Вызвать toString через invoke.
 */
public class Application {
    public static void main(String[] args) {

        User user = new User("Denis", "Matusevich", 33, LocalDate.parse("1987-10-14"),
                "denis811bg", "1111", "denis811bg@gmail.com");

        System.out.println("Source object: ");
        user.printUserInfo();

        Class<? extends User> clsUser = user.getClass();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("1. getMethod()");
        try {
            Method methodAge = clsUser.getMethod("getAge");
            System.out.println(methodAge);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("2. getMethods()");
        Method[] arrayMethods = clsUser.getMethods();
        for (Method tmpMethod : arrayMethods) {
            System.out.println(tmpMethod);
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("3. getField()");
        try {
            Field fieldLogin = clsUser.getField("login");
            System.out.println(fieldLogin);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("4. getFields()");
        Field[] arrayFields = clsUser.getFields();
        for (Field tmpField : arrayFields) {
            System.out.println(tmpField);
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("5. getDeclaredMethod()");
        try {
            Method methodEmail = clsUser.getDeclaredMethod("getEmail");
            System.out.println(methodEmail);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("6. getDeclaredMethods()");
        Method[] arrayDeclaredMethods = clsUser.getDeclaredMethods();
        for (Method tmpMethod : arrayDeclaredMethods) {
            System.out.println(tmpMethod);
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("7. getDeclaredField()");
        try {
            Field fieldLastName = clsUser.getDeclaredField("password");
            System.out.println(fieldLastName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("8. getDeclaredFields()");
        Field[] arrayDeclaredFields = clsUser.getDeclaredFields();
        for (Field tmpField : arrayDeclaredFields) {
            System.out.println(tmpField);
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("9. Set and get value: ");
        Class<?> clsPerson = clsUser.getSuperclass();
        try {
            Field setFirstName = clsPerson.getDeclaredField("firstName");
            Field setLastName = clsPerson.getDeclaredField("lastName");
            Field setAge = clsPerson.getDeclaredField("age");
            Field setDateOfBirth = clsPerson.getDeclaredField("dateOfBirth");
            Field setLogin = clsUser.getDeclaredField("login");
            Field setPassword = clsUser.getDeclaredField("password");
            Field setEmail = clsUser.getDeclaredField("email");
            setFirstName.setAccessible(true);
            setLastName.setAccessible(true);
            setAge.setAccessible(true);
            setDateOfBirth.setAccessible(true);
            setLogin.setAccessible(true);
            setPassword.setAccessible(true);
            setEmail.setAccessible(true);
            setFirstName.set(user, "Ivan");
            setLastName.set(user, "Ivanov");
            setAge.set(user, 20);
            setDateOfBirth.set(user, LocalDate.parse("2000-10-14"));
            setLogin.set(user, "ivanov811bg");
            setPassword.set(user, "7777");
            setEmail.set(user, "ivanov811bg@gmail.com");
            System.out.println("New first name = " + setFirstName.get(user));
            System.out.println("New last name = " + setLastName.get(user));
            System.out.println("New age = " + setAge.getInt(user));
            System.out.println("New date of birth = " + setDateOfBirth.get(user).toString());
            System.out.println("New login = " + setLogin.get(user));
            System.out.println("New password = " + setPassword.get(user));
            System.out.println("New email = " + setEmail.get(user));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("10. Invoke toString");
        try {
            Method methodToString = clsUser.getDeclaredMethod("printUserInfo");
            methodToString.invoke(user);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
