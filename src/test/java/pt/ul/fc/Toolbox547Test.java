package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox547Test {

    @Test
    void largerWorks() {
        assertEquals(9, Toolbox547.larger(9, 2));
        assertEquals(9, Toolbox547.larger(2, 9));
    }

    @Test
    void greaterThanZeroWorks() {
        assertTrue(Toolbox547.greaterThanZero(3));
        assertFalse(Toolbox547.greaterThanZero(-3));
        assertFalse(Toolbox547.greaterThanZero(0));
    }

    @Test
    void evenWorks() {
        assertTrue(Toolbox547.even(4));
        assertFalse(Toolbox547.even(7));
    }

    @Test
void sumWorks() {
    assertEquals(8, Toolbox547.sum(3, 5));
    assertEquals(10, Toolbox547.sum(4, 6));
}

@Test
void amplifyWorks() {
    assertEquals(12, Toolbox547.amplify(3));
    assertEquals(20, Toolbox547.amplify(5));
} 
}
