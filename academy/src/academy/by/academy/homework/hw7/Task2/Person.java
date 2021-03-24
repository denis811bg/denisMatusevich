package academy.by.academy.homework.hw7.Task2;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private LocalDate dateOfBirth;

    public Person() {
        super();
    }

    public Person(String firstName, String lastName, int age, LocalDate dateOfBirth) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
