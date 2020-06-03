package ru.job4j.array;

/**
 * Class Matrix for creating of multiplication table
 * @author Yuri.Argunov
 * @version 1
 * @since 09.04.2020
 */
public class Matrix {
    /**
     * Method multiple for creating of multiplication table
     * @param size - size of our table
     * @return table - completed table
     */
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
