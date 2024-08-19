package Stats10Days;

import java.util.Scanner;

public class Day01Quartiles
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		float q1, q2, q3;

		int n = in.nextInt();
		int[] X = new int[n];
		for (int i = 0; i < n; i++)
		{
			X[i] = in.nextInt();
		}

		MergeSort(X, 0, n - 1);

		q1 = getMedian(X, 0, (n / 2) - 1);
		q2 = getMedian(X, 0, n - 1);
		q3 = getMedian(X, (n + 1) / 2, n-1);

		System.out.println((int) q1);
		System.out.println((int) q2);
		System.out.println((int) q3);

		in.close();
	}

	static float getMedian(int[] A, int start, int end)
	{
		float median = 0;
		if ((end - start) % 2 != 0)
		{
			int x1 = (end + start) / 2;
			int x2 = (end + start) / 2 + 1;
			median = A[x1] + A[x2];
			median /= 2;
		}
		else
		{
			median = A[(end + start) / 2];
		}
		return median;
	}

	public static void MergeSort(int[] A, int p, int r)
	{
		if (p < r)
		{
			int q = ((p + r) / 2);
			MergeSort(A, p, q);
			MergeSort(A, q + 1, r);
			Merge(A, p, q, r);
		}
	}

	public static void Merge(int[] A, int p, int q, int r)
	{
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for (int i = 0; i < n1; i++)
			L[i] = A[p + i];
		for (int j = 0; j < n2; j++)
			R[j] = A[q + j + 1];

		int i = 0;
		int j = 0;
		for (int k = p; k <= r; k++)
		{
			if (i != L.length && (j == R.length || L[i] <= R[j]))
			{
				A[k] = L[i];
				i++;
			}
			else
			{
				A[k] = R[j];
				j++;
			}

		}
	}
}
