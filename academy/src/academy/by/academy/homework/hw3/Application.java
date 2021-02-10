package academy.by.academy.homework.hw3;

public class Application {
	public static void main(String[] args) {
		Person personSeller = new Person("Some Seller", 33, "+375290000000", "test@seller.com", 1245.75);
		Person personBuyer = new Person("Some Guy", 16, "+375330000000", "test@gmail.com", 10575.25);
		Deal deal = new Deal(personSeller, personBuyer, "08/02/2021");

		deal.initMenu();
	}
}
