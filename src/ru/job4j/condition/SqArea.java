package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl1 = Math.pow(p / (2.0 * (k + 1.0)), 2) * k;
        return rsl1;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result12 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result12);
    }
}
