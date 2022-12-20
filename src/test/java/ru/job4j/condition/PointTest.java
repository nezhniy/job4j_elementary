package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when101to10then9dot05() {
        double expected = 9.05;
        Point a = new Point(10, 1);
        Point b = new Point(1, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when101to50then5dot09() {
        double expected = 5.09;
        Point a = new Point(10, 1);
        Point b = new Point(5, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when82to124then4dot47() {
        double expected = 4.47;
        Point a = new Point(8, 2);
        Point b = new Point(12, 4);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when82to124to98then3dot46() {
        double expected = 4.58;
        int x1 = 8;
        int y1 = 2;
        int x2 = 12;
        int y2 = 4;
        int z1 = 9;
        int z2 = 8;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}