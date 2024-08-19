package CrackingTheCodingInterview;

import java.util.Scanner;

public class RecursionDavisStaircase
{
	static int getAllWays(int n)
	{
		if (n <= 2)
			return n;
		if (n == 3)
			return 4;
		if (n == 4)
			return 7;
		if (n == 5)
			return 13;
		return getAllWays(n - 1) + getAllWays(n - 2) + getAllWays(n - 3);
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		for (int a0 = 0; a0 < s; a0++)
		{
			int n = in.nextInt();
			System.out.println(getAllWays(n));
		}

		in.close();
	}
}
