package CrackingTheCodingInterview;

import java.util.Scanner;

public class StringsMakingAnagrams
{
	public static int numberNeeded(String first, String second)
	{
		String firstCopy = first;

		for (char c : first.toCharArray())
		{
			if (second.indexOf(c) != -1)
			{
				firstCopy = firstCopy.replaceFirst(c + "", "");
				second = second.replaceFirst(c + "", "");
			}
		}

		return firstCopy.length() + second.length();
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
		in.close();
	}
}
