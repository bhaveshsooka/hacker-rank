package CrackingTheCodingInterview;

import java.util.Scanner;

public class SortingBubbleSort
{
	static int BubbleSort(int[] a, int n)
	{
		int numberOfSwaps = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					// swap(a[j], a[j + 1]);
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					numberOfSwaps++;
				}
			}

			if (numberOfSwaps == 0)
			{
				break;
			}
		}
		return numberOfSwaps;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++)
		{
			a[a_i] = in.nextInt();
		}

		int swaps = BubbleSort(a, n);
		System.out.println("Array is sorted in " + swaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);

		in.close();
	}
}
