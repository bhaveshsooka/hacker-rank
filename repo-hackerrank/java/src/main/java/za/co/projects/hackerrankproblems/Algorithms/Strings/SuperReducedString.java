package Algorithms.Strings;

import java.util.Scanner;

public class SuperReducedString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		StringBuilder s = new StringBuilder(in.next());
		int i = 0;
		while (i < s.length() - 1)
		{
			if (s.charAt(i) == s.charAt(i + 1))
			{
				s.delete(i, i + 2);
				i = 0;
			}
			else
			{
				i++;
			}
		}
		System.out.println(s.toString().equals("") ? "Empty String" : s.toString());

		in.close();
	}
}
