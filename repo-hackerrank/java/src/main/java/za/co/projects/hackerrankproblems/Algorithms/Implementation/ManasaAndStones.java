package Algorithms.Implementation;

import java.util.Scanner;

public class ManasaAndStones
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int n, a, b, first, diff;
		for (int i = 0; i < t; i++)
		{
			n = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			first = 0;
			if (a == b)
			{
				System.out.println((n - 1) * a + " ");
				continue;
			}
			if (a > b)
			{
				diff = a - b;
				first = (n - 1) * b;
			}
			else
			{
				diff = b - a;
				first = (n - 1) * a;
			}
			for (int j = 0; j < n; j++)
			{
				System.out.print((first + (j * diff)) + " ");
			}
			System.out.println();
		}
		
		in.close();
	}
}
