package ru.job4j.array;
 /**
 * Class Merge for union of two sorted arrays
 * @author Yuri.Argunov
 * @since 14.05.20
 * @version 1
 */

import java.util.Arrays;

public class Merge {
    /**
     * Method merge
     * @param left - first array
     * @param right - second array
     * @return rsl - completed sorted array
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        int i = 0;
        int j = 0;
        int stopLeft = 0;
        int stopRight = 0;
        if ((left.length == 0) || (right.length == 0)) {
           rsl = ifOneIsEmpty(left, right);
        } else {
            while (count < rsl.length) {
                if ((left[i] < right[j]) && (stopLeft == 0)) {
                    rsl[count] = left[i];
                    count++;
                    if (i < left.length - 1) {
                        i++;
                    } else {
                        stopLeft = 1;
                    }
                } else {
                    rsl[count] = right[j];
                    count++;
                    if ((j < right.length - 1) && (stopRight == 0)) {
                        j++;
                    } else {
                        stopRight = 1;
                    }
                }
            }
        }
        return rsl;
    }

    /**
     * Method ifOneIsEmpty for cases when one of arrays is empty
     * @param left - first array
     * @param right - second array
     * @return rsl - completed sorted array
     */
    public int[] ifOneIsEmpty(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0) {
            rsl = right;
        } else {
            rsl = left;
        }
        return rsl;
}

    /**
     * Main
     * @param args args
     */
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
