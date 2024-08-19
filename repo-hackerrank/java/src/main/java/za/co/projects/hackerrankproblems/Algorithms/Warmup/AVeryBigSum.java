package Algorithms.Warmup;

import java.util.*;

public class AVeryBigSum
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		long arr[] = new long[n];
		long sum = 0;
		for (int i = 0; i < n; i++)
		{
			arr[i] = in.nextLong();
			sum += arr[i];
		}
		System.out.println(sum);
		
		in.close();
	}
}
