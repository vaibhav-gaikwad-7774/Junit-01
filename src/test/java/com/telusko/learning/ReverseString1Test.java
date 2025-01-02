package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseString1Test {

    @Test
    public void test() {
        ReverseString reverse = new ReverseString();

        // Test Case 1: Regular string
        assertEquals("avaj", reverse.reverseString("java"));
        assertEquals("vaibhav", reverse.reverseString("vahbiav"));
    }
}
