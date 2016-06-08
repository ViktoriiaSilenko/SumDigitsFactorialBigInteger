package com.implementica.task3FactorialSumDigits;

import static org.junit.Assert.assertEquals;
import java.math.BigInteger;
import org.junit.Test;


public class FactorialUtilTest {
	
	@Test
	public void testFactorialForZero() {
		assertEquals(BigInteger.ONE, FactorialUtil.factorial(0));
	}
	
	@Test
	public void testFactorialForOne() {
		assertEquals(BigInteger.ONE, FactorialUtil.factorial(0));
		assertEquals(BigInteger.ONE, FactorialUtil.factorial(1));
		assertEquals(BigInteger.valueOf(24), FactorialUtil.factorial(4));
	}
	
	@Test
	public void testFactorialForFour() {
		assertEquals(BigInteger.ONE, FactorialUtil.factorial(0));
		assertEquals(BigInteger.ONE, FactorialUtil.factorial(1));
		assertEquals(BigInteger.valueOf(24), FactorialUtil.factorial(4));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testFactorialForNegativeInteger() {
		 FactorialUtil.factorial(-2);
	}
    
}



