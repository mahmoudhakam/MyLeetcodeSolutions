package com.leetcode.MayChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MajorityElement
{

	public static int majorityElement(int[] nums)
	{
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++)
		{
			Integer key = map.get(nums[i]);
			if(key == null)
			{
				key = 0;
				map.put(nums[i], key);
			}
			map.put(nums[i], ++key);
		}
		int majorityElement = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for(Entry<Integer, Integer> x : map.entrySet())
		{
			if(x.getValue() > max)
			{
				max = x.getValue();
				majorityElement = x.getKey();
			}
		}
		return majorityElement;
	}
}
