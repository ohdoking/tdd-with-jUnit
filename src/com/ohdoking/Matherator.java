package com.ohdoking;

import java.util.Arrays;

public class Matherator implements Adder, Subtractor {

	@Override
	public long subtract(long... operands) {
		return Arrays
				.stream(operands)
				.reduce((x,y) -> x-y)
				.getAsLong();
	}

	@Override
	public long add(long... operands) {
		return Arrays
				.stream(operands)
				.reduce((x,y) -> x+y)
				.getAsLong();
	}

}
