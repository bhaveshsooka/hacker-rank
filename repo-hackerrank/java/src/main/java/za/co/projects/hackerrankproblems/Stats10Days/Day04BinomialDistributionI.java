package Stats10Days;

import java.util.Scanner;

public class Day04BinomialDistributionI
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		String[] data = in.nextLine().split(" ");

		double ratio = Double.parseDouble(data[0]);
		double result = 0;

		double p = ratio / (ratio + Double.parseDouble(data[1]));
		double q = 1 - p;
		int n = 6;
		// int x = 3;

		for (int i = 3; i <= 6; i++)
		{
			double res = factorial(n) / (factorial(i) * factorial(n - i));

			res *= Math.pow(p, i);

			res *= Math.pow(q, n - i);

			result += res;
		}

		System.out.printf("%.3f", result);

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
