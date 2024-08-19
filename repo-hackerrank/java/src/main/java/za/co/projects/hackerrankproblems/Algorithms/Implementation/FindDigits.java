package Algorithms.Implementation;

import java.util.Scanner;

public class FindDigits
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++)
		{
			int n = in.nextInt();
			String input = String.valueOf(n);
			int result = 0;
			for (int i = 0; i < input.length(); i++)
			{
				int ic = Integer.parseInt(input.substring(i,i+1));
				if (ic == 0)
					continue;
				if (n % ic == 0)
					result++;
			}
			System.out.println(result);
		}

		in.close();
	}
}
