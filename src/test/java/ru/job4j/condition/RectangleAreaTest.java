package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import ru.job4j.condition.RectangleArea;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when50K13Square41Dop45() {
        double expected = 41.45;
        int p = 50;
        double k = 13;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP321K53Square468Dop2() {
        double expected = 468.2;
        int p = 321;
        double k = 53;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}