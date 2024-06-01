package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox jukebox1 = new Jukebox();
        Jukebox jukebox2 = new Jukebox();
        Jukebox jukebox3 = new Jukebox();
        jukebox1.music(1);
        jukebox2.music(2);
        jukebox3.music(3);
    }
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }

        else if (position == 2) {
            System.out.println("Спокойной ночи");
        }

        else {
            System.out.println("Песня не найдена");
        }
    }
}
