package com.lee;

import org.junit.Test;

public class MaxNumberTest {
	@Test
	public void testMax() {
		int max = new MaxNumber().max(5, 6);
		if (max != 6) {
			throw new RuntimeException();
		} else {
			System.out.println("max = " + max);
		}
	}
}
