package ru.job4j.converter;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.job4j.condition.X2;
import ru.job4j.condition.X3;
import ru.job4j.condition.X4;
import ru.job4j.condition.X5;
import ru.job4j.condition.X6;
public class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

        @Test void whenA1B1C1X1Then3() {
            int a = 1;
            int b = 1;
            int c = 1;
            int x = 1;
            int expected1 = 3;
            int result1 = X3.calc(a, b, c, x);
            assertThat(result1).isEqualTo(expected1);
        }

        @Test void whenA0B1C1X1Then2() {
            int a = 0;
            int b = 1;
            int c = 1;
            int x = 1;
            int expected2 = 2;
            int result2 = X4.calc(a, b, c, x);
            assertThat(result2).isEqualTo(expected2);
        }

        @Test void whenA1B1C0X1Then2() {
            int a = 0;
            int b = 1;
            int c = 1;
            int x = 1;
            int expected3 = 2;
            int result3 = X5.calc(a, b, c, x);
            assertThat(result3).isEqualTo(expected3);
        }

        @Test void whenA1B1C1X0Then1() {
            int a = 1;
            int b = 1;
            int c = 1;
            int x = 0;
            int expected4 = 1;
            int result4 = X6.calc(a, b, c, x);
            assertThat(result4).isEqualTo(expected4);
        }
    }