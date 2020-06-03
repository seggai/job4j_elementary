package ru.job4j.array;

/**
 * Class Min for searching minimal element in current array
 * @author Yuri.Argunov
 * @version 1
 * @since 08.04.2020
 */
public class Min {
    /**
     * Method findMin for searching minimal element in current array
     * @param array - input array
     * @return min - minimal element in current array
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
