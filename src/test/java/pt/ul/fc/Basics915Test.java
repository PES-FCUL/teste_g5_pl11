package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Basics915Test {

    @Test
    void surfaceWorks() {
        assertEquals(12, Basics915.surface(3, 4));
        assertEquals(35, Basics915.surface(5, 7));
    }

    @Test
    void averageWorks() {
        assertEquals(5.0, Basics915.average(4.0, 6.0), 1e-9);
        assertEquals(0.0, Basics915.average(-1.0, 1.0), 1e-9);
    }

    @Test
    void absWorks() {
        assertEquals(5, Basics915.abs(5));
        assertEquals(5, Basics915.abs(-5));
    }
}
