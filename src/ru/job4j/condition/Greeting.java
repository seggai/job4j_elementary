package ru.job4j.condition;

/**
 * Class Greeting for default string output
 * @author Yuri.Argunov
 * @version 1
 * @since 16.03.2020
 */
public class Greeting {
    /**
     * Method main for default string output
     * @param args args
     */
    public static void main(String[] args) {
        String idea = "I like Java";
        System.out.println(idea);
        idea = idea + " But i'm newbie ";
        int year = 2020;
        idea = idea + year;
        System.out.println(idea);
    }
}
