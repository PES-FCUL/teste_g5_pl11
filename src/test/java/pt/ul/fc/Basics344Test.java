package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics344Test {

    @Test
    void pickMaxWorks() {
        assertEquals(9, Basics344.pickMax(9, 2));
        assertEquals(9, Basics344.pickMax(2, 9));
    }
    @Test
    void multiplyWorks() {
        assertEquals(14, Basics344.multiply(2));
        assertEquals(21, Basics344.multiply(3));
    }

    @Test
    void evenWorks() {
        assertTrue(Basics344.isEven(2));
        assertFalse(Basics344.isEven(3));
    }


    @Test
    void positiveWorks() {
        assertTrue(Basics344.positive(3));
        assertFalse(Basics344.positive(-3));
        assertFalse(Basics344.positive(0));
    }

    @Test
    void absWorks() {
        assertEquals(5, Basics344.abs(5));
        assertEquals(5, Basics344.abs(-5));
    }
}
