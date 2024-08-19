package Stats10Days;

import java.util.Scanner;

public class Day06TheCentralLimitTheoremII
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double maxTickets = in.nextDouble();
		double numstudents = in.nextDouble();
		double mean = in.nextDouble();
		double standardDeviation = in.nextDouble();

		double res = cumulative(mean * numstudents, standardDeviation * Math.sqrt(numstudents), maxTickets);

		System.out.printf("%.4f", res);
		
		in.close();
	}

	public static double cumulative(double mean, double std, double x)
	{
		double parameter = (x - mean) / (std * Math.sqrt(2));
		return (0.5) * (1 + erf(parameter));
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
