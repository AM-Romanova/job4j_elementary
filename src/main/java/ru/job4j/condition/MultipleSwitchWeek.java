package ru.job4j.condition;

import java.util.Scanner;

public class MultipleSwitchWeek {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.print("Inter to the day of the week: ");
        String week = sw.nextLine();
        sw.nextLine();
        System.out.println(MultipleSwitchWeek.numberOfDay(week));
        //System.out.println("The day is " + day);
    }

    public static int numberOfDay(String week) {
        int value = switch (week) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            case "Sunday" -> 7;
            default -> 0;
        };
        return value;
    }
}