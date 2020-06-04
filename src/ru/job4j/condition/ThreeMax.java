package ru.job4j.condition;

/**
 * Class ThreeMax to find maximum of three numbers
 * @author Yuri.Argunov
 * @version 1
 * @since 21.03.2020
 */
public class ThreeMax {
    /**
     * Method max to find maximum of three numbers
     * @param first - first number
     * @param second - second number
     * @param third - third number
     * @return result - maximum number
     */
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        return result;
    }
}
