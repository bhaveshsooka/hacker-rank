package CrackingTheCodingInterview;

import java.util.Scanner;

public class TimeComplexityPrimality
{
	static String isPrime(int n)
	{
		if(n <= 1)
			return "Not prime";
		if(n == 2)
			return "Prime";
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n % i == 0)
				return "Not prime";
		}
		return "Prime";
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		for (int a0 = 0; a0 < p; a0++)
		{
			int n = in.nextInt();
			System.out.println(isPrime(n));
		}
		
		in.close();
	}
}
