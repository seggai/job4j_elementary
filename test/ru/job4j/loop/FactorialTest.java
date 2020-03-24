package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenFactorialFrom5() {
        int our = Factorial.calc(5);
        int expected = 120;
        assertThat(expected, is(120));
    }
    @Test
    public void whenFactorialFrom0() {
        int our = Factorial.calc(0);
        int expected = 1;
        assertThat(expected, is(1));
    }
}
