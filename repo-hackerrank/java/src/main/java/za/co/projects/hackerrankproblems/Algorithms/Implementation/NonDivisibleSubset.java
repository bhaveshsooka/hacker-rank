package Algorithms.Implementation;

import java.util.Scanner;

public class NonDivisibleSubset
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		int[] S = new int[n];
		int[] counts = new int[k];
		for (int i = 0; i < n; i++)
		{
			S[i] = in.nextInt();
			counts[S[i] % k]++;
		}

		long res = 0;
		int upper;
		if (counts[0] != 0)
			res++;

		if (k % 2 == 1)
			upper = k / 2;
		else
			upper = (k / 2) - 1;

		for (int i = 1; i <= upper; i++)
		{
			if (counts[i] > counts[k - i])
				res += counts[i];
			else
				res += counts[k - i];
		}

		if ((k % 2 == 0) && (counts[k / 2] != 0))
			res++;

		System.out.println(res);

		in.close();
	}

}
