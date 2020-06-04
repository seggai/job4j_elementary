package ru.job4j.calculator;

/**
 * Class Calculator for calculate integer numbers
 * @author Yuri.Argunov
 * @version 1
 * @since 14.03.2020
 */
public class Calculator {
    /**
     * Method main for calculate integer numbers
     * @param args args
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        int four = 4;
        int five = 5;
        int six = 6;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
