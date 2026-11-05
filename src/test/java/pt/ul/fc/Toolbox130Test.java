package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox130Test {

    @Test
    void isAboveZeroWorks() {
        assertTrue(Toolbox130.isAboveZero(3));
        assertFalse(Toolbox130.isAboveZero(-3));
        assertFalse(Toolbox130.isAboveZero(0));
    }

    @Test
    void pickMaxWorks() {
        assertEquals(9, Toolbox130.pickMax(9, 2));
        assertEquals(9, Toolbox130.pickMax(2, 9));
    }

    @Test
    void convertTempWorks() {
        assertEquals(212.0, Toolbox130.convertTemp(100.0), 1e-9);
        assertEquals(32.0, Toolbox130.convertTemp(0.0), 1e-9);
    }
}
