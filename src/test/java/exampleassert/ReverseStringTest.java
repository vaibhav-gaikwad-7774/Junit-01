package exampleassert;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	ReverseString reverse = new ReverseString();

	@Test
	void testReverseString_OneWord() {
		
		assertEquals("avaJ" ,reverse.reverseString("Java"));
	}
	
	
	@Test
	void testReverseString_MultipleWords() {

		assertEquals("ysae si avaJ" ,reverse.reverseString("Java is easy"));
		
	}

}


//14.24