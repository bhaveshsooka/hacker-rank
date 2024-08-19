package Stats10Days;

import java.util.Scanner;

public class Day05NormalDistributionI
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double mean = in.nextDouble();
		double standardDeviation = in.nextDouble();
		double x = in.nextDouble();
		int lower = in.nextInt();
		int higher = in.nextInt();

		double LessThan9dot5 = 0.5 * (1 + erf((x - mean) / (standardDeviation * Math.sqrt(2))));

		double Between20And22 = 0.5 * (1 + erf((higher - mean) / (standardDeviation * Math.sqrt(2))));
		Between20And22 -= 0.5 * (1 + erf((lower - mean) / (standardDeviation * Math.sqrt(2))));

		System.out.printf("%.3f\n", LessThan9dot5);
		System.out.printf("%.3f\n", Between20And22);

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
