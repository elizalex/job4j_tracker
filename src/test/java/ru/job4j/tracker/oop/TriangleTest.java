package ru.job4j.tracker.oop;

import static org.hamcrest.Matchers.closeTo;


import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void area() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        MatcherAssert.assertThat(rsl, closeTo(8, 0.001));
    }
}