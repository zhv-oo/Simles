package ru.my.examples.chapterone;

public class Exthree {
    public int scalarSumVector(int min, int max, int size) {
        int res = 0;
        int[] a = Library.generateArray(min, max, size);
        int[] b = Library.generateArray(min, max, size);
        for (int i = 0; i < size; i++) {
            res += a[i] * b[i];
        }
        return res;
    }
}
