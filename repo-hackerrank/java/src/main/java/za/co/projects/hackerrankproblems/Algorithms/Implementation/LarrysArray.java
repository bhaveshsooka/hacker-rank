package Algorithms.Implementation;

import java.util.Scanner;

public class LarrysArray
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		for (int i = 0; i < t; i++)
		{
			int n = in.nextInt();
			int[] A = new int[n];
			for (int j = 0; j < n; j++)
			{
				A[j] = in.nextInt();
			}
			int num = insertionSort(A);
			
			if(num % 2 == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
		in.close();
	}
	
	static int insertionSort(int[] list) //Sort number 3
	{
		int count = 0;
		
		int n = list.length;
		for (int i = 1; i < n; i++)
		{
			int x = list[i];
			int j = i-1;
			while ((j >= 0) && (list[j] > x))
			{
				list[j+1] = list[j];
				j = j-1;
				
				count++;
			}
			list[j+1] = x;
		}
		
		return count;
	}
}
