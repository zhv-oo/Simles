package ru.my.examples.chapterone;

public class Library {
    private int indMax = 0;

    public static boolean checkSize(final int n) {
        if (n <= 0) {
            System.out.println("Число должно быть больше 0. \n"
                    + "Попробуйте еще раз! \n");
            return false;
        } else {
            return true;
        }
    }
    /**
     * Метод Math.random() генерирует случайное число от 0 до 1.
     * замтем мы устанавливаем рамки диапазона
     * @param min  минимальной и
     * @param max  максимальной коснстантой.
     * @return возвращаем сгенерированный массив содержащий
     * целочисленные значения из заданного диапазона с
     * @param size заданой размерностью.
     */
    public static int[] generateArray(final int min, final int max,
                                      int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * (max - min) + min);
        }
        return result;
    }

    public int getMin(int[] array) {
        int result = array[0];
        for (int i: array) {
            result = Math.min(i, result);
        }
        return result;
    }

    public void getMax(int[] array) {
        int result = array[0];
        int tmp = 0;
        int ind = 0;
        for (int i: array) {
            if (result < i) {
                result = i;
                ind = tmp;
            }
            tmp++;
        }
        this.indMax = ind;
    }

    public int getIndMax() {
        return indMax;
    }
}
