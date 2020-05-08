package com.problems.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
	/**
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * <p>
	 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 * <p>
	 * Example:
	 * <p>
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * <p>
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 */
	public int[] twoSum(int[] nums, int target)
	{

		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++)
		{
			int complmentary = target - nums[i];
			Integer firstIndex = map.get(nums[i]);
			if(firstIndex != null)
			{
				return new int[] { firstIndex, i };
			}
			map.put(complmentary, i);
		}
		return null;
	}

	public static void main(String[] args)
	{

	}
}
