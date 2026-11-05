package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox113Test {

    @Test
    void toUpperWorks() {
        assertEquals("HELLO", Toolbox113.toUpper("hello"));
        assertEquals("ABC", Toolbox113.toUpper("aBc"));
    }

    @Test
    void multiplyWorks() {
        assertEquals(5 * 6, Toolbox113.multiply(5));
        assertEquals(0, Toolbox113.multiply(0));
    }

    @Test
    void magnitudeWorks() {
        assertEquals(5, Toolbox113.magnitude(5));
        assertEquals(5, Toolbox113.magnitude(-5));
    }
}
