package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] prefix) {
            boolean match = true;
            for (int i = 0; i < prefix.length; i++) {
                if (prefix[i] != word[i]) {
                    match = false;
                    break;
                }
            }
            return match;
    }

    public static void main(String[] args) {
        char[] word = new char[]{'З', 'д', 'р', 'а', 'в', 'с', 'т', 'в', 'у', 'й', 'т', 'е'};
        char[] prefix = new char[]{'З', 'д', 'р', 'а', 'в'};
        System.out.println(startsWith(word, prefix));
    }
}