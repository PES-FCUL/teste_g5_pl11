package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit210Test {

    @Test
    void distanceFromZeroWorks() {
        assertEquals(5, MathKit210.distanceFromZero(5));
        assertEquals(5, MathKit210.distanceFromZero(-5));
    }

    @Test
    void cToFWorks() {
        assertEquals(212.0, MathKit210.cToF(100.0), 1e-9);
        assertEquals(32.0, MathKit210.cToF(0.0), 1e-9);
    }

    @Test
    void averageWorks() {
        assertEquals(5.0, MathKit210.average(4.0, 6.0), 1e-9);
        assertEquals(0.0, MathKit210.average(-1.0, 1.0), 1e-9);
    }

      @Test
    void evenWorks() {
        assertTrue(MathKit210.even(4));
        assertFalse(MathKit210.even(5));
        assertTrue(MathKit210.even(0));
    }

    @Test
    void areaOfWorks() {
        assertEquals(12, MathKit210.areaOf(3, 4));
        assertEquals(30, MathKit210.areaOf(5, 6));
    }
    


}
