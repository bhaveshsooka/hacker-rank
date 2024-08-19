package ProjectEuler;

import java.util.Scanner;

public class EvenFibonacciNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++)
		{
			long n = in.nextLong();

			long e0 = 0;
			long e1 = 2;
			long sum = 0;

			while (e1 <= n)
			{
				sum += e1;
				long e2 = 4 * e1 + e0;
				e0 = e1;
				e1 = e2;
			}
			System.out.println(sum);
		}
		
		in.close();
	}

}
