package ru.my.examples.chapterone;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExoneTest {
    @Test
    void whenCountMaxOne() {
        int[] tmp = new int[]{1, 2, 7, 4, 5};
        int res = new Exons().countMax(tmp);
        assertThat(res).isEqualTo(1);
    }

    @Test
    void whenCountMaxTwo() {
        int[] tmp = new int[] {7, 2, 7, 4, 5};
        int res = new Exons().countMax(tmp);
        assertThat(res).isEqualTo(2);
    }

    @Test
    void whenMoreThanNumber() {
        int[] tmp = new int[] {1, 2, 7, 4, 5};
        int res = new Exons().countMoreThan(tmp, 3);
        assertThat(res).isEqualTo(3);
    }

    @Test
    void whenMoreThanNumberWhen0() {
        int[] tmp = new int[] {1, 2, 7, 4, 5};
        int res = new Exons().countMoreThan(tmp, 8);
        assertThat(res).isEqualTo(0);
    }

    @Test
    void whenSumTwoNearElem() {
        int[] tmp = new int[] {1, 2, 7, 4, 5};
        int res = new Exons().maxSumTwoNearElem(tmp);
        assertThat(res).isEqualTo(11);
    }

    @Test
    void whenSumTwoNearElemLastElems() {
        int[] tmp = new int[] {1, 2, 3, 4, 5};
        int res = new Exons().maxSumTwoNearElem(tmp);
        assertThat(res).isEqualTo(9);
    }

    @Test
    void whenSumTwoNearElemFistElems() {
        int[] tmp = new int[] {9, 2, 3, 4, 5};
        int res = new Exons().maxSumTwoNearElem(tmp);
        assertThat(res).isEqualTo(11);
    }

    @Test
    void whenCountElemWhereLeftElemLessThenElem() {
        int[] tmp = new int[] {1, 2, 3, 4, 5};
        int res = new Exons().countWhenElemLessThenLeftElem(tmp);
        assertThat(res).isEqualTo(4);
    }

    @Test
    void whenCountElemWhereLeftElemLessThenElemTwo() {
        int[] tmp = new int[] {3, 2, 1, 4, 5};
        int res = new Exons().countWhenElemLessThenLeftElem(tmp);
        assertThat(res).isEqualTo(2);
    }

    @Test
    void whenUpperSequence() {
        int[] tmp = new int[] {1, 2, 3, 4, 5};
        int res = new Exons().upperOrDownSequence(tmp);
        assertThat(res).isEqualTo(1);
    }

    @Test
    void whenDownSequence() {
        int[] tmp = new int[] {5, 4, 3, 2, 1};
        int res = new Exons().upperOrDownSequence(tmp);
        assertThat(res).isEqualTo(-1);
    }

    @Test
    void whenUpperMinusNumberSequence() {
        int[] tmp = new int[] {-5, -4, -3, -2, -1};
        int res = new Exons().upperOrDownSequence(tmp);
        assertThat(res).isEqualTo(1);
    }

    @Test
    void whenNoSequence() {
        int[] tmp = new int[] {-5, 11, -3, 12, -1};
        int res = new Exons().upperOrDownSequence(tmp);
        assertThat(res).isEqualTo(0);
    }
}