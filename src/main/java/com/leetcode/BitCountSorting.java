package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class BitCountSorting
{
	public static List<Integer> rearrange(List<Integer> elements)
	{
		Map<Integer, List<Integer>> map = new TreeMap<>();
		elements.forEach(e -> {
			Integer bitCount = Integer.bitCount(e);
			List<Integer> values = map.get(bitCount);
			if(values == null)
			{
				values = new ArrayList<>();
				map.put(bitCount, values);
			}
			values.add(e);
		});
		List<Integer> sortedList = new ArrayList<>();
		map.entrySet().forEach(s -> {
			sortedList.addAll(s.getValue().stream().sorted().collect(Collectors.toList()));
		});
		return sortedList;
	}
}
