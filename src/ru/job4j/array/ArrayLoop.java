package ru.job4j.array;

/**
 * Class ArrayLoop for outputing array using loop for
 * @author Yuri.Argunov
 * @version 1
 * @since 06.04.2020
 */
public class ArrayLoop {
    /**
     * Method main for outputing array using loop for
     * @param args args
     */
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 3;
        }
        for (int a: array) {
            System.out.println(a);
        }
        }
    }

