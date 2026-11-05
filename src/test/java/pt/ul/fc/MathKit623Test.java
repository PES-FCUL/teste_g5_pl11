package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit623Test {

    @Test
    void isAboveZeroWorks() {
        assertTrue(MathKit623.isAboveZero(3));
        assertFalse(MathKit623.isAboveZero(-3));
        assertFalse(MathKit623.isAboveZero(0));
    }

    @Test
    void isEvenWorks() {
        assertTrue(MathKit623.isEven(4));
        assertFalse(MathKit623.isEven(7));
    }

    @Test
    void magnitudeWorks() {
        assertEquals(5, MathKit623.magnitude(5));
        assertEquals(5, MathKit623.magnitude(-5));
    }
}
