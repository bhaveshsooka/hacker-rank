package Algorithms.Warmup;

import java.util.*;

public class PlusMinus
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++)
		{
			arr[arr_i] = in.nextInt();
		}
		
		double pos = 0;
		double neg = 0;
		double zeros = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] > 0)
				pos++;
			else if(arr[i] < 0)
				neg++;
			else
				zeros++;
		}
		System.out.println(pos/n);
		System.out.println(neg/n);
		System.out.println(zeros/n);
		
		in.close();
	}
}
