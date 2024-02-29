package ru.job4j.calculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class FitTest {

    @Test
    void whenMan180Then100() {
        short input = 187;
        double expected = 100.05;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman168Then66() {
        short input = 168;
        double expected = 66.69999999999999;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
