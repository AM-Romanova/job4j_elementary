package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double result = amount;
        while (result > 0) {
            year++;
            result = result * percent / 100 + result - salary;
        }
        return year;
    }
}