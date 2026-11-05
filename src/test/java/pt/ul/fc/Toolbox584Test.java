package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox584Test {

    @Test
    void midpointWorks() {
        assertEquals(5.0, Toolbox584.midpoint(4.0, 6.0), 1e-9);
        assertEquals(0.0, Toolbox584.midpoint(-1.0, 1.0), 1e-9);
    }

    @Test
    void hasEvenParityWorks() {
        assertTrue(Toolbox584.hasEvenParity(4));
        assertFalse(Toolbox584.hasEvenParity(7));
    }

    @Test
    void areaOfWorks() {
        assertEquals(12, Toolbox584.areaOf(3, 4));
        assertEquals(35, Toolbox584.areaOf(5, 7));
    }

    @Test
    void addWorks() {
        assertEquals(5, Toolbox584.add(2, 3));
    }

    @Test
    void celsiusToFWorks() {
        assertEquals(32.0, Toolbox584.celsiusToF(0.0), 1e-9);
    }
}
