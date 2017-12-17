package ru.job4j.max.maxMain;

public class Max {


    public int max (int first, int second) {

        int result = (first > second) ? first : second;
        return result;

    }

    public int max (int first, int second, int third) {
        Max maxtwo = new Max();
        return Math.max(third,maxtwo.max(first, second));
    }
}
