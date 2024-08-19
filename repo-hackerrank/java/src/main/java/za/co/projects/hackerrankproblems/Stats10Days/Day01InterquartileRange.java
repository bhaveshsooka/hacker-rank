package Stats10Days;

import java.util.ArrayList;
import java.util.Scanner;

public class Day01InterquartileRange
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		float q1, q3;
		ArrayList<Integer> list = new ArrayList<Integer>();

		int m = in.nextInt();
		int[] A = new int[m];
		int[] F = new int[m];
		for (int i = 0; i < m; i++)
		{
			A[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++)
		{
			F[i] = in.nextInt();
			for (int j = 0; j < F[i]; j++)
			{
				list.add(A[i]);
			}
		}
		
		int[] X = ConvertListToArray(list);
		
		int n = X.length;
		MergeSort(X, 0, n -1);

		q1 = getMedian(X, 0, (n / 2) - 1);
		q3 = getMedian(X, (n + 1) / 2, n-1);

		System.out.printf("%.1f", (q3 - q1));

		in.close();
	}

	static int[] ConvertListToArray(ArrayList<Integer> list)
	{
		int[] Arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
		{
			Arr[i] = list.get(i);
		}
		return Arr;
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
