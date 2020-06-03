package ru.job4j.array;

/**
 * Class MatrixCheck for checking win combination in two-dimensional array
 * @author Yuri.Argunov
 * @version 1
 * @since 09.04.2020
 */
public class MatrixCheck {
    /**
     * Method monoHorizontal for checking that given row is monotonous
     * @param board - input array
     * @param row - given row
     * @return result - logic answer
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
            }
        }
            return result;
    }

    /**
     * Method monoVertical for checking that given column is monotonous
     * @param board - input array
     * @param column - given column
     * @return result - logic answer
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Method extractDiagonal for creating new array which contains diagonal of current array
     * @param board - input array
     * @return rsl - array with diagonal
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Method isWin for checking win combination in two-dimensional array
     * @param board - input array
     * @return result - logic answer
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if ((board[i][i] == 'X') && ((monoHorizontal(board, i) || monoVertical(board, i)))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
