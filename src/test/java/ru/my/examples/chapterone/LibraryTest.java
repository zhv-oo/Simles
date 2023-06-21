package ru.my.examples.chapterone;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class LibraryTest {

    @Test
    void whenCheckSizeTrue() {
        assertThat(Library.checkSize(4)).isTrue();
    }

    @Test
    void whenCheckSizeFalse() {
        assertThat(Library.checkSize(0)).isFalse();
    }

    @Test
    void generateArray() {
        int[] res = Library.generateArray(2, 8, 5);
        assertThat(res.length).isEqualTo(5);
    }

    @Test
    void getMin() {
        int[] tmp = Library.generateArray(2, 12, 20);
        int res = new Library().getMin(tmp);
        assertThat(res).isEqualTo(2);
    }

    @Test
    void getMax() {
        int[] tmp = new int[] {7, 2, 3, 4, 5};
        Library library = new Library();
        library.getMax(tmp);
        int res = library.getIndMax();
        assertThat(res).isEqualTo(0);
    }

    @Test
    void getMaxTwo() {
        int[] tmp = new int[] {1, 2, 7, 4, 5};
        Library library = new Library();
        library.getMax(tmp);
        int res = library.getIndMax();
        assertThat(res).isEqualTo(2);
    }

    @Test
    void getIndMax() {
        int[] tmp = new int[] {1, 2, 3, 7, 5};
        Library library = new Library();
        library.getMax(tmp);
        int res = library.getIndMax();
        assertThat(res).isEqualTo(3);
    }
}