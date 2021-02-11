package academy.by.academy.homework.hw3;

public abstract class Product {
    private String nameProduct;
    private double price;
    private String manufacture;
    private Integer quantity;

    public Product(String nameProduct, double price, String manufacture, Integer quantity) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.manufacture = manufacture;
        this.quantity = quantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public abstract double discount();

    public double calcFinalPrice() {
        return getPrice() * discount();
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
