package ru.job4j.loop;

/**
 * Class Slash for drawing the cross of given size
 * @author Yuri.Argunov
 * @version 1
 * @since 09.04.2020
 */
public class Slash {
    /**
     * Method draw for drawing the cross of given size
     * @param size - size of cross
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (row == cell);
                 boolean right = ((row + cell) % 2 == 0) && (row + cell == size - 1);
                if (left || right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Method main to print our cross
     * @param args args
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
