package Algorithms.Strings;

import java.util.Scanner;

public class PalindromeIndex
{
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i++)
		{
			str[i] = in.next();
		}
		for (int i = 0; i < n; i++)
		{
			boolean isNot = true;
			int len = str[i].length();
			String s = str[i];
			for (int j = 0; j <= len / 2; j++)
			{
				if (s.charAt(j) != s.charAt(len - j - 1))
				{
					if (s.charAt(j + 1) == s.charAt(s.length() - j - 1) && s.charAt(j + 2) == s.charAt(s.length() - j - 2))
						System.out.println(j);
					else
						System.out.println(s.length() - j - 1);

					isNot = false;
					break;
				}
			}
			if (isNot)
				System.out.println("-1");
		}
		
		in.close();

	}
}
