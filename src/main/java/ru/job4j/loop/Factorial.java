package ru.job4j.loop;

public class Factorial {

    public static int calculate(int number) {
        int result = 1;
        for (int fact = 1; fact <= number; fact++) {
                result = result * fact;
            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println(calculate(2));
        System.out.println(calculate(4));
        System.out.println(calculate(0));
    }
}