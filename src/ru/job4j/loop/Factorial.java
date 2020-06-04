package ru.job4j.loop;

/**
 * Class Factorial to calculate factorial of given number
 * @author Yuri.Argunov
 * @version 1
 * @since 25.03.2020
 */
public class Factorial {
    /**
     * Method calc to calculate factorial of given number
     * @param n - number
     * @return result - factorial of number
     */
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
            }
        return result;
        }
  }
