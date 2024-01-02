package lab17;

import java.util.Scanner;

class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void readFromConsole() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите название продукта: ");
            String inputProductName = scanner.nextLine();

            if (!inputProductName.isEmpty()) {
                this.productName = inputProductName;
                break;
            } else {
                System.out.println("Название продукта не может быть пустым.");
            }
        }

        while (true) {
            try {
                System.out.print("Введите стоимость продукта: ");
                double inputPrice = Double.parseDouble(scanner.nextLine());

                if (inputPrice < 0) {
                    throw new NumberFormatException("Стоимость должна быть положительной.");
                }

                this.price = inputPrice;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
        }
    }

    public void displayOnScreen() {
        System.out.println("\nИнформация о продукте:");
        System.out.println("Название продукта: " + this.productName);
        System.out.println("Цена продукта: " + this.price);
    }
}
