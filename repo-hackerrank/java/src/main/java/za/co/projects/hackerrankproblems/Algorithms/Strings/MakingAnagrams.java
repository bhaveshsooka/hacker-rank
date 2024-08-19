package Algorithms.Strings;

import java.util.Scanner;

public class MakingAnagrams
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		String one = in.next();
		String oneCP = one;
		int len1 = oneCP.length();

		String two = in.next();
		String twoCP = two;
		int len2 = twoCP.length();

		for (int j = 0; j < len2; j++)
			one = one.replaceFirst(String.valueOf(twoCP.charAt(j)), "");

		for (int j = 0; j < len1; j++)
			two = two.replaceFirst(String.valueOf(oneCP.charAt(j)), "");

		System.out.println(one.length() + two.length());

		in.close();
	}
}
