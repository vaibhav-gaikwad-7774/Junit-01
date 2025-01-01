package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrialTest {

	@Test
	void test() {
		assertEquals(6, 3+3); 

	}
	@Test
	void testcomputeSquareArea() {
		Shapes shape = new Shapes();
		assertEquals(576.0, shape.computeSquareArea(24)); 
		
	}
	
}

//14.45

