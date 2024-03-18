package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    void sumNumbers1() {
        int sum = 1;
        int start = 1;
        int finish = 1;
        int expected = 16;
        int result = Counter.sum(0, 10);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers2() {
        int sum = 1;
        int start = 1;
        int finish = 1;
        int expected = 16;
        int result = Counter.sum(3, 8);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers3() {
        int sum = 1;
        int start = 1;
        int finish = 1;
        int expected = 16;
        int result = Counter.sum(1, 1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers4() {
        int sum = 1;
        int start = 1;
        int finish = 1;
        int expected = 16;
        int result = Counter.sum(4, 22);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers5() {
        int sum = 1;
        int start = 1;
        int finish = 1;
        int expected = 16;
        int result = Counter.sum(1, 9);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers6() {
        int sum = 1;
        int start = 1;
        int finish = 1;
        int expected = 16;
        int result = Counter.sum(3, 15);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumNumbers7() {
        int sum = 1;
        int start = 1;
        int finish = 1;
        int expected = 16;
        int result = Counter.sum(10, 2);
        assertThat(result).isEqualTo(expected);
    }
}