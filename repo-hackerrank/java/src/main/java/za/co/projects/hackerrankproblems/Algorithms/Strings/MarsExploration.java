package Algorithms.Strings;

import java.util.Scanner;

public class MarsExploration
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String S = in.next();

		int count = 0;
		for (int i = 0; i < S.length(); i++)
		{
			int mod = i % 3;
			if (mod == 0 || mod == 2)
			{
				if (S.charAt(i) != 'S')
					count++;
			}
			else
			{
				if (S.charAt(i) != 'O')
					count++;
			}
			// System.out.println(S.charAt(i) + " " + (i % 3));
		}

		System.out.println(count);

		in.close();
	}
}
