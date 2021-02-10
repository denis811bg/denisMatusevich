package academy.by.academy.homework.hw3;

public class Person {
	private String name;
	private Integer age;
	private String phone;
	private String mail;
	private double money;

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

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
