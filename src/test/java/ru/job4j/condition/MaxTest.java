package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax199To23Then199() {
        int left = 199;
        int right = 23;
        int result = Max.max(left, right);
        int expected = 199;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax109To109Then109() {
        int left = 109;
        int right = 109;
        int result = Max.max(left, right);
        int expected = 109;
        assertThat(result).isEqualTo(expected);
    }
}