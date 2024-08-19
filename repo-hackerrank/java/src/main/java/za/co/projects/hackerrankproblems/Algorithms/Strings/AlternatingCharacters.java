package Algorithms.Strings;

import java.util.Scanner;

public class AlternatingCharacters
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int t = Integer.parseInt(in.nextLine());
		for (int i = 0; i < t; i++)
		{
			String s = in.nextLine();

			int count = 0;
			for (int j = 0; j < s.length() - 1; j++)
			{
				if (s.charAt(j) == s.charAt(j + 1))
					count++;
			}
			System.out.println(count);
		}

		in.close();
	}

	static String replace(String str, int pos, String replacement)
	{
		StringBuilder output = new StringBuilder(str);
		output.replace(pos, pos + 1, replacement);
		return output.toString();
	}
}
