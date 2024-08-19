package Algorithms.Implementation;

import java.util.Scanner;

public class RepeatedString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long n = in.nextLong();

		long count = 0;
		int strLength = s.length();

		if (n <= strLength)
		{
			for (int i = 0; i < n; i++)
			{
				char l = s.charAt(i);
				if (l == 'a')
					count++;
			}
			System.out.println(count);

			in.close();
			return;
		}

		int numAinS = getAs(s);

		count += Math.floor(n / strLength) * numAinS;
		
		int remainder = (int) (n % strLength);
		for (int i = 0; i < remainder; i++)
		{
			char l = s.charAt(i);
			if (l == 'a')
				count++;
		}
		
		System.out.println(count);
		
		in.close();
	}

	static int getAs(String str)
	{
		int c = 0;
		for (char l : str.toCharArray())
		{
			if (l == 'a')
				c++;
		}
		return c;
	}
}
