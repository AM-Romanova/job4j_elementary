package ru.job4j.oop.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String TOPPING = " + Extra cheese";

    public PizzaExtraCheese(String name) {
        super(name);
    }

    @Override
    public String name() {
        return super.name() + TOPPING;
    }
}
