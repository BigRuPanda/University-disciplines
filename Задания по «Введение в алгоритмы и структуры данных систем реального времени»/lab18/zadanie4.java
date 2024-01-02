package lab18;

import java.util.Scanner;

public class zadanie4 {

    // Шаг 1
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Введено не integer значение");
        }
        catch (ArithmeticException e) {
            System.out.println("Попытка деления на 0");
        }
        finally {
            System.out.println("Блок finally всегда будет выполняться");
        }
    }

    // Шаг 2
    // Блок finally будет выполняться независимо от того, обрабатывается ли исключение или нет

    public static void main(String[] args) {
        exceptionDemo();
    }
}
