package ru.job4j.loop;

/**
 * Class PrimeNumber to calculate count of prime numbers
 * @author Yuri.Argunov
 * @version 1
 * @since 26.03.2020
 */
public class PrimeNumber {
    /**
     * Method calc to calculate count of prime numbers
     * @param finish - last number
     * @return count - count of numbers
     */
    public int calc(int finish) {
        int count = 0;
        for (int i = finish; i >= 1; i--) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
