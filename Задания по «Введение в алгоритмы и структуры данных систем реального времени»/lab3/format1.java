package ru.mirea.lab3;

// Класс для конвертации из рублей, слизан с первой задачи

public class format1 {
    private double x;

    public format1(double x) {this.x = x;}

    public double getInDollars() {return x/96.04;}

    public double getInEuro() {return x/102.25;}

    public double getInIbs() {return x/118.02;}
}
