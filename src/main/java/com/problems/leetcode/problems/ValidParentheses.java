package com.problems.leetcode.problems;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets. Open brackets must be closed in the correct order. Note that an empty string is also
 * considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()" Output: true Example 2:
 * <p>
 * Input: "()[]{}" Output: true Example 3:
 * <p>
 * Input: "(]" Output: false Example 4:
 * <p>
 * Input: "([)]" Output: false Example 5:
 * <p>
 * Input: "{[]}" Output: true
 */
public class ValidParentheses
{
	public boolean isValid(String s)
	{
		if(s.isEmpty())
		{
			return true;
		}
		char[] charactersArray = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(char c : charactersArray)
		{
			if(c == '{')
			{
				stack.push('}');
			}
			else if(c == '(')
			{
				stack.push(')');
			}
			else if(c == '[')
			{
				stack.push(']');
			}
			else if(stack.isEmpty() || !(c == stack.pop()))
			{
				return false;
			}
		}
		return stack.isEmpty();
	}
}
