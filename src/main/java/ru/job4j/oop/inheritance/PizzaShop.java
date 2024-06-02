package ru.job4j.oop.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Just tasty pizza");
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese("Extra cheese");
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato("Tomato");
        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }
}

