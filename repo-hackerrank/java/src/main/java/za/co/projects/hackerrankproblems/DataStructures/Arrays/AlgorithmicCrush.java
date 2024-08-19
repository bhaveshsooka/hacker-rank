package DataStructures.Arrays;

import java.util.Scanner;

public class AlgorithmicCrush
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		long[] A = new long[n+1];
		long[] B = new long[n+1];

		for (int i = 0; i < m; i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			long k = in.nextInt();
			B[a - 1] += k;
			B[b] -= k;
		}

		long max = 0;
		long aux = 0;
		for (int i = 0; i < n; i++)
		{
			aux += B[i];
			A[i] = aux;
			if (A[i] > max)
				max = A[i];
		}
		System.out.println(max);

		in.close();
	}
}
