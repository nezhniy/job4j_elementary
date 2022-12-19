package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when101to10then8dot94() {
        double expected = 8.94;
        int x1 = 10;
        int y1 = 1;
        int x2 = 1;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when101to50then4dot89() {
        double expected = 4.89;
        int x1 = 10;
        int y1 = 1;
        int x2 = 5;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when82to124then3dot46() {
        double expected = 3.46;
        int x1 = 8;
        int y1 = 2;
        int x2 = 12;
        int y2 = 4;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}