package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 1; row < size + 1; row++) {
            for (int cell = 1; cell < size + 1; cell++) {
                boolean left = (cell == row || row + cell - 1 == size);
                boolean right = (cell == row || row + cell - 1 == size);
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
