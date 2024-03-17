package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String nameOfDay;

        switch (day) {
            case 1:
                nameOfDay = "Понедельник";
                break;
            case 2:
                nameOfDay = "Вторник";
                break;
            case 3:
                nameOfDay = "Среда";
                break;
            case 4:
                nameOfDay = "Четверг";
                break;
            case 5:
                nameOfDay = "Пятница";
                break;
            case 6:
                nameOfDay = "Суббота";
                break;
            case 7:
                nameOfDay = "Воскресенье";
                break;
            default:
                nameOfDay = "Нет такого дня недели";
        }
        return nameOfDay;
    }

    public static void main(String[] args) {
        String result = SwitchWeek.nameOfDay(5);
        System.out.println(result);
    }
}
