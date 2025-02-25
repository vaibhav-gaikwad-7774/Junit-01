package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestingPerformance {

	@Test
	void testSortingMethod_Performance() {
		SortingArray  array = new SortingArray();
		
		int unsorted[] = {2,6,1};
		
		assertTimeout(Duration.ofMillis(10), ()-> array.sortingArray(unsorted));
		
	}

}
