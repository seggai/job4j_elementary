package ru.job4j.condition;

/**
 * Class StringEq to compare two variables
 * @author Yuri.Argunov
 * @version 1
 * @since 20.03.2020
 */
public class StringEq {
    /**
     * Method check to compare two variables
     * @param login - variable
     * @return access - logic answer
     */
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }

    /**
     * Method  main to compare two variables
     * @param args args
     */
    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}
