package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {

	@Test
	void test() {
		assertEquals(6, 3+3);
	}
	
	@Test
	void testcomputesquareArea() {
		Shapes shape = new Shapes();
		assertEquals(576, shape.testcomputeSquareArea(24));
	}

}
