package academy.by.academy.homework.hw3;

public class Fruit extends Product{
    public Fruit(String nameProduct, Double price, String manufacture, Integer quantity) {
        super(nameProduct, price, manufacture, quantity);
    }

    @Override
    public double discount() {
        if (getQuantity() > 20){
            return 0.8;
        }
        return 1.0;
    }
}
