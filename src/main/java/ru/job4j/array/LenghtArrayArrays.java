package ru.job4j.array;

public class LenghtArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{2}, {4, 6}, {7, 8, 9}, {4, 9, 7, 5}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}