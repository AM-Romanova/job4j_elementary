package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean max = left >= right;
        int result = max ? left : right;
        return result;
    }

    public static int summation(int first, int second) {
        int result = first + second;
        return result;
    }

    public static void main(String[] args) {
        int result = max(33, 65);
        int result1 = max(73, 5);
        int result2 = summation(53, 57);
        int result3 = summation(1, 3);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}