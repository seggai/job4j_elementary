package ru.job4j.array;

/**
 * Class SortSelected for sort the array in ascending order
 * @author Yuri.Argunov
 * @version 1
 * @since 09.04.2020
 */
public class SortSelected {
    /**
     * Method sort for sort the array in ascending order
     * @param data - input array
     * @return data - sorted array
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
         int min = MinDiapason.findMin(data, i, data.length - 1);
         int index = FindLoop.indexOf(data, min, i, data.length - 1);
             data[index] = data[i];
             data[i] = min;
        }
        return data;
    }
}
