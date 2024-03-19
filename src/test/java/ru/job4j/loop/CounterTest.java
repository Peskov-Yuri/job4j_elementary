package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    void sumNumbers1() {
        int expected = 11;
        int result = Counter.sum(0, 10);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers2() {
        int expected = 6;
        int result = Counter.sum(3, 8);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers3() {
        int expected = 1;
        int result = Counter.sum(1, 1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers4() {
        int expected = 19;
        int result = Counter.sum(4, 22);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers5() {
        int expected = 9;
        int result = Counter.sum(1, 9);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers6() {
        int expected = 13;
        int result = Counter.sum(3, 15);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers7() {
        int expected = 0;
        int result = Counter.sum(10, 2);
        assertThat(result).isEqualTo(expected);
    }
}