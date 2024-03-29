package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import ru.job4j.condition.Max;

class MaxTest {
    @Test
    void whenMax54To43Then54() {
        int left = 54;
        int right = 43;
        int result = Max.max(left, right);
        int expected = 54;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To6Then6() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}