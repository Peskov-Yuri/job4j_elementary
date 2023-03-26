package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I Like Java";
        String lyrics = "But I am a newbie.";
        idea += "But I am a newbie.";
        int year = 2023;
        String id = idea + lyrics + year;
        System.out.println(id);
    }
}