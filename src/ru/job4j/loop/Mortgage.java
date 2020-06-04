package ru.job4j.loop;

/**
 * Class Mortgage to calculate years of mortgage
 * @author Yuri.Argunov
 * @version 1
 * @since 26.03.2020
 */
public class Mortgage {
    /**
     * Method year to calculate years of mortgage
     * @param amount - amount of mortgage
     * @param salary - your salary
     * @param percent - percent of mortgage
     * @return - sum of years
     */
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = amount * percent * 0.01 + amount;
        while (debt > 0) {
            debt = debt - salary;
            year++;
        }
        return year;
    }
}
