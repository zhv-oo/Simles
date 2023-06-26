package ru.my.examples.chapterone;

public class Extwos {
    public int maxRandBlock(int min, int max, int arraySize) {
        int[] a = Library.generateArray(min, max, arraySize);
        int[] b = Library.generateArray(min, max, arraySize);
        int[] c = Library.generateArray(min, max, arraySize);
        int maxBlock = 0;
        for (int i = 0; i < arraySize - 1; i++) {
            int tmp = a[i] * b[i] * c[i];
            if (tmp > maxBlock) {
                maxBlock = tmp;
            }
        }
        return maxBlock;
    }

    public int maxRandBlock(int[] arrayOne, int[] arrayTwo, int[] arrayThree, int arraySize) {
        int maxBlock = 0;
        for (int i = 0; i < arraySize; i++) {
            int tmp = arrayOne[i] * arrayTwo[i] * arrayThree[i];
            if (tmp > maxBlock) {
                maxBlock = tmp;
            }
        }
        return maxBlock;
    }

    public int maxAreaRec(int min, int max, int size) {
        int req = max * max;
        int[] a = Library.generateArray(min, max, size);
        int[] b = Library.generateArray(min, max, size);
        for (int i = 0; i < size; i++) {
            int tmp = a[i] * b[i];
            if (tmp < req) {
                req = tmp;
            }
        }
        return req;
    }

    public int midArrayAndCount(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int mid = sum / array.length;
        int res = 0;
        for (int i : array) {
            if (i > mid) {
                res++;
            }
        }
        return res;
    }

    public double maxTriangleGip(int min, int max, int size) {
        int[] a = Library.generateArray(min, max, size);
        int[] b = Library.generateArray(min, max, size);
        double res = 0;
        for (int i = 0; i < size; i++) {
            int tmp = (int) Math.pow(a[i], 2) + (int) Math.pow(b[i], 2);
            if (tmp > res) {
                res = Math.sqrt(tmp);
            }
        }
        return res;
    }
}
