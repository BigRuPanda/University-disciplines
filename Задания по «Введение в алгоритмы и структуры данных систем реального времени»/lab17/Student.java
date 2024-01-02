package lab17;

import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void readFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя студента: ");
        this.name = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Введите возраст студента: ");
                int inputAge = Integer.parseInt(scanner.nextLine());

                if (inputAge < 0) {
                    throw new NumberFormatException("Возраст должен быть положительным.");
                }

                this.age = inputAge;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
        }
    }

    public void displayOnScreen() {
        System.out.println("\nИнвормация о студенте:");
        System.out.println("Имя: " + this.name);
        System.out.println("Возраст: " + this.age);
    }
}
