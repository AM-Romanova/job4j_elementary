package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }
    public int multiply(int a) {
        return x * a;
    }
    public int minus(int c) {
        return x * c;
    }
    public int devide(int f) {
        return x / f;
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator1 = new Calculator();
        int result1 = calculator1.multiply(5);
        System.out.println(result1);
        Calculator calculator2 = new Calculator();
        int result2 = calculator2.minus(10);
        System.out.println(result2);
        Calculator calculator3 = new Calculator();
        int result3 = calculator3.devide(5);
        System.out.println(result3);
    }
}