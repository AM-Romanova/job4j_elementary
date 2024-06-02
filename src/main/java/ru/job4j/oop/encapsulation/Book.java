package ru.job4j.oop.encapsulation;

public class Book {
    private String name;
    private int village;

    public Book (String name, int village) {
        this.name = name;
        this.village = village;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getVillage() {
        return village;
    }
    public void setVillage(int village) {
        this.village = village;
    }
}
