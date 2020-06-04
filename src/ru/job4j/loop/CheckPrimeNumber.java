package ru.job4j.loop;

/**
 * Class CheckPrimeNumber for checking existence prime number
 * @author Yuri.Argunov
 * @version 1
 * @since 26.03.2020
 */
public class CheckPrimeNumber {
    /**
     * Method check for checking existence prime number
     * @param num - our number
     * @return rsl - logic answer
     */
    public static boolean check(int num) {
        boolean rsl = num > 1;
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
        }
}
