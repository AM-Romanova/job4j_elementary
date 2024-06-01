package ru.job4j.oop;

public class Cat {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.giveNick("Гав");
        cat2.giveNick("Блэк");
        cat1.show("Котлета");
        cat2.show("Рыба");
    }
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
        System.out.println(this.name);
    }

    private String food;

    public void show(String eat) {
        this.food = eat;
        System.out.println(this.food);
    }

    public String sound() {
        String voice = "мяу-мяу";
        return voice;
    }
}
