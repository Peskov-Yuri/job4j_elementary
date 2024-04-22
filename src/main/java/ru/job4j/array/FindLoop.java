package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] date = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 8, 10, 11, 12, 13, 14, 15};
        System.out.println(indexOf(date, 10));
    }
}
