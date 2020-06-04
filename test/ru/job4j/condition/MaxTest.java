package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.maxNumber(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void  whenMax1To2Then1() {
        int result = Max.maxNumber(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1equal2() {
        int result = Max.maxNumber(2, 2);
        assertThat(result, is(2));
    }
}
