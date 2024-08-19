package Stats10Days;

import java.util.Scanner;

public class Day04GeometricDistributionII
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double result = 0;

		String[] ratio = in.nextLine().split(" ");
		int n = in.nextInt();

		for (int i = 1; i <= n; i++)
		{
			double p = Double.parseDouble(ratio[0]) / Double.parseDouble(ratio[1]);
			double q = 1 - p;

			double res = Math.pow(q, i - 1);
			res *= p;
			
			result += res;
		}

		System.out.printf("%.3f", result);

		in.close();
	}
}
