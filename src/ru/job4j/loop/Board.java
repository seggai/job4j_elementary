package ru.job4j.loop;

/**
 * Class Board to create chess board
 * @author Yuri.Argunov
 * @version 1
 * @since 25.03.2020
 */
public class Board {
    /**
     * Method paint to create chess board
     * @param width - width of board
     * @param height - height of board
     */
    public static void paint(int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Method main to draw out board
     * @param args args
     */
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
