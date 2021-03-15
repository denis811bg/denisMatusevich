package academy.by.academy.homework.hw3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Deal {
    public static final String PATHNAME = "src/academy/by/academy/homework/hw3/printFile";
    public static final Scanner scanner = new Scanner(System.in);
    public final String strMenuProduct =
            "Вино (введите 1)" +
                    "\nСыр (введите 2)" +
                    "\nАпельсин (введите 3)" +
                    "\nВыход (введите 0)" +
                    "\n--------------------------------------------";
    public final static int MIN_COUNT_ARRAY = 1;
    private Person seller;
    private Person buyer;
    private Product[] products;
    private LocalDate dealDate;
    private int countProduct = 0;
    public static Calendar deadLine;

    static {
        deadLine = Calendar.getInstance();
        deadLine.add(Calendar.DAY_OF_MONTH, 10);
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public LocalDate getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDate dealDate) {
        this.dealDate = dealDate;
    }

    public Deal(Person seller, Person buyer, LocalDate dealDate) {
        this.seller = seller;
        this.buyer = buyer;
        this.dealDate = dealDate;
    }

    public void checkBill() {
        File file = new File(PATHNAME);
        if (!file.exists()) {
            file.mkdirs();
        }

        try (BufferedWriter writerCheckBill = new BufferedWriter(new FileWriter(new File(file, dealDate + ".txt")))) {
            double checkSum = 0.0;
            System.out.println("Дата сделки: ");
            writerCheckBill.write("Дата сделки: ");
            writerCheckBill.newLine();
            System.out.println("День: " + dealDate.getDayOfMonth());
            writerCheckBill.write("День: " + dealDate.getDayOfMonth());
            writerCheckBill.newLine();
            System.out.println("Месяц: " + dealDate.getMonth());
            writerCheckBill.write("Месяц: " + dealDate.getMonth());
            writerCheckBill.newLine();
            System.out.println("Год: " + dealDate.getYear());
            writerCheckBill.write("Год: " + dealDate.getYear());
            writerCheckBill.newLine();
            System.out.println("--------------------------------------------");
            writerCheckBill.write("--------------------------------------------");
            writerCheckBill.newLine();
            System.out.println("Дедлайн сделки: " + new SimpleDateFormat("dd/MM/yyyy").format(deadLine.getTime()));
            writerCheckBill.write("Дедлайн сделки: " + new SimpleDateFormat("dd/MM/yyyy").format(deadLine.getTime()));
            writerCheckBill.newLine();
            System.out.println("--------------------------------------------");
            writerCheckBill.write("--------------------------------------------");
            writerCheckBill.newLine();
            if (products == null) {
                System.out.println("Склад пустой. Обратитесь к поставщику для закупки товара.");
                System.out.println("--------------------------------------------");
                return;
            } else {
                for (int i = 0; i < countProduct; i++) {
                    checkSum += products[i].calcFinalPrice() * products[i].getQuantity();
                    System.out.println("Наименование товара - " + products[i].getNameProduct() +
                            "\nЦена - " + products[i].getPrice() +
                            "\nСкидка - " + (100 - products[i].discount() * 100) + "%" +
                            "\nЦена со скидкой - " + products[i].calcFinalPrice() +
                            "\nКоличество = " + products[i].getQuantity() +
                            "\nИтого = " + checkSum);
                    writerCheckBill.write("Наименование товара - " + products[i].getNameProduct());
                    writerCheckBill.newLine();
                    writerCheckBill.write("Цена - " + products[i].getPrice());
                    writerCheckBill.newLine();
                    writerCheckBill.write("Скидка - " + (100 - products[i].discount() * 100) + "%");
                    writerCheckBill.newLine();
                    writerCheckBill.write("Цена со скидкой - " + products[i].calcFinalPrice());
                    writerCheckBill.newLine();
                    writerCheckBill.write("Количество = " + products[i].getQuantity());
                    writerCheckBill.newLine();
                    writerCheckBill.write("Итого = " + checkSum);
                    writerCheckBill.newLine();
                    writerCheckBill.write("--------------------------------------------");
                    writerCheckBill.newLine();
                }
                if (checkSum > buyer.getMoney()) {
                    System.out.println("Сделка не прошла. У покупателя " + buyer.getName() + " не хватило средств.");
                    writerCheckBill.write("Сделка не прошла. У покупателя " + buyer.getName() + " не хватило средств.");
                    writerCheckBill.newLine();
                    System.out.println("--------------------------------------------");
                    return;
                } else {
                    products = null;
                    countProduct = 0;
                    System.out.println("--------------------------------------------");
                }
            }

            System.out.println("Сумма сделки: " + checkSum);
            writerCheckBill.write("Сумма сделки: " + checkSum);
            writerCheckBill.newLine();
            buyer.setMoney(buyer.getMoney() - checkSum);
            seller.setMoney(seller.getMoney() + checkSum);
            System.out.println("Кэш покупателя " + buyer.getName() + ": " + buyer.getMoney() + "\n" +
                    "Кэш продавца " + seller.getName() + ": " + seller.getMoney());
            System.out.println("--------------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addProduct(Product product) {
        if (products == null) {
            products = new Product[MIN_COUNT_ARRAY];
        } else {
            if ((countProduct + 1) > products.length) {
                expandProductArray();
            }
        }
        products[countProduct++] = product;
    }

    public void expandProductArray() {
        Product[] tmpProduct = new Product[products.length * 2 + 1];
        System.arraycopy(products, 0, tmpProduct, 0, products.length);
        products = tmpProduct;
    }

    public void initProductArray() {
        System.out.println("Меню добавления товаров на склад:");
        System.out.println(strMenuProduct);
        String str = scanner.nextLine().trim();
        while (!"0".equals(str)) {
            switch (str) {
                case "1": {
                    System.out.println("Введите наименование вина, стоимость, производителя, количество, тип, крепость и страну производителя: ");
                    addProduct(new Wine(
                            scanner.nextLine(),
                            Double.parseDouble(scanner.nextLine().trim()),
                            scanner.nextLine(),
                            Integer.parseInt(scanner.nextLine().trim()),
                            scanner.nextLine(),
                            Double.parseDouble(scanner.nextLine().trim()),
                            scanner.nextLine()));
                    System.out.println("Добавлен товар:\n" + products[countProduct - 1].toString());
                    System.out.println("--------------------------------------------");
                    System.out.println(strMenuProduct);
                    break;
                }
                case "2": {
                    System.out.println("Введите наименование сыра, стоимость, производителя, количество, и возраст сыра: ");
                    addProduct(new Cheese(
                            scanner.nextLine(),
                            Double.parseDouble(scanner.nextLine().trim()),
                            scanner.nextLine(),
                            Integer.parseInt(scanner.nextLine().trim()),
                            Double.parseDouble(scanner.nextLine().trim())));
                    System.out.println("Добавлен товар:\n" + products[countProduct - 1].toString());
                    System.out.println("--------------------------------------------");
                    System.out.println(strMenuProduct);
                    break;
                }
                case "3": {
                    System.out.println("Введите наименование апельсина, стоимость, производителя, количество, и сорт апельсина: ");
                    addProduct(new Orange(
                            scanner.nextLine(),
                            Double.parseDouble(scanner.nextLine().trim()),
                            scanner.nextLine(),
                            Integer.parseInt(scanner.nextLine().trim()),
                            scanner.nextLine()));
                    System.out.println("Добавлен товар:\n" + products[countProduct - 1].toString());
                    System.out.println("--------------------------------------------");
                    System.out.println(strMenuProduct);
                    break;
                }
                default: {
                    System.out.println("Вы ввели некорректные данные!");
                    System.out.println("--------------------------------------------");
                    System.out.println(strMenuProduct);
                    break;
                }
            }
            str = scanner.nextLine().trim();
        }
    }

    public void deleteProduct(String name) {
        Integer count = null;
        if (products == null) {
            System.out.println("Склад пустой. Обратитесь к поставщику для закупки товара.");
            System.out.println("--------------------------------------------");
        } else {
            for (int i = 0; i < countProduct; i++) {
                if (products[i].getNameProduct().equalsIgnoreCase(name)) {
                    count = i;
                    break;
                }
            }

            if (count == null) {
                System.out.println("Такого товара не существует");
                System.out.println("--------------------------------------------");
                return;
            }

            if (countProduct != (count + 1)) {
                System.arraycopy(products, count + 1, products, count, countProduct - (count + 1));
            }
            products[--countProduct] = null;
            System.out.println("Товар удален.");
            System.out.println("--------------------------------------------");
        }
    }

    public void printProductArray() {
        int countProduct = 0;
        double checkSum = 0;
        if (products != null) {
            for (int i = 0; i < this.countProduct; i++) {
                System.out.println(products[i].toString());
                countProduct += products[i].getQuantity();
                checkSum += products[i].getPrice() * products[i].getQuantity();
                System.out.println("--------------------------------------------");
            }
        }
        System.out.println("Общее количество товаров - " + countProduct + "\nНа сумму без скидок - " + checkSum);
        System.out.println("--------------------------------------------");
    }
}
