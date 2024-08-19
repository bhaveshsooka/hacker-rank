package Algorithms.Implementation;

import java.util.Scanner;

public class TaumAndBday
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++)
		{
			long b = in.nextLong();
			long w = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();

			System.out.println(getMinCost(b, w, x, y, z));
		}

		in.close();
	}

	static long getMinCost(long black, long white, long bCost, long wCost, long conversionRate)
	{
		if (bCost + conversionRate < wCost)
			return ((black + white) * bCost) + (white * conversionRate);
		else if (wCost + conversionRate < bCost)
			return ((black + white) * wCost) + (black * conversionRate);
		else
			return (black * bCost) + (white * wCost);
	}
}
