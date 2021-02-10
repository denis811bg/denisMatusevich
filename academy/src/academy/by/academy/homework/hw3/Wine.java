package academy.by.academy.homework.hw3;

public class Wine extends Product {
	private String typeWine;
	private double degree;
	private String country;

	public Wine(String nameProduct, double price, String manufacture, Integer quantity, String typeWine, double degree,
			String country) {
		super(nameProduct, price, manufacture, quantity);
		this.typeWine = typeWine;
		this.degree = degree;
		this.country = country;
	}

	public String getTypeWine() {
		return typeWine;
	}

	public double getDegree() {
		return degree;
	}

	public String getCountry() {
		return country;
	}

	public double discount() {
		if (country.equals("Georgia")) {
			return 0.83;
		}
		return 1.0;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Наименование товара - ");
		stringBuilder.append("Вино ").append(getNameProduct() + "\n");
		stringBuilder.append("Цена - ").append(getPrice() + "\n");
		stringBuilder.append("Количество - ").append(getQuantity() + "\n");
		stringBuilder.append("Производитель - ").append(getManufacture() + "\n");
		stringBuilder.append("Тип вина - ").append(getTypeWine() + "\n");
		stringBuilder.append("Крепость - ").append(getDegree() + "\n");
		stringBuilder.append("Страна производитель - ").append(getCountry());
		return stringBuilder.toString();
	}
}
