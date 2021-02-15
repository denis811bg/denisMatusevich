package academy.by.academy.homework.hw3;

import academy.by.academy.homework.hw3.PatternDate.PatternDate;

public class Person {
    public final PatternDate patternDate = new PatternDate();
    private String name;
    private Integer age;
    private String phone;
    private String mail;
    private double money;
    private String dateOfBirth;

    public Person(String name, Integer age, String phone, String mail, double money) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.mail = mail;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean patternSlashDateOfBirth(String dateOfBirth) {
        if (patternDate.validateSlash(dateOfBirth)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean patternDashDateOfBirth(String dateOfBirth) {
        if (patternDate.validateDash(dateOfBirth)) {
            return true;
        } else {
            return false;
        }
    }
}
