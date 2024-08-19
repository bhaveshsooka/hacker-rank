package CrackingTheCodingInterview;

import java.util.Scanner;

public class HeapsFindTheRunningMedian
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++)
		{
			a[a_i] = in.nextInt();
			int[] tmp = new int[a_i + 1];
			System.arraycopy(a, 0, tmp, 0, a_i + 1);
			MergeSort(tmp, 0, a_i);
			System.out.println(getMedian(tmp, 0, a_i));
		}

		in.close();
	}

	static float getMedian(int[] A, int start, int end)
	{
		if (start == end)
			return A[start];
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
