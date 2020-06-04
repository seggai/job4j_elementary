package ru.job4j.condition;

/**
 * Class Point to calculate distance between points
 * @author Yuri.Argunov
 * @version 1
 * @since 19.03.2020
 */
public class Point {
    /**
     * Method distance to calculate distance between points
     * @param x1 - x coordinate of first point
     * @param y1 - y coordinate of first point
     * @param x2 - x coordinate of second point
     * @param y2 - y coordinate of second point
     * @return rsl2 - distance
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl2;
    }
}
