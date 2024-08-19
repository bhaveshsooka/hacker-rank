package Stats10Days;

import java.util.Scanner;

public class Day05NormalDistributionII
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double mean = in.nextDouble();
		double standardDeviation = in.nextDouble();

		double x = in.nextDouble();
		double MoreThan80 = 0.5 * (1 + erf((x - mean) / (standardDeviation * Math.sqrt(2))));
		MoreThan80 = 100 * (1 - MoreThan80);

		x = in.nextDouble();
		double MoreThan60 = 0.5 * (1 + erf((x - mean) / (standardDeviation * Math.sqrt(2))));
		MoreThan60 = 100 * (1 - MoreThan60);

		double Failed = 0.5 * (1 + erf((x - mean) / (standardDeviation * Math.sqrt(2))));
		Failed = 100 * Failed;

		System.out.printf("%.2f\n", MoreThan80);
		System.out.printf("%.2f\n", MoreThan60);
		System.out.printf("%.2f", Failed);

		in.close();
	}

	static double erf(double z)
	{
		double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

		// use Horner's method
		double ans = 1 - t * Math.exp(-z * z - 1.26551223 + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807 + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * (0.17087277))))))))));
		if (z >= 0)
			return ans;
		else
			return -ans;
	}
}
