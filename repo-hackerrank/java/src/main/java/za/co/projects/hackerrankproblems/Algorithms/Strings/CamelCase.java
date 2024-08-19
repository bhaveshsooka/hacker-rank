package Algorithms.Strings;

import java.util.Scanner;

public class CamelCase
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int count = 0;
		StringBuilder out = new StringBuilder();
		String s = in.next();
		for (char c : s.toCharArray())
		{
			if (c >= 'A' && c <= 'Z')
			{
				System.out.println(out);
				out = new StringBuilder();
				out.append(c);
				count++;
			}
			else
				out.append(c);
		}
		System.out.println(count + 1);

		in.close();
	}
}
