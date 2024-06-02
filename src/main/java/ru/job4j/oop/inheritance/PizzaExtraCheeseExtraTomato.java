package ru.job4j.oop.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String TOPPING2 = " + Extra Tomato";

    public PizzaExtraCheeseExtraTomato(String name) {
        super(name);
    }

    @Override
    public String name() {
        return super.name() + TOPPING2;
    }

    public static void main(String[] args) {
        PizzaExtraCheeseExtraTomato iceCream = new PizzaExtraCheeseExtraTomato("Tomato");
        System.out.println(iceCream.name());
    }
}