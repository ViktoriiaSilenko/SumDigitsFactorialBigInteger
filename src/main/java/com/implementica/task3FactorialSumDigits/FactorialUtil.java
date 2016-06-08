package com.implementica.task3FactorialSumDigits;

import java.math.BigInteger;

public class FactorialUtil {
	
	public static BigInteger factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException(String.format(MessageConstants.MSG_INVALID_NUMBER, n));
		} 
		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		} 
		
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) {
        	factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

}
