package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

    Shapes shape;

    @BeforeEach
    void init() {
        shape = new Shapes();
        System.out.println("Actual test Running");
    }

    @Test
    void testcomputeSquareArea() {
        assertEquals(78.5, shape.computeCircleArea(5));
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(78.5, shape.computeCircleArea(5));
    }
    
    
    @AfterEach
    void destroy() {
    	System.out.println("After test clean uo and closing ");
    }
}

//output

//Actual test Running
//After test clean uo and closing 
//Actual test Running
//After test clean uo and closing 