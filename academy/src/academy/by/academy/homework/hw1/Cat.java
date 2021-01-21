package academy.by.academy.homework.hw1;

public class Cat {
	int age;
	String nickname;
	private double money;
	private char initials;
	private boolean isHomeAnimal;

	public Cat() {
		super();
	}

	public Cat(String nickname) {
		super();
		this.nickname = nickname;
		this.initials = nickname.charAt(0);
		this.isHomeAnimal = true;
	}

	public double getMoney() {
		return this.money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public char getInitials() {
		return this.initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean isHomeAnimal() {
		return this.isHomeAnimal;
	}

	public void setHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	public void grow() {
		this.age++;
	}

	public void sleep() {
		System.out.println("Cat sleep");
	}

	public void eat() {
		System.out.println("Cat eat");
	}

	public void walk() {
		System.out.println("Cat walk");
	}
}
