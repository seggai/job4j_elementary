package ru.job4j.array;

public class EndsWith {
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
