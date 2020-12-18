package com.logicharmony;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int actual =  mathUtils.add(5, 2);
		int expected = 7;
		assertEquals(expected, actual,"Should add two numbers expected and actual");
	}
	
	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils = new MathUtils();
		assertEquals( 314.1592653589793238, mathUtils.computeCircleArea(10),"Should return correct value of circle area");
	}
	
	
	@Test
	void testDivide() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),"Divide by zero should throw" );
	}

}
