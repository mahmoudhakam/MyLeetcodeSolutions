package com.problems.leetcode.problems;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121 Output: true Example 2:
 * <p>
 * Input: -121 Output: false Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10 Output: false Explanation: Reads 01 from right to left. Therefore it is not a palindrome. Follow up:
 * <p>
 * Coud you solve it without converting the integer to a string?
 */
public class PalindromeNumber
{

	public boolean isPalindrome(int x)
	{
		int original = x;
		if(x < 0)
		{
			return false;
		}
		long out = 0;// result might overflow
		while(x > 0)
		{
			out = (out * 10) + (x % 10);// get last digit of input
			x /= 10; // remove last digit
		}
		// if (out > Integer.MAX_VALUE || out
		// < Integer.MIN_VALUE) {
		// return false;
		// }

		return (out == original) ? true : false;
	}

	public static void main(String[] args)
	{
		boolean ispalinderome = new PalindromeNumber().isPalindrome(-121);
		System.out.println(ispalinderome);
	}

}
