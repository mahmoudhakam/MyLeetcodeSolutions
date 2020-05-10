package com.problems.leetcode.MayChallenge;

public class PerfectSquare
{
	public static void main(String[] args)
	{
		// System.out.println(isPerfectSquare(0));
		// System.out.println(isPerfectSquare(1));
		// System.out.println(isPerfectSquare(2));
		// System.out.println(isPerfectSquare(3));
		// System.out.println(isPerfectSquare(4));
		System.out.println(isPerfectSquare(14));
	}

	public static boolean isPerfectSquare(int num)
	{
		// if(num < 0)
		// return false;
		// if(num == 0)
		// return true;
		// long left = 1;
		// long right = (long) Integer.MAX_VALUE;
		// while(left <= right)
		// {
		// long mid = left + right >>> 1;
		// long midSqr = mid * mid;
		// if(midSqr == num)
		// return true;
		// else if(midSqr > num)
		// right = mid - 1;
		// else
		// left = mid + 1;
		// }
		// return false;

		long guess = num;
		while(guess * guess > num)
		{
			guess = (guess + num / guess) >>> 1;
		}
		return guess * guess == num;
	}
}
