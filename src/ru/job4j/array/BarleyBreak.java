package ru.job4j.array;

/**
 * Class BarleyBreak for definition of two-dimensional array
 * @author Yuri.Argunov
 * @version 1
 * @since 09.04.2020
 */
public class BarleyBreak {
    /**
     * Method main for definition of two-dimensional array
     * @param args args
     */
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[1][1] = 1;
        array[1][2] = 2;
        array[1][3] = 3;
        array[2][1] = 4;
        array[2][2] = 5;
        array[2][3] = 6;
        array[3][1] = 7;
        array[3][2] = 8;
        array[3][3] = 9;
    }
}
