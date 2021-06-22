package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if(x1 > -1 && x1 < 8 && x2 > -1 && x2 < 8 && y1 > -1 && y1 < 8 && y2 > -1 && y2 < 8) {
            if((Math.abs(x2 - x1) == Math.abs(y2 - y1))) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;

    }
}
