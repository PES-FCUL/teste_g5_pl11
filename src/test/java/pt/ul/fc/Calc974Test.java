package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Calc974Test {

    @Test
    void multiplyWorks() {
        assertEquals(5 * 6, Calc974.multiply(5));
        assertEquals(0, Calc974.multiply(0));
    }

    @Test
    void convertTempWorks() {
        assertEquals(212.0, Calc974.convertTemp(100.0), 1e-9);
        assertEquals(32.0, Calc974.convertTemp(0.0), 1e-9);
    }

    @Test
    void isEvenWorks() {
        assertTrue(Calc974.isEven(4));
        assertFalse(Calc974.isEven(7));
    }
}
