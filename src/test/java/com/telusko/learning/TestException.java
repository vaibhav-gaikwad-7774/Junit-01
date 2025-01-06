package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testSortingArray_exception() {
		try {
		SortingArray array = new SortingArray();
		int unsorted[] = {2,3,4};
		int sortedArray[] = array.sortingArray(unsorted);
		for(int elem:sortedArray) {
			System.out.print(elem);
		}
		System.out.println("Statement Bellow Exception");
		fail();
	}
		catch(NullPointerException e){
			System.out.println("Exception generated");
			
		}

}}
