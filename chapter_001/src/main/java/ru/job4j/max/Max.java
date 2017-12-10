package ru.job4j.max;

public class Max {


    public int max (int first, int second) {

        int result = (first > second) ? first : second;
        return result;

    }

    public int max (int first, int second, int third) {
        Max maxtwo = new Max();
        int resultTwo = Math.max(third,maxtwo.max(first, second));
        return resultTwo;
    }
}
