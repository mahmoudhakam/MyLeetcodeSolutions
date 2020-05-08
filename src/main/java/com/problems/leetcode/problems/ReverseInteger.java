package com.problems.leetcode.problems;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123 Output: 321 Example 2:
 * <p>
 * Input: -123 Output: -321 Example 3:
 * <p>
 * Input: 120 Output: 21 Note: Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
 * [−231, 231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseInteger
{
	public int reverse(int x)
	{
		boolean negative = false;
		if(x < 0)
		{
			x *= -1;
			negative = true;
		}
		long out = 0;// result might overflow
		while(x > 0)
		{
			out = (out * 10) + (x % 10);// get last digit of input
			x /= 10; // remove last digit
		}
		if(out > Integer.MAX_VALUE || out < Integer.MIN_VALUE)
		{
			return 0;
		}
		return negative ? (int) out * -1 : (int) out;
	}

	public static void main(String[] args)
	{
		System.out.println(2 % 10);
		new ReverseInteger().reverse(123);
	}
}
