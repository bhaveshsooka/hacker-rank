package Stats10Days;

import java.util.Scanner;

public class Day05PoissonDistributionII
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] data = in.nextLine().split(" ");
		
		double lambdaA = Double.parseDouble(data[0]);
		double lambdaB = Double.parseDouble(data[1]);

		double costA = lambdaA + (lambdaA*lambdaA);
		double costB = lambdaB + (lambdaB*lambdaB);
		
		costA = 160 + (40 * costA);
		costB = 128 + (40 * costB);
		
		System.out.printf("%.3f\n", costA);
		System.out.printf("%.3f", costB);

		in.close();
	}
}
