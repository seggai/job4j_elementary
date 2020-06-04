package ru.job4j.condition;

/**
 * Class MultiMax to find maximum number using ternary operator
 * @author Yuri.Argunov
 * @version 1
 * @since 21.03.2020
 */
public class MultiMax {
    /**
     * Method max to find maximum number using ternary operator
     * @param first - first number
     * @param second - second number
     * @param third - third number
     * @return result - maximum number
     */
    public int max(int first, int second, int third) {
        boolean can = first >= second;
        int result = can ? first : second;
        can = result >= third;
        result = can ? result : third;
        return result;
    }
}
