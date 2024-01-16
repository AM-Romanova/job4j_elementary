package ru.job4j.calculator;

import javax.swing.*;
import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        float num2 = scanner.nextInt();

        float result;

        System.out.print("Введите действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                result = num1 + num2;
                System.out.print("Результат: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.print("Результат: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.print("Результат: " + result);
                break;
            case "/":
                if (num2 == 0)
                    System.out.print("Error");
                else {
                    result = num1 / num2;
                    System.out.print("Результат: " + result);
                }
                break;
            default:
                System.out.print("Неверные данные");
        }
    }
}
