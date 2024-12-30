package com.telusko.learning;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

//import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
        ReverseString reverse = new ReverseString();

        // Test Case 1: Regular string
        String actual = reverse.reverseString("java");
        
        String expected = "avaj";
        assertEquals(expected, actual);

}}
 