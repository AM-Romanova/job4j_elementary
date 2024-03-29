package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class Counter1Test {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter1.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusFourToFiveThenTwentyFour() {
        int start = -4;
        int finish = 10;
        int result = Counter1.sumByEven(start, finish);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }
}