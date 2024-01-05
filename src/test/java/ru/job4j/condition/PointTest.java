package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import ru.job4j.condition.Point;
class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3465to2054then17Dop8() {
        double expected = 17.8;
        int x1 = 34;
        int y1 = 65;
        int x2 = 20;
        int y2 = 54;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when6minus5to45then10Dop2() {
        double expected = 10.2;
        int x1 = 6;
        int y1 = -5;
        int x2 = 4;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}