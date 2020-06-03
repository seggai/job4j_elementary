package ru.job4j.array;

/**
 * Class Defragment for moving empty cells to the end of array
 * @author Yuri.Argunov
 * @version 1
 * @since 09.04.2020
 */
public class Defragment {
    /**
     * Method compress for moving empty cells to the end of array
     * @param array - input array
     * @return array - completed array
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (point < array.length - 1) {
                    point++;
                    if (array[point] != null) {
                        array[index] = array[point];
                        array[point] = null;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}
