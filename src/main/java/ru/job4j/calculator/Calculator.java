package ru.job4j.calculator;

public class Calculator {

    public static void plus(int first, int second, int third) {
        int result = first + second + third;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500, 400);
        Calculator.plus(4, 2, 14);
        Calculator.plus(3, 5, 12);
    }
}
