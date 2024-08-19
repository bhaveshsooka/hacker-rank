package Algorithms.Implementation;

import java.util.Scanner;

public class MinimumDistances
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		for (int A_i = 0; A_i < n; A_i++)
		{
			int t = in.nextInt();
			A[A_i] = t;
		}

		int minDistance = A[0];
		int c = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < A.length; j++)
			{
				if (A[i] == A[j])
				{
					if (Math.abs(i - j) < minDistance)
						minDistance = Math.abs(i - j);
					c++;
				}

			}

		}

		if (c > 0)
			System.out.println(minDistance);
		else
			System.out.println("-1");

		in.close();
	}
}
