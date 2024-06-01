package ru.job4j.oop;

public class Cat {
    public static void main(String[] args) {
        Cat pappy = new Cat();
        Cat sparky = new Cat();
        String say = pappy.sound();
        System.out.println("Pappy say " + say);
    }
    public String sound() {
        String voice = "мяу-мяу";
        return voice;
    }
}
