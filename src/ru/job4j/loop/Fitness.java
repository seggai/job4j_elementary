package ru.job4j.loop;

/**
 * Class Fitness to calculate month fitness work
 * @author Yuri.Argunov
 * @version 1
 * @since 26.03.2020
 */
public class Fitness {
    /**
     * Method calc to calculate month fitness work
     * @param ivan - iven work
     * @param nik - nik work
     * @return month - month of work
     */
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
