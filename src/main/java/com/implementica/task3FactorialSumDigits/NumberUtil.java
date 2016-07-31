package com.implementica.task3FactorialSumDigits;

import java.math.BigInteger;

public class NumberUtil {
	
	public static BigInteger calculateSumOfDigits(BigInteger number) {
		if (number == null) {
			return null;
		}
		
		if (number.signum() == -1) { // if number is negative
			throw new IllegalArgumentException(String.format(MessageConstants.MSG_INVALID_NUMBER_FOR_SUM, number));
		}
		
		BigInteger sumOfDigits = BigInteger.ZERO;
		
		while (number.signum() == 1) { // if number is positive
			sumOfDigits = sumOfDigits.add(number.remainder(BigInteger.TEN));
		    number = number.divide(BigInteger.TEN);
		}
		
		return sumOfDigits;
		
	}

}
