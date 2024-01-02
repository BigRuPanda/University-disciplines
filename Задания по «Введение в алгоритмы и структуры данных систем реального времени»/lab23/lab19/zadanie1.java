package lab19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        validFIO();
        validINN();
        System.out.println("Все верно!");
    }

    public static void validFIO() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое ФИО: ");
        String fio;
        try{
            fio = sc.nextLine();
            if (fio.split(" ").length != 3) {
                throw new BadFIO("ФИО должно иметь 3 слова!");
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Ошибка");
            validFIO();
        } catch (BadFIO badFIOArgumentsException) {
            System.out.println(badFIOArgumentsException.getMessage());
            validFIO();
        }
    }

    public static void validINN() {
        Scanner sc = new Scanner(System.in);
        String inn;
        System.out.println("Введите свой ИНН: ");
        try{
            inn = sc.nextLine();
            try{
                Long.parseLong(inn);
            } catch (NumberFormatException numberFormatException) {
                throw new BadINN("ИНН должен быть числом!");
            }
            if (inn.length() != 12) {
                throw new BadINN("ИНН должен быть 12 символов в длину!");
            }

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Введите integer!");
            validINN();
        } catch (BadINN badINNArgumentsException) {
            System.out.println(badINNArgumentsException.getMessage());
            validINN();
        }
    }

}