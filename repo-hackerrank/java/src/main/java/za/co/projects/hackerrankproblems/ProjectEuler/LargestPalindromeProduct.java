package ProjectEuler;

import java.util.Scanner;

public class LargestPalindromeProduct
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++)
		{
			int n = in.nextInt();

			int max = 0;
			for (int i = 100; i < 1000; i++)
			{
				for (int j = 100; j < 1000; j++)
				{
					int val = i * j;
					if(val >= n)
						continue;
					String sval = Integer.toString(val);
					if ((isPalindrome(sval)) && (val >= max))
					{
						max = val;
					}
				}
			}
			System.out.println(max);
		}

		in.close();
	}

	public static boolean isPalindrome(String s)
	{
		s.toLowerCase();
		String back = "";
		int i = s.length() - 1;
		int j = i + 1;
		while (i > -1)
		{
			String t = s.substring(i, j);
			back = back + t;
			i--;
			j--;
		}
		if (s.equals(back))
		{
			return true;
		}
		return false;
	}
}
