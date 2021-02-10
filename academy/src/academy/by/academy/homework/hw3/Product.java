package academy.by.academy.homework.hw3;

public class Product {
	private String nameProduct;
	private double price;
	private String manufacture;
	private Integer quantity;

	public Product() {
		super();
	}

	public Product(String nameProduct, double price, String manufacture, Integer quantity) {
		this.nameProduct = nameProduct;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public double getPrice() {
		return price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public double discount() {
		if (quantity > 20) {
			return 0.9;
		}
		return 1.0;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Наименование товара - ");
		stringBuilder.append(getNameProduct() + "\n");
		stringBuilder.append("Цена - ").append(getPrice() + "\n");
		stringBuilder.append("Количество - ").append(getQuantity() + "\n");
		stringBuilder.append("Производитель - ").append(getManufacture());
		return stringBuilder.toString();
	}

}
