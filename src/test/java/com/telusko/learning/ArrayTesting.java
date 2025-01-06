package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayTesting {
    @Test
    void testArray() {
        int[] expected = {2, 4, 6, 8};
        int[] actual = {4, 8, 6, 2};
        
        Arrays.sort(actual);
        System.out.println(actual);
        assertArrayEquals(expected, actual, "The arrays are not equal!");
    }
}
