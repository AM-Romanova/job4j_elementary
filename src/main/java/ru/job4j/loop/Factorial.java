package ru.job4j.loop;

public class Factorial {

    public static int calculate(int number) {
        int result = 1;
        for (int fact = 1; fact <= number; fact++) {
                result = result * fact;
            }
            return result;
        }
}