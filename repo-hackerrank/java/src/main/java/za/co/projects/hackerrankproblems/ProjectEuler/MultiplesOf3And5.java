package ProjectEuler;

import java.util.Scanner;

public class MultiplesOf3And5
{
	public static void main(String[] args)
	{
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		for (int c = 0; c < cases; c++)
		{
			long Num = Long.parseLong(in.nextLine());
			long result = SumDivisbleBy(3, Num - 1) + SumDivisbleBy(5, Num - 1) - SumDivisbleBy(15, Num - 1);
			System.out.println(result);
		}
		in.close();
	}

	public static long SumDivisbleBy(long n, long p)
	{
		return n * (p / n) * ((p / n) + 1) / 2;
	}
}
