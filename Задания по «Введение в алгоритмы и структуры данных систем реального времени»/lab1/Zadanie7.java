package ru.mirea.lab1;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        if (n == 0) return;

        System.out.println(Factorial.factorial(n));

    }
}
