package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    void whenExist() {
        double ab = 4.0;
        double ac = 4.0;
        double bc = 4.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
        assertThat(true).isTrue();
        assertThat(Boolean.TRUE).isTrue();
        assertThat(false).isFalse();
        assertThat(Boolean.FALSE).isFalse();
    }
}
