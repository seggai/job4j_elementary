package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int count = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[count];
            array[count] = temp;
            count--;
            if (count <= i) {
                break;
            }
        }
        return array;
    }
}
