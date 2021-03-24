package academy.by.academy.homework.hw7.Task2;

import java.time.LocalDate;

public class User extends Person {

    private String login;
    private String password;
    private String email;

    public User() {
        super();
    }

    public User(String firstName, String lastName, int age, LocalDate dateOfBirth, String login, String password, String email) {
        super(firstName, lastName, age, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUserInfo() {
        System.out.println("First name = " + getFirstName());
        System.out.println("Last name = " + getLastName());
        System.out.println("Age = " + getAge());
        System.out.println("Date of birth = " + getDateOfBirth().toString());
        System.out.println("Login = " + getLogin());
        System.out.println("Password = " + getPassword());
        System.out.println("E-mail = " + getEmail());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("First name = ").append(getFirstName());
        builder.append(", Last name = ").append(getLastName());
        builder.append(", Age = ").append(getAge());
        builder.append(", Date of birth = ").append(getDateOfBirth().toString());
        builder.append(", Login = ").append(getLogin());
        builder.append(", Password = ").append(getPassword());
        builder.append(", E-mail = ").append(getEmail());
        return builder.toString();
    }
}
