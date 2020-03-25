package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean rsl = false;
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                rsl = false;
                break;
            }
            rsl = true;
        }
        return rsl;
        }
}
