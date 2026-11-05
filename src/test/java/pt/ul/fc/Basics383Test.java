package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics383Test {

    @Test
    void isAboveZeroWorks() {
        assertTrue(Basics383.isAboveZero(3));
        assertFalse(Basics383.isAboveZero(-3));
        assertFalse(Basics383.isAboveZero(0));
    }

    @Test
    void plusWorks() {
        assertEquals(7, Basics383.plus(3, 4));
        assertEquals(0, Basics383.plus(-2, 2));
    }

    @Test
    void averageWorks() {
        assertEquals(5.0, Basics383.average(4.0, 6.0), 1e-9);
        assertEquals(0.0, Basics383.average(-1.0, 1.0), 1e-9);
    }

    @Test
    void scaleWorks() {
        assertEquals(5.0, Basics383.scale(1));
        assertEquals(10.0, Basics383.scale(2));
        assertEquals(0.0, Basics383.scale(0));
    }

    @Test
    void capitalizeAllWorks() {
        assertEquals("HELLO", Basics383.capitalizeAll("Hello"));
        assertEquals("WORLD", Basics383.capitalizeAll("World"));
    }
}
