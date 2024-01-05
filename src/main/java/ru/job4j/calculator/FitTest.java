package ru.job4j.calculator;

public class FitTest {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 180;
        short height1 = 160;
        double man = Fit.manWeight(height);
        System.out.println("Man 180 is " + man);
        double woman = Fit.womanWeight(height1);
        System.out.println("Woman 160 is " + woman);
    }

}