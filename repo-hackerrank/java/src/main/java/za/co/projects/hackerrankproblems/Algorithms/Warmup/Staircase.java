package Algorithms.Warmup;

import java.util.Scanner;

public class Staircase
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		for (int i = 1; i <= n; i++)
		{
			String res = "";
			int diff = n - i;
			for (int j = 0; j < diff; j++)
			{
				res += " ";
			}
			
			for (int j = 0; j < i; j++)
			{
				res += "#";
			}
			System.out.println(res);
		}
		
		in.close();
	}
}
