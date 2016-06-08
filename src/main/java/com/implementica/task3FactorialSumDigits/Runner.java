package com.implementica.task3FactorialSumDigits;

import java.math.BigInteger;

/**
 * @author Viktoriia Silenko
 */

public class Runner 
{
    public static void main( String[] args ) {
    	BigInteger arg = FactorialUtil.factorial(100);
    	BigInteger result = NumberUtil.calculateSumOfDigits(arg); 
    	System.out.println(String.format(MessageConstants.MSG_RESULT_OUTPUT, result));
    }
}
