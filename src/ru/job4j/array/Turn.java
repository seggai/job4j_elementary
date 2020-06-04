package ru.job4j.array;

/**
 * Class Turn for turn all elements in reverse order in current array
 * @author Yuri.Argunov
 * @version 1
 * @since 08.04.2020
 */
public class Turn {
    /**
     * Method Turn for turn all elements in reverse order in current array
     * @param array - input array
     * @return array - completed array
     */
    public static int[] back(int[] array) {
        int end = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[end];
            array[end] = temp;
            end--;
        }
        return array;
    }
}
