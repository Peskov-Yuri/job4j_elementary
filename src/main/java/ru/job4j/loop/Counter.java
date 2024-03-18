package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 1;
        for (start = 1; start <= 15; start++) {
            sum = sum + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(4, 22));
        System.out.println(sum(1, 9));
        System.out.println(sum(3, 15));
        System.out.println(sum(10, 2));
    }
}
