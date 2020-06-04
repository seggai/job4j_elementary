package ru.job4j.array;

/**
 * Class Check for checking that array has the same elements
 * @author Yuri.Argunov
 * @version 1
 * @since 07.04.2020
 */
public class Check {
    /**
     * Method mono for checking that array has the same elements
     * @param data - input array
     * @return result - logic answer
     */
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
