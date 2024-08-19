package Stats10Days;

import java.util.Scanner;

public class Day06TheCentralLimitTheoremIII
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double num = in.nextDouble();
		double mean = in.nextDouble();
		double standardDeviation = in.nextDouble();
		@SuppressWarnings("unused")
		double distributionPercentage = in.nextDouble();
		double z = in.nextDouble();
		
		double errorRate = z * (standardDeviation / Math.sqrt(num));
		
		double A = mean - errorRate;
		double B = mean + errorRate;

		System.out.printf("%.2f\n", A);
		System.out.printf("%.2f", B);

		in.close();
	}
}
