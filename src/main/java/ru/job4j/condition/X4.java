package ru.job4j.condition;

public class X4 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int result2 = X4.calc(a, b, c, x);
        System.out.println(result2);
    }
}
