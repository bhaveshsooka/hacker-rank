package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class BetweenTwoSets
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++)
		{
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++)
		{
			b[b_i] = in.nextInt();
		}
		ArrayList<Integer> answerlist = new ArrayList<Integer>();
		
		int aMax = GetMax(a);
		int bMin = GetMin(b);
		//System.out.println(aMax + " " + bMin);
		for (int i = aMax; i <= bMin; i++)
		{
			if(AllAFactorX(a, i) && XFactorAllB(b, i))
				answerlist.add(i);
		}
		
//		String o = "";
//		for (int i = 0; i < answerlist.size(); i++)
//		{
//			o += answerlist.get(i) + " ";
//		}
		System.out.println(answerlist.size());

		in.close();
	}
	
	public static boolean XFactorAllB(int[] B, int x)
	{
		for (int i = 0; i < B.length; i++)
		{
			if(B[i] % x != 0)
				return false;
		}
		return true;
	}
	
	public static boolean AllAFactorX(int[] A, int x)
	{
		for (int i = 0; i < A.length; i++)
		{
			if(x % A[i] != 0)
				return false;
		}
		return true;
	}
	
	public static int GetMax(int[] A)
	{
		int max = 0;
		for (int i = 0; i < A.length; i++)
		{
			if(A[i] > max)
				max = A[i];
		}
		return max;
	}
	
	public static int GetMin(int[] A)
	{
		int min = 101;
		for (int i = 0; i < A.length; i++)
		{
			if(A[i] < min)
				min = A[i];
		}
		return min;
	}
	
	
}
