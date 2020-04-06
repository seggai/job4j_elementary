package ru.job4j.converter;

/**
 * Class Converter for currency conversion
 * @author Yuri Argunov
 * @since 06.04.2020
 * @version 1
 */
public class Converter {
    /**
     * Method rubleToEuro
     * @param value - count of rubles
     * @return rsl - count of euro
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Method rubleToDollar
     * @param value - count of rubles
     * @return rsl - count of dollars
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int inE = 180;
        int expected1 = 3;
        int outE = rubleToDollar(inE);
        boolean passed1 = expected1 == outE;
        System.out.println("180 rubles are 3. Test result :" + passed1);
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars");
    }
}
