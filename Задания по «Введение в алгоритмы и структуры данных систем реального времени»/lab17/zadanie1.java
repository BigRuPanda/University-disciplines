package lab17;

public class zadanie1 {

    public static void main(String[] args) {
        Student student = new Student("", 0);

        System.out.println("Введите информацию о студенте");
        student.readFromConsole();
        student.displayOnScreen();

        Employee employee = new Employee("", "");

        System.out.println("\nВведите информацию о работнике:");
        employee.readFromConsole();
        employee.displayOnScreen();

        Product product = new Product("", 0.0);

        System.out.println("\nВведите информацию о продукте:");
        product.readFromConsole();
        product.displayOnScreen();
    }
}
