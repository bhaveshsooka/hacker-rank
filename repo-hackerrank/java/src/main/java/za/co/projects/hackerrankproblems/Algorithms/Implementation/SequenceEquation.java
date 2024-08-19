package Algorithms.Implementation;

import java.util.Scanner;

public class SequenceEquation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] P = new int[n + 1];
		for (int i = 1; i < P.length; i++)
		{
			P[i] = in.nextInt();
		}
		
		for (int x = 1; x < P.length; x++)
		{
			int num = -1;
			for (int y = 1; y < P.length; y++)
			{
				if(P[P[y]] == x)
					num = y;//P[P[y]];
			}
			if(num > -1)
				System.out.println(num);
		}
		
		in.close();
	}
}
