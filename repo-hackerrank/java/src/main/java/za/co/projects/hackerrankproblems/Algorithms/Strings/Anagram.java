package Algorithms.Strings;

import java.util.Scanner;

public class Anagram
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			String s = in.next();
			int len = s.length();
			if (len % 2 == 0)
			{
				String l = s.substring(0, len / 2);
				String r = s.substring(len / 2);

				for (int j = 0; j < len / 2; j++)
				{
					l = l.replaceFirst(String.valueOf(r.charAt(j)), "");
				}
				
				System.out.println(l.length());

			}
			else
				System.out.println("-1");

		}

		in.close();
	}
}
