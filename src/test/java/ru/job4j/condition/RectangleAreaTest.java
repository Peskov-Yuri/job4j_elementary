package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP7K9Square1dot10() {
        double expected = 1.10;
        double p = 7;
        double k = 9;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP11K3Square5dot67() {
        double expected = 5.67;
        double p = 11;
        double k = 3;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}

