package CrackingTheCodingInterview;

import java.util.Scanner;

public class MergeSortCountingInversions
{
	static long swaps = 0;

	public static long countInversions(int[] arr)
	{
		int[] helper = new int[arr.length];
		swaps = 0;
		MergeSort(arr, helper, 0, arr.length - 1);
		return swaps;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++)
		{
			int n = in.nextInt();
			int arr[] = new int[n];
			for (int arr_i = 0; arr_i < n; arr_i++)
			{
				arr[arr_i] = in.nextInt();
			}
			System.out.println(countInversions(arr));
		}

		in.close();
	}

	static void MergeSort(int[] arr, int[] helper, int start, int end)
	{
		if (start < end)
		{
			int mid = ((start + end) / 2);
			MergeSort(arr, helper, start, mid);
			MergeSort(arr, helper, mid + 1, end);
			Merge(arr, helper, start, mid, end);
		}
	}

	static void Merge(int[] A, int[] helper, int start, int mid, int end)
	{
		for (int i = start; i <= end; i++)
			helper[i] = A[i];

		int curr = start;
		int left = start;
		int right = mid + 1;

		while (left <= mid && right <= end)
		{
			if (helper[left] <= helper[right])
				A[curr++] = helper[left++];
			else
			{
				swaps += mid + 1 - left;
				A[curr++] = helper[right++];
			}
		}

		while (left <= mid)
			A[curr++] = helper[left++];
	}
}
