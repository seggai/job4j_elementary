package ru.job4j.loop;

public class CheckPrimeNumber {
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
