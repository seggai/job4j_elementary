package ru.job4j.array;

/**
 * Class AlgoArray for sorted current array by order
 * @author Yuri.Argunov
 * @version 1
 * @since 06.04.2020
 */
public class AlgoArray {
    /**
     * Method main for sorted current array by order
     * @param args args
     */
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        temp = array[4];
        array[4] = array[3];
        array[3] = temp;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
