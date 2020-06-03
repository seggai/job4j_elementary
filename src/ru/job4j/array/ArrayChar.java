package ru.job4j.array;

/**
 * Class ArrayChar for checking that array starts with current prefix
 * @author Yuri.Argunov
 * @version 1
 * @since 07.04.2020
 */
public class ArrayChar {
    /**
     * Method starts With for checking that array starts with current prefix
     * @param word - array
     * @param pref - array with prefix
     * @return result - answer that true or false
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
