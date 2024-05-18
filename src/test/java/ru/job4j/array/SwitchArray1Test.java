package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
public class SwitchArray1Test {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] result = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(result).containsExactly(expected);
    }
    @Test
    public void whenSwap1to2() {
        public void whenSwap1to3() {
            int[] input = {1, 2, 3, 4};
            int[] expect = {1, 4, 3, 2};
            int[] rsl = SwitchArray.swap(input,1, input.length -1);
            assertThat(result).containsExactly(expected);
        }
        @Test
        public void whenSwap2to3() {
            int[] input = {1, 2, 3, 4};
            int[] expected = {1, 2, 4, 3};
            int[] rsl = SwitchArray.swap(input, 2, input.length -1);
            assertThat(result).containsExactly(expected);
        }
    }