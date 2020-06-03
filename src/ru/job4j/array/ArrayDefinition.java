package ru.job4j.array;

/**
 * Class ArrayDefinition for definition of array
 * @author Yuri.Argunov
 * @version 1
 * @since 06.04.2020
 */
public class ArrayDefinition {
    /**
     * Method main for definition of array
     * @param args args
     */
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] pieces = new float[40];
        String[] names = new String[4];
        names[0] = "One";
        names[1] = "Two";
        names[2] = "Three";
        names[3] = "Four";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
