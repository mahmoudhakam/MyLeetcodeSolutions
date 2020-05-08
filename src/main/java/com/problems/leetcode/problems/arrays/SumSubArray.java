package com.problems.leetcode.problems.arrays;

import java.io.IOException;

public class SumSubArray
{
	public static void main(String[] args)
	{
		System.out.println(sumSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

	static int sumSubArray(int arr[])
	{
		int sum = arr[0];
		int max = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(sum < 0)
			{
				sum = arr[i];
			}
			else
			{
				sum += arr[i];
			}
			max = Math.max(sum, max);
		}
		return max;
	}
}
