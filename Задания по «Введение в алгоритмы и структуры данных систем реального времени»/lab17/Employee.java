package lab17;

import java.util.Scanner;

class Employee {
    private String name;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void readFromConsole() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите имя работника: ");
            String inputName = scanner.nextLine();

            if (!inputName.isEmpty()) {
                this.name = inputName;
                break;
            } else {
                System.out.println("Имя не может быть пустым.");
            }
        }

        while (true) {
            System.out.print("Введите описание работника: ");
            String inputDesignation = scanner.nextLine();

            if (!inputDesignation.isEmpty()) {
                this.designation = inputDesignation;
                break;
            } else {
                System.out.println("Описание не может быть пустым");
            }
        }
    }

    public void displayOnScreen() {
        System.out.println("\nИнформация о работнике:");
        System.out.println("Имя: " + this.name);
        System.out.println("Описание: " + this.designation);
    }
}
