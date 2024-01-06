package ru.job4j.condition;

import java.util.Scanner;

public class SwitchWeek {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.print("Введите число: ");
        int week = sw.nextInt();
        sw.nextLine();
        System.out.println(SwitchWeek.dayOFWeek(week));
        //System.out.println("The day is " + day);
    }

    public static String dayOFWeek(int week) {
        String day = "";
        switch (week) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "---";
                break;
        }
        return day;
    }
}