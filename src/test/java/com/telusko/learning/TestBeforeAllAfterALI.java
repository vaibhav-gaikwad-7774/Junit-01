package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBeforeAllAfterALI {
	
	
	TestBeforeAllAfterALI(){//these will print when ever the test method will be iinstanece which are present in the same 
		System.out.println("test obj is created before the test method");
	}
		
		@BeforeAll
		static void BeforeAll() {
			System.out.println("Before all test");
		}
		
		@AfterAll
		static void AfterAll() {
			System.out.println("After all test");
		}

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


//
//Before all test
//Actual test Running
//After test clean uo and closing 
//Actual test Running
//After test clean uo and closing 
//After all test