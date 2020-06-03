package ru.job4j.array;

/**
 * Class SwitchArray for swap of given elements in array
 * @author Yuri.Argunov
 * @version 1
 * @since 07.04.2020
 */
public class SwitchArray {
    /**
     * Method swap for swap of given elements in array
     * @param array - input array
     * @param source - first element
     * @param dest - second element
     * @return array - completed array
     */
    public static int[] swap(int[] array, int source, int dest) {
        int x = array[source];
        array[source] = array[dest];
        array[dest] = x;
        return array;
    }

    /**
     * Method swapBorder for swap first and last elements of array
     * @param array - input array
     * @return
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
}
