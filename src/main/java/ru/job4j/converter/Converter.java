package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 80;
    }

    public static void main(String[] args) {
            float input = 560;
            float expected = 8;
            float output = Converter.rubleToEuro(input);
            boolean passed = expected == output;
            System.out.println("560 rubles are 8 euros. Test result : " + passed);
            input = 560;
            expected = 7;
            output = Converter.rubleToDollar(input);
            passed = expected == output;
            System.out.println("560 rubles are 7 dollars. Test result : " + passed);
    }
}