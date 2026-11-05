package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox769Test {

    @Test
    void celsiusToFWorks() {
        assertEquals(212.0, Toolbox769.celsiusToF(100.0), 1e-9);
        assertEquals(32.0, Toolbox769.celsiusToF(0.0), 1e-9);
    }

    @Test
    void divisibleByTwoWorks() {
        assertTrue(Toolbox769.divisibleByTwo(4));
        assertFalse(Toolbox769.divisibleByTwo(7));
    }

    @Test
    void rectAreaWorks() {
        assertEquals(12, Toolbox769.rectArea(3, 4));
        assertEquals(35, Toolbox769.rectArea(5, 7));
    }
}
