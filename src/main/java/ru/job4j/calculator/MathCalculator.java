package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));

            int one = 4;
            int two = 2;
            int oneMinusTwo = one - two;
            System.out.println(oneMinusTwo);
            int ten = 10;
            int five = 5;
            int tenDivFive = ten / five;
            System.out.println(tenDivFive);
    }
}

