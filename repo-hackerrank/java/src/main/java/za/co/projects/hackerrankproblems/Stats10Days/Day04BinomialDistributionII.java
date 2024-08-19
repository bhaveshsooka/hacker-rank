package Stats10Days;

import java.util.Scanner;

public class Day04BinomialDistributionII
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		String[] data = in.nextLine().split(" ");
		double atLeast2 = 0;
		double atMost2 = 0;

		double p = Double.parseDouble(data[0]) / 100.0;
		double q = 1 - p;
		
		int n = Integer.parseInt(data[1]);

		for (int i = 2; i <= n; i++)
		{
			double res = factorial(n) / (factorial(i) * factorial(n - i));

			res *= Math.pow(p, i);

			res *= Math.pow(q, n - i);

			atLeast2 += res;
		}
		
		for (int i = 0; i <= 2; i++)
		{
			double res = factorial(n) / (factorial(i) * factorial(n - i));

			res *= Math.pow(p, i);

			res *= Math.pow(q, n - i);

			atMost2 += res;
		}

		System.out.printf("%.3f", atMost2);
		System.out.printf("%.3f\n", atLeast2);

		in.close();
	}

	static double factorial(int n)
	{
		if(n == 0)
			return 1;
		if (n == 1)
			return 1;
		return factorial(n - 1) * n;
	}
}
