package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurn2() {
        Turn turner = new Turn();
        int[] input = new int[] {5, 9, 3, 6, 1};
        int[] result = turner.back(input);
        int[] expect = new int[] {1, 6, 3, 9, 5};
        assertThat(result, is(expect));
    }
}
