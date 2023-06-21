package ru.my.examples.chapterone;

public class Exons {
    Library library = new Library();
    /*
     * Подсчет максимумов в одномерном массиве
     **/
    public int countMax(int[] array) {
        library.getMax(array);
        int max = array[library.getIndMax()];
        int res = 0;
        for (int i : array) {
            if (i == max) {
                res++;
            }
        }
        return res;
    }
    /*
     * Подсчет сколько чисилел в массиве
     * больше заданного.
     **/
    public int countMoreThan(int[] array, int number) {
        int res = 0;
        for (int i : array) {
            if (i > number) {
                res++;
            }
        }
        return res;
    }
    /*
     *Найти максимальную сумму двух соседних чисел в массиве
     */
    public int maxSumTwoNearElem(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int tmp = array[i] + array[i + 1];
            if (tmp > res) {
                res = tmp;
            }
        }
        return res;
    }
    /*
     *Найти количество значений массива, которые меньше своего левого
     *соседа
     */
    public int countWhenElemLessThenLeftElem(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] < array[i + 1]) {
                count++;
            }
        }
        return count;
    }
    /*
     * Проверить образует ли массив возрастающую или убывающую
     * последовательность.
     */
    public int upperOrDownSequence(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                res++;
            }
            if (array[i] > array[i + 1]) {
                res--;
            }
        }
        if (res == array.length - 1) {
            res = 1;
        } else if (res == -array.length + 1) {
            res = -1;
        } else {
            res = 0;
        }
        return res;
    }
}
