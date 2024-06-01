package ru.job4j.oop;

public class Error {
    public static void main(String[] args) {
        Error error = new Error(true, 6, "ACTIVE");
        error.printInfo();
    }

    private void printInfo() {
        System.out.println("Ошибка: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    private boolean active;
    private int status;
    private String message;

    public Error (boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }
}
