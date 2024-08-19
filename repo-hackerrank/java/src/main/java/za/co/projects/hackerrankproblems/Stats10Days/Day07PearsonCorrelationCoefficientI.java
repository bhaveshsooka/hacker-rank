package Stats10Days;

import java.util.Scanner;

public class Day07PearsonCorrelationCoefficientI
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double sumX = 0;
		double sumY = 0;
		double meanX = 0;
		double meanY = 0;
		double stdX = 0;
		double stdY = 0;

		double PearsonNumerator = 0;
		double PearsonDenominator = 0;

		int n = in.nextInt();
		double[] X = new double[n];
		double[] Y = new double[n];
		for (int i = 0; i < n; i++)
		{
			X[i] = in.nextDouble();
			sumX += X[i];
		}
		for (int i = 0; i < n; i++)
		{
			Y[i] = in.nextDouble();
			sumY += Y[i];
		}

		// Means
		meanX = sumX / (double) n;
		meanY = sumY / (double) n;

		// Standard Deviations
		for (int i = 0; i < n; i++)
		{
			stdX += Math.pow(X[i] - meanX, 2);
			stdY += Math.pow(Y[i] - meanY, 2);

			PearsonNumerator += (X[i] - meanX) * (Y[i] - meanY);
		}
		stdX = Math.sqrt((stdX / (double) n));
		stdY = Math.sqrt((stdY / (double) n));

		//Pearson Correlation Coefficient
		PearsonDenominator = stdX * stdY * ((double) n);

		double PearsonCorrelationCoefficient = PearsonNumerator / PearsonDenominator;
		System.out.printf("%.3f", PearsonCorrelationCoefficient);

		in.close();
	}
}
