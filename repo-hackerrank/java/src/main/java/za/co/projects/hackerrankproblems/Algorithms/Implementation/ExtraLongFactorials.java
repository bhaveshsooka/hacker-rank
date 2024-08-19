package Algorithms.Implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(factorial(n));
		
		in.close();
	}

	public static BigInteger factorial(int n)
	{
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i < n + 1; i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}
