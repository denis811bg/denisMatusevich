package academy.by.academy.homework.hw3;

import java.util.Date;
import java.util.Scanner;

public class Deal {
    public final String strMenu =
            "Добавить товар на склад (введите 1)" +
                    "\nУдалить товар со склада (введите 2)" +
                    "\nПровести сделку (введите 3)" +
                    "\nВывести список товаров на складе (введите 4)" +
                    "\nВыход (введите 0)" +
                    "\n--------------------------------------------";
    public final String strMenuProduct =
            "Вино (введите 1)" +
                    "\nСыр (введите 2)" +
                    "\nАпельсин (введите 3)" +
                    "\nВыход (введите 0)" +
                    "\n--------------------------------------------";
    public final static Scanner scanner = new Scanner(System.in);
    public final static int MIN_COUNT_ARRAY = 1;
    private Person seller;
    private Person buyer;
    private Product[] products;
    private String dealDate;
    private int countProduct = 0;
    private Date deadline;

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

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Deal(Person seller, Person buyer, String dealDate) {
        this.seller = seller;
        this.buyer = buyer;
        this.dealDate = dealDate;
    }

    public void checkBill() {
        double checkSum = 0.0;
        System.out.println("Дата сдедки: " + dealDate);
        System.out.println("--------------------------------------------");
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
            }
            products = null;
            countProduct = 0;
            System.out.println("--------------------------------------------");
        }

        if (checkSum > buyer.getMoney()) {
            System.out.println("Сделка не прошла. У покупателя " + buyer.getName() + " не хватило средств.");
            System.out.println("--------------------------------------------");
            return;
        }
        System.out.println("Сумма сделки: " + checkSum);
        buyer.setMoney(buyer.getMoney() - checkSum);
        seller.setMoney(seller.getMoney() + checkSum);
        System.out.println("Кэш покупателя " + buyer.getName() + ": " + buyer.getMoney() + "\n" +
                "Кэш продавца " + seller.getName() + ": " + seller.getMoney());
        System.out.println("--------------------------------------------");
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

    public void initMenu() {
        System.out.println("Меню: ");
        System.out.println(strMenu);
        String str = scanner.nextLine().trim();
        while (!str.equals("0")) {
            switch (str) {
                case "1": {
                    initProductArray();
                    System.out.println(strMenu);
                    break;
                }
                case "2": {
                    System.out.print("Введите наименование продукта: ");
                    deleteProduct(scanner.nextLine());
                    System.out.println(strMenu);
                    break;
                }
                case "3": {
                    checkBill();
                    System.out.println(strMenu);
                    break;
                }
                case "4": {
                    printProductArray();
                    System.out.println(strMenu);
                    break;
                }
                default: {
                    System.out.println("Вы ввели некорректные данные!");
                    System.out.println("--------------------------------------------");
                    System.out.println(strMenu);
                }
            }
            str = scanner.nextLine().trim();
        }
    }

    public void initProductArray() {
        System.out.println("Меню добавления товаров на склад:");
        System.out.println(strMenuProduct);
        String str = scanner.nextLine().trim();
        while (!str.equals("0")) {
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
        int count = 0;
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

            if (countProduct != (count + 1)) {
                System.arraycopy(products, count + 1, products, count, countProduct - count + 1);
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
