package ru.job4j.oop.encapsulation;

public class ProductContains {
    public static void main(String[] args) {
        Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 100);
        boolean isEqual = first.equals(second);
        System.out.println(isEqual);
    }
}