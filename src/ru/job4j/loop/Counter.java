package ru.job4j.loop;

/**
 * Class Counter for counting the sum of consecutive numbers
 * @author Yuri.Argunov
 * @version 1
 * @since 23.03.2020
 */
public class Counter {
    /**
     * Method sum for counting the sum of consecutive numbers
     * @param start - starting number
     * @param finish - finishing number
     * @return sum - sum
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Method sumByEven for counting the sum of consecutive even numbers
     * @param start - starting number
     * @param finish - - finishing number
     * @return sum - sum
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /**
     * Method main main
     * @param args args
     */
    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(-10, 10));
    }
}
