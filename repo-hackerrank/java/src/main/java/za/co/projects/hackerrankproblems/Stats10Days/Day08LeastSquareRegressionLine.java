package Stats10Days;

import java.util.Scanner;

public class Day08LeastSquareRegressionLine
{
	public static void main(String[] args)
	{
		double a = 0, b = 0;

		double sumX = 0;
		double sumY = 0;
		double meanX = 0;
		double meanY = 0;
		double stdX = 0;
		double stdY = 0;

		Scanner in = new Scanner(System.in);
		double[] X = new double[5];
		double[] Y = new double[5];
		for (int i = 0; i < 5; i++)
		{
			X[i] = in.nextDouble();
			sumX += X[i];

			Y[i] = in.nextDouble();
			sumY += Y[i];
		}

		meanX = sumX / 5.0;
		meanY = sumY / 5.0;

		// Means

		// Standard Deviations
		for (int i = 0; i < 5; i++)
		{
			stdX += Math.pow(X[i] - meanX, 2);
			stdY += Math.pow(Y[i] - meanY, 2);
		}
		stdX = Math.sqrt((stdX / 5.0));
		stdY = Math.sqrt((stdY / 5.0));

		b = PearsonCorrelationCoefficient(X, Y, meanX, meanY, stdX, stdY) * ((stdY / stdX));
		a = meanY - (b * meanX);
		
		double y = a + (b*80);
		
		System.out.printf("%.3f", y);

		in.close();
	}

	static double PearsonCorrelationCoefficient(double[] X, double[] Y, double meanX, double meanY, double stdX, double stdY)
	{
		double PearsonNumerator = 0;
		double PearsonDenominator = 0;

		int n = X.length;

		// Pearson Numerator
		for (int i = 0; i < n; i++)
		{
			PearsonNumerator += (X[i] - meanX) * (Y[i] - meanY);
		}

		// Pearson Correlation Coefficient
		PearsonDenominator = stdX * stdY * ((double) n);

		double PearsonCorrelationCoefficient = PearsonNumerator / PearsonDenominator;
		return PearsonCorrelationCoefficient;
	}
}
