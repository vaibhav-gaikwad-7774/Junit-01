package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrialTest {
	Shapes shape = new Shapes();

	@Test
	void test() {
		assertEquals(6, 3+3); 

	}
	@Test
	void testcomputeSquareArea() {
		assertEquals(161.0, shape.testcomputeSquareArea(4)); 
		
		
	}
	@Test
	void testcomputeSquareArea_WithMessage() {
		assertEquals(161.0, shape.testcomputeSquareArea(4), "Message to dev is testcase failing"); 
	}
	
	@Test
	void testcomputeSquareArea_Supplier() {
		assertEquals(16.0, shape.testcomputeSquareArea(4),()-> "Message to dev is testcase failing"); 
	}
	

	
	
}

//14.45

