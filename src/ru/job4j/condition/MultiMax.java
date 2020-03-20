package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean can = first >= second;
        int result = can ? first : second;
        can = result >= third;
        result = can ? result : third;
        return result;
    }
}
