package ru.job4j.oop.encapsulation;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alexia");
        student.setGroup("Programmer Java");
        student.setDate(2024);

        System.out.println(student.getName() + ", " + student.getGroup() + ", " + student.getDate());
    }
}
