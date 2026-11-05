package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calc181Test {

    @Test
    void greaterThanZeroWorks() {
        assertTrue(Calc181.greaterThanZero(3));
        assertFalse(Calc181.greaterThanZero(-3));
        assertFalse(Calc181.greaterThanZero(0));
    }

    @Test
    void meanWorks() {
        assertEquals(5.0, Calc181.mean(4.0, 6.0), 1e-9);
        assertEquals(0.0, Calc181.mean(-1.0, 1.0), 1e-9);
    }

    @Test
    void absoluteWorks() {
        assertEquals(5, Calc181.absolute(5));
        assertEquals(5, Calc181.absolute(-5));
    }
}
