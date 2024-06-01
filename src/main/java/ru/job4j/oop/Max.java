package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }
    public static int max (int first, int second){
        return first > second ? first : second;
    }
    public static int max1 ( int one, int two) {
        int result = one >= two ? one : two;
        return result;
    }
    public static int max ( int first, int second, int third){
        return max(first, max(second, third));
    }
    public static int max2 ( int one, int two) {
        int result = one <= two ? two : one;
        return result;
    }
    public static int max ( int first, int second, int third, int fourth){
        return max(first, max(second, third, fourth));
    }
    public static int max3 ( int one, int two){
        int result = one >= two ? one : two;
        return result;
    }
}

