package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double remainderAndDividedPlusSumAndMultiply(double first, double second) {
        return remainder(first, second)
                + sum(first, second)
                + multiply(first, second)
                + divided(first, second);
    }

    public static double remainderAndDivided(double first, double second) {
        return remainder(first, second)
                + divided(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + remainderAndDividedPlusSumAndMultiply(40, 50));
        System.out.println("Результат расчета равен: " + remainderAndDivided(4, 13));
    }
}