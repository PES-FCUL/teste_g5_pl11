package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox671Test {

    @Test
    void areaWorks() {
        assertEquals(12, Toolbox671.area(3, 4));
        assertEquals(35, Toolbox671.area(5, 7));
    }

    @Test
    void sumWorks() {
        assertEquals(7, Toolbox671.sum(3, 4));
        assertEquals(0, Toolbox671.sum(-2, 2));
    }

    @Test
    void toFahrenheitWorks() {
        assertEquals(212.0, Toolbox671.toFahrenheit(100.0), 1e-9);
        assertEquals(32.0, Toolbox671.toFahrenheit(0.0), 1e-9);
    }
}
