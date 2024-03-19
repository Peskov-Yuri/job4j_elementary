package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + 2;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (0 == (i % 2)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(-1, -10));

        System.out.println(sumByEven(1, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
        System.out.println(sumByEven(-1, -10));
    }
}