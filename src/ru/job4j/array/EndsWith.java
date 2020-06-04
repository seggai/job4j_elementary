package ru.job4j.array;

/**
 * Class EndsWith for checking that array ends with current prefix
 * @author Yuri.Argunov
 * @version 1
 * @since 07.04.2020
 */
public class EndsWith {
    /**
     * Method endsWith for checking that array ends with current prefix
     * @param word - input array
     * @param post - input prefix
     * @return result - logic answer
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int j = post.length - 1;
        for (int i = word.length - 1; i > word.length - post.length - 1; i--) {
            if (word[i] != post[j]) {
                result = false;
                break;
            }
            j--;
        }
        return result;
    }
}
