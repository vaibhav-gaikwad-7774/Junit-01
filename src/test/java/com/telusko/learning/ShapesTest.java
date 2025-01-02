package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ShapesTest {
    Shapes shape = new Shapes();

    @Test
    void testcomputeSquareArea() {
        assertEquals(576.0, shape.testcomputeSquareArea(24), 0.0); // Delta added for double comparison
    }

//    @Test
//    void testComputeCircleArea() {
//        // Updated the expected value to the correct calculation
//        assertEquals(78.53981633974483, shape.computeCircleArea(5.0), "area of circle is wrong "); // Added delta for floating-point comparison
//    }
//    
//    @Test
//    void testComputeCircleArea_Supplier() {
//        // Updated the expected value to the correct calculation
//        assertEquals(78.53981633974483, shape.computeCircleArea(5),()-> "area of circle calculation is wrong "); // Added delta for floating-point comparison
//    }
}
