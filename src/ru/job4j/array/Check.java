package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            boolean x = data[0];
            if (x != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
