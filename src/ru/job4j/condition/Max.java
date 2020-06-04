package ru.job4j.condition;

/**
 * Class Max for explains basic functions of ternary operator
 * @author Yuri.Argunov
 * @version 1
 * @since 20.03.2020
 */
public class Max {
    /**
     * Method max for explains basic functions of ternary operator
     * @param left - first number
     * @param right - second number
     * @return result - max number
     */
    public static int maxNumber(int left, int right) {
        boolean dif = left < right;
        int result = dif ? right : left;
        return result;
    }
}
