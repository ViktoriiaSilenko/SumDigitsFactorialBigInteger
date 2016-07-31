package com.implementica.task3FactorialSumDigits;

import static org.junit.Assert.assertEquals;
import java.math.BigInteger;
import org.junit.Test;

public class NumberUtilTest {
	
	@Test
	public void testcalculateSumOfDigits() {
		assertEquals(BigInteger.valueOf(6), NumberUtil.calculateSumOfDigits(BigInteger.valueOf(231)));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testFactorialForNegativeInteger() {
		NumberUtil.calculateSumOfDigits(BigInteger.valueOf(-3));
	}
	
	@Test
	public void testcalculateSumOfDigitsForNull() {
		assertEquals(null, NumberUtil.calculateSumOfDigits(null));
	}
    
}



