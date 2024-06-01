package ru.job4j.oop;

public class DummyDic {
    public static void main(String[] args) {
        DummyDic dummy1 = new DummyDic();
        String eng = dummy1.engToRus();
        System.out.println("Неизвестное слово " + eng);
    }

    public String engToRus() {
        String end = "eng";
        return end;
    }
}
