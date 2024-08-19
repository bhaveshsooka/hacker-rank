package Algorithms.Warmup;

import java.util.*;

public class DiagonalDifference
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++)
		{
			for (int a_j = 0; a_j < n; a_j++)
			{
				a[a_i][a_j] = in.nextInt();
			}
		}
		
		int sum = 0;
		int idxa = 0;
		int idxb = n-1;
		for (int i = 0; i < a.length; i++)
		{
			sum+=a[i][idxa];
			sum-=a[i][idxb];
			idxa++;
			idxb--;
		}
		System.out.println(Math.abs(sum));
		
		in.close();
	}
}
