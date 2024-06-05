package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0, addmoney = money - price;
        for (int coin : coins) {
                while (addmoney >= coin) {
                    result[size++] = coin;
                    addmoney -= coin;
                }
            }
            return Arrays.copyOf(result, size);
        }
    }