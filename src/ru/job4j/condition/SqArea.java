package ru.job4j.condition;

/**
 * Class SqArea to calculate square of triangle
 * @author Yuri.Argunov
 * @version 1
 * @since 19.03.2020
 */
public class SqArea {
    /**
     * Method square to calculate square of triangle
     * @param p - perimetr of triangle
     * @param k - coefficient
     * @return rsl1 - square
     */
    public static double square(int p, int k) {
        double rsl1 = Math.pow(p / (2.0 * (k + 1.0)), 2) * k;
        return rsl1;
    }
}
