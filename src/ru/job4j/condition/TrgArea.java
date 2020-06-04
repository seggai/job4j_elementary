package ru.job4j.condition;

/**
 * Class TrgArea to calculate square of triangle
 * @author Yuri.Argunov
 * @version 1
 * @since 19.03.2020
 */
public class TrgArea {
    /**
     * Method area to calculate square of triangle
     * @param a - side length
     * @param b - side length
     * @param c - side length
     * @return rsl3 - square
     */
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl3 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl3;
    }

    /**
     * Method main
     * @param args args
     */
    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
