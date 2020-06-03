package ru.job4j.condition;

/**
 * Class AlertDivByZero for checking that current number it is not null
 * @author Yuri.Argunov
 * @version 1
 * @since 19.03.2020
 */
public class AlertDivByZero {
    /**
     * Method main
     * @param args args
     */
    public static void main(String[] args) {
        possibleDiv(-1);
        possibleDiv(0);
    }
    /**
     * Method possibleDiv for checking that current number it is not null
     * @param number - input number
     */
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
