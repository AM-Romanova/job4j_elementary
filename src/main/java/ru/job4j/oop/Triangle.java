package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        double itog = (a + b + c) / 2;
        return itog;
    }

    public boolean exist(double ab, double ac, double bc) {
        boolean result = (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
        return result;
    }

    public double area() {
        double result1 = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = semiPerimeter(a, b, c);
        if (this.exist(a, b, c)) {
            result1 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return result1;
    }
}