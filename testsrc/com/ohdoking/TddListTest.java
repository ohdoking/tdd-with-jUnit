package com.ohdoking;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TddListTest {

	List<String> list;
	
	@BeforeEach
	void setUp() throws Exception {
		list = new TddList();
	}

	@Test
	public void givenEmptyList_whenIsEmpty_thenTrueReturned() {
		assertTrue(list.isEmpty());
	}
	
	@Test
	public void givenNonEmptyList_whenIsNonEmpty_thenFalseReturned() {
		list.add(null);
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void givenListWithAnElement_whenSize_thenOneIsReturned() {
		list.add(null);
		assertEquals(1, list.size());
	}
	
	@Test
	public void givenListWithAnElement_whenGet_thenThatElementIsReturned() {
		String result = "test";
		list.add(result);
		Object elem = list.get(0);
		
		assertEquals(result, elem);
	}
	
	@Test
	public void givenEmptyList_whenElementIsAdded_thenGetReturnsThatElement() {
		boolean result = list.add("something");
		assertTrue(result);
		
	}
	

}
