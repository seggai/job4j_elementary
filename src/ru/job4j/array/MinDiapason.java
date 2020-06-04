package ru.job4j.array;

/**
 * Class MinDiapason for searching minimal element of current array in a given diapason
 * @author Yuri.Argunov
 * @version 1
 * @since 08.04.2020
 */
public class MinDiapason {
    /**
     * Method findMin for searching minimal element of current array in a given diapason
     * @param array - input array
     * @param start - start of diapason
     * @param finish - end of diapason
     * @return min - minimal element
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i < finish + 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
