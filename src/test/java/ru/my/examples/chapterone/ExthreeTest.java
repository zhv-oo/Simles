package ru.my.examples.chapterone;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ExthreeTest {

    @Test
    void whenScalarSumVectorX2Y2Z2() {
        Exthree exthree = new Exthree();
        int res = exthree.scalarSumVector(2, 2, 3);
        assertThat(res).isEqualTo(12);
    }

    @Test
    void whenScalarSumVectorX3Y3() {
        Exthree exthree = new Exthree();
        int res = exthree.scalarSumVector(3, 3, 2);
        assertThat(res).isEqualTo(18);
    }
}