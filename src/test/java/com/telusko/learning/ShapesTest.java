package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShapesTest {

    @Test
    void testcomputeSquareArea() {
        Shapes shape = new Shapes();
        assertEquals(576.0, shape.computeSquareArea(24), 0.0); // Delta added for double comparison
    }

    @Test
    void testComputeCircleArea() {
        Shapes shape = new Shapes();
        // Updated the expected value to the correct calculation
        assertEquals(78.5398, shape.computeCircleArea(5.0), 0.0001); // Added delta for floating-point comparison
    }
}
