package com.leetcode.andelaCodeChallenge;

public class WordCompression
{
	public static void main(String[] args)
	{
		System.out.println(compressWord("abbcccbn", 3));
	}

	public static String compressWord(String word, int k)
	{
		StringBuilder sb = new StringBuilder(word);
		for(int i = 0; i < sb.length(); i++)
		{
			if(sb.length() == 1 || sb.length() < k)
			{
				return sb.toString();
			}
			int y = i;
			int count = 1;
			while(true)
			{
				if(sb.charAt(y) != sb.charAt(y + 1))
				{
					break;
				}
				else
				{
					count++;
					if(count == k)
					{
						sb.delete(i, i + k);
						i = 0;
						break;
					}
				}
				y++;
			}
		}
		return sb.toString();
	}
}
