package ru.job4j.array;

/**
 * Class FindLoop for searching of index of cell which contains given element
 * @author Yuri.Argunov
 * @version 1
 * @since 09.04.2020
 */
public class FindLoop {
    /**
     * Method indexOf for searching of index of cell which contains given element
     * @param data - input array
     * @param el - given element
     * @return rst - index of given element
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     * Method indexOf for searching of index of cell which contains given element in a certain range
     * @param data - input array
     * @param el - given element
     * @param start - start of our range
     * @param finish - end of our range
     * @return rst - index of given element
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i < finish + 1; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
