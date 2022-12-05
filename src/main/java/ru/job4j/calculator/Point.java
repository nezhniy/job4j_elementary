package ru.job4j.calculator;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result1 = x2 - x1;
        double result2 = y2 - y1;
        double rsl = Math.pow(result1, 2) - Math.pow(result2, 2);
        return Math.sqrt(rsl);
    }

    public static void main(String[] args) {
        double result = Point.distance(10, 10, 30, 20);
        System.out.println("result (10, 10) to (30, 20) = " + result);
    }
}
