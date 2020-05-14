package ru.job4j.array;
 /**
 * Class Merge for union of two sorted arrays
 * @author Yuri.Argunov
 * @since 14.05.20
 * @version 1
 */

public class Merge {
    /**
     * Method merge - method has realizes merging two arrays by order
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
           return ifOneIsEmpty(left, right);
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

}
