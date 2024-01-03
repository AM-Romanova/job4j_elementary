package ru.job4j.calculator;

public class Fit {
    public static double manWeight(int height) {
        double result1 = (height - 100) * 1.15;
        return result1;
    }
    public static double womanWeight(int height) {
        double result1 = (height - 110) * 1.15;
        return result1;
    }
    public static void main(String[] args) {
        double man = Fit.manWeight(100);
        double woman = Fit.womanWeight(100);
        double man1 = Fit.manWeight(170);
        double woman1 = Fit.womanWeight(170);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 100 is "+ woman);
        System.out.println("Man 170 is " + man1);
        System.out.println("Woman 170 is " + woman1);
    }
}
