package Stats10Days;

import java.util.HashMap;
import java.util.Scanner;

public class Day00MeanMedianAndMode
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxOccurrences = 0;

		float mean = 0;
		float median = 0;
		int mode = Integer.MAX_VALUE;

		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = in.nextInt();

			sum += arr[i];
			int occurrences;
			if (map.containsKey(arr[i]))
				occurrences = map.get(arr[i]) + 1;
			else
				occurrences = 1;
			map.put(arr[i], occurrences);

			if (occurrences > maxOccurrences)
			{
				maxOccurrences = occurrences;
				mode = arr[i];
			}
			else if (occurrences == maxOccurrences && arr[i] < mode)
			{
				maxOccurrences = occurrences;
				mode = arr[i];
			}

		}

		MergeSort(arr, 0, n - 1);
		mean = (float) sum / n;
		if (n % 2 == 0)
		{
			int x1 = (n / 2) - 1;
			int x2 = n / 2;
			median = arr[x1] + arr[x2];
			median /= 2;
		}
		else
		{
			median = arr[n / 2];
		}

		System.out.printf("%.1f\n", mean);
		System.out.printf("%.1f\n", median);
		System.out.println(mode);

		in.close();
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
