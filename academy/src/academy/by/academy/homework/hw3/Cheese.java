package academy.by.academy.homework.hw3;

public class Cheese extends Product {
    private double age;

    public Cheese(String nameProduct, double price, String manufacture, Integer quantity, double age) {
        super(nameProduct, price, manufacture, quantity);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double discount() {
        if (age > 20) {
            return 0.8;
        }
        return 1.0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Наименование товара - ");
        stringBuilder.append("Сыр ").append(getNameProduct()).append("\n");
        stringBuilder.append("Цена - ").append(getPrice() + "\n");
        stringBuilder.append("Количество - ").append(getQuantity() + "\n");
        stringBuilder.append("Производитель - ").append(getManufacture() + "\n");
        stringBuilder.append("Возраст сыра - ").append(getAge());
        return stringBuilder.toString();
    }
}
