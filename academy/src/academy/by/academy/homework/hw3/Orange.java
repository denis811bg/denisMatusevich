package academy.by.academy.homework.hw3;

public class Orange extends Fruit {
    private String typeOrange;

    public Orange(String nameProduct, Double price, String manufacture, Integer quantity, String typeOrange) {
        super(nameProduct, price, manufacture, quantity);
        this.typeOrange = typeOrange;
    }

    public String getTypeOrange() {
        return typeOrange;
    }

    public void setTypeOrange(String typeOrange) {
        this.typeOrange = typeOrange;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Наименование товара - ");
        stringBuilder.append("Апельсин ").append(getNameProduct()).append("\n");
        stringBuilder.append("Цена - ").append(getPrice() + "\n");
        stringBuilder.append("Количество - ").append(getQuantity() + "\n");
        stringBuilder.append("Производитель - ").append(getManufacture() + "\n");
        stringBuilder.append("Вид апельсина - ").append(getTypeOrange());
        return stringBuilder.toString();
    }
}
