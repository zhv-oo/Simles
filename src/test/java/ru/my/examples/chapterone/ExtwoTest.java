package ru.my.examples.chapterone;

import org.assertj.core.data.Offset;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExtwosTest {

    @Test
    void whenMaxBlock5x5x5() {
        int[] tmp = new int[] {3, 2, 1, 4, 5};
        int[] tmpTwo = new int[] {3, 2, 1, 4, 5};
        int[] tmpThree = new int[] {3, 2, 1, 4, 5};
        Extwos extwos = new Extwos();
        int res = extwos.maxRandBlock(tmp, tmpTwo, tmpThree, 5);
        assertThat(res).isEqualTo(125);
    }

    @Test
    void whenMaxBlock6x6x6() {
        int[] tmp = new int[] {3, 2, 1, 4, 5, 6};
        int[] tmpTwo = new int[] {3, 2, 1, 4, 5, 6};
        int[] tmpThree = new int[] {3, 2, 1, 4, 5, 6};
        Extwos extwos = new Extwos();
        int res = extwos.maxRandBlock(tmp, tmpTwo, tmpThree, 6);
        assertThat(res).isEqualTo(216);
    }

    @Test
    void whenMaxRandBlock3x3x3() {
        Extwos extwos = new Extwos();
        int res = extwos.maxRandBlock(3, 3, 6);
        assertThat(res).isEqualTo(27);
    }

    @Test
    void whenMaxRandBlock2x2x2() {
        Extwos extwos = new Extwos();
        int res = extwos.maxRandBlock(2, 2, 6);
        assertThat(res).isEqualTo(8);
    }

    @Test
    void whenMaxRandRec3x3() {
        Extwos extwos = new Extwos();
        int res = extwos.maxAreaRec(3, 3, 3);
        assertThat(res).isEqualTo(9);
    }

    @Test
    void whenMaxRandRec5x5() {
        Extwos extwos = new Extwos();
        int res = extwos.maxAreaRec(5, 5, 6);
        assertThat(res).isEqualTo(25);
    }

    @Test
    void whenMaxRandRec1() {
        Extwos extwos = new Extwos();
        int res = extwos.maxAreaRec(1, 1, 100);
        assertThat(res).isEqualTo(1);
    }

    @Test
    void whenMidArrayAndCountTwo() {
        Extwos extwos = new Extwos();
        int res = extwos.midArrayAndCount(new int[] {1, 2, 3, 4, 5, 6});
        assertThat(res).isEqualTo(3);
    }

    @Test
    void whenMidArrayAndCountOne() {
        Extwos extwos = new Extwos();
        int res = extwos.midArrayAndCount(new int[] {1, 2, 3, 4, 5});
        assertThat(res).isEqualTo(2);
    }

    @Test
    void whenMaxTriangleGipWhere4and4() {
        Extwos extwos = new Extwos();
        double res = extwos.maxTriangleGip(4, 4, 4);
        assertThat(res).isCloseTo(5.6, Offset.offset(0.1));
    }

    @Test
    void whenMaxTriangleGipWhere3and3() {
        Extwos extwos = new Extwos();
        double res = extwos.maxTriangleGip(3, 3, 14);
        assertThat(res).isCloseTo(4.2, Offset.offset(0.1));
    }
}