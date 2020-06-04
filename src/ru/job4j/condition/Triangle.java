package ru.job4j.condition;

/**
 * Class Triangle to check existence of triangle
 * @author Yuri.Argunov
 * @version 1
 * @since 20.03.2020
 */
public class Triangle {
    /**
     * Method exist to check existence of triangle
     * @param ab - first side
     * @param ac - second side
     * @param bc - third side
     * @return - logic answer
     */
    public static boolean exist(double ab, double ac, double bc) {
        boolean result = ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
        return result;
    }
}
