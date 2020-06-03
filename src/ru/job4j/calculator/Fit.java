package ru.job4j.calculator;

/**
 * Class Fit for calculate ideal human weight
 * @author Yuri.Argunov
 * @version 1
 * @since 19.03.2020
 */
public class Fit {
    /**
     * Method manWeight for calculate ideal man weight
     * @param height - height of man
     * @return rsl - ideal weight
     */
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    /**
     * Method womanWeight for calculate ideal woman weight
     * @param height - height of woman
     * @return rsl - ideal weight
     */
    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
}
