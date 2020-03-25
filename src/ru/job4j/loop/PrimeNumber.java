package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = finish; i >= 1; i--) {
            for (int j = i - 1; j >= 1; j--) {
                if (j == 1) {
                    count++;
                } else {
                    if (i % j == 0) {
                        break;
                    }
                }
            }
        }
        return count;
    }
}
