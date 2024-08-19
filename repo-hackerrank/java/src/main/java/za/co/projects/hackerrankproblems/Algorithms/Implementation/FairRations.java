package Algorithms.Implementation;

import java.util.Scanner;

public class FairRations
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int B[] = new int[n];
		for (int i = 0; i < n; i++)
			B[i] = in.nextInt();
		int bread = 0;
		for (int i = 0; i < n; i++)
			if (B[i] % 2 == 1)
			{
				bread += 2;
				B[i]++;
				if (i < n - 1)
					B[i + 1]++;
				else
				{
					System.out.println("NO");
					in.close();
					return;
				}
			}
		System.out.println(bread);
		
		in.close();
	}
}
