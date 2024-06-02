package ru.job4j.oop.encapsulation;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 145);
        Book book2 = new Book("Hobbits", 1086);
        Book book3 = new Book("It", 674);
        Book book4 = new Book("Cat Gav", 13);
        Book books[] = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ", " + book.getVillage());
        }
        System.out.println("Replace Code Clean to It");
        Book temp = new Book("temp", 0);
        temp = books[0];
        books[0] = books[2];
        books[2] = temp;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ", " + book.getVillage());
        }

        System.out.println("Вывести на экран Clean Code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName() + ", " + book.getVillage());
            }
        }
    }
}
