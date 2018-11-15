package com.ohdoking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatheratorTest {
	
	private Matherator classUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new Matherator();
	}

	@Test
	void testSubtractor() {
		long result = 100 - 34 -(-17) - 4;
		assertEquals(result, classUnderTest.subtract(100, 34, -17, 4));

		result = 0;
		assertEquals(result, classUnderTest.subtract(0));
	}
	
	
	@Test
	void testAdder() {
		//Let java add it up
		long result = 10 + 23 + (-1) + 16;
		
		//Compare that to what the Matherator give us
		assertEquals(result, classUnderTest.add(10, 23, -1, 16));

		result = 100 + 102;
		assertEquals(result, classUnderTest.add(100, 102));

		result = 0;
		assertEquals(result, classUnderTest.add(0));
		
		
	}
	

}
