package ru.job4j.array;

/**
 * Class Square for creating array of specified length and filling that array with square numbers
 * @author Yuri.Argunov
 * @version 1
 * @since 06.04.2020
 */
public class Square {
    /**
     * Method calculate for creating array of specified length and filling that array with square numbers
     * @param bound - length of array
     * @return rst - completed array
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        return rst;
    }
}
