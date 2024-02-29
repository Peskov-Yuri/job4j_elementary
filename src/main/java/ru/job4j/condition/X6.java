package ru.job4j.condition;

public class X6 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;

    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int result4 = X6.calc(a, b, c, x);
        System.out.println(result4);
    }
}
