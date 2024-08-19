package Algorithms.Implementation;

import java.util.Scanner;

public class MiniMaxiSum
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		long min = Long.MAX_VALUE;
		long max = 0;
		long sum = 0;
		for (int i = 0; i < 5; i++)
		{
			long m = in.nextInt();
			if (m < min)
				min = m;
			if (m > max)
				max = m;
			sum += m;
		}
		
		System.out.println((sum - max) + " " + (sum - min));	
		
		in.close();
	}
}
