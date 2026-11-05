package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class Toolbox128Test {

    @Test
    void totalWorks() {
        assertEquals(7, Toolbox128.total(3, 4));
        assertEquals(0, Toolbox128.total(-2, 2));
    }

    @Test
    void rectAreaWorks() {
        assertEquals(12, Toolbox128.rectArea(3, 4));
        assertEquals(35, Toolbox128.rectArea(5, 7));
    }

    @Test
    void absWorks() {
        assertEquals(5, Toolbox128.abs(5));
        assertEquals(5, Toolbox128.abs(-5));
    }

    @Test
    void convertTempWorks() {
        assertEquals(33.8, Toolbox128.convertTemp(1));
        assertEquals(35.6, Toolbox128.convertTemp(2));
    }

    @Test
    void maxOfWorks() {
        assertEquals(5, Toolbox128.maxOf(2, 5));
        assertEquals(10, Toolbox128.maxOf(6, 10));
    }
}
