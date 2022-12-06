package ru.job4j.calculator;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) - Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(10, 10, 30, 20);
        System.out.println("result (10, 10) to (30, 20) = " + result);
    }
}
