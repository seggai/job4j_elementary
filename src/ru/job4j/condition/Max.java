package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean dif = left < right;
        int result = dif ? right : left;
        return result;
    }
}
