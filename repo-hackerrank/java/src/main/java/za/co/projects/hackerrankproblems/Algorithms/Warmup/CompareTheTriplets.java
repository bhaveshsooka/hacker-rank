package Algorithms.Warmup;

import java.util.Scanner;

public class CompareTheTriplets
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] A = in.nextLine().split(" ");
		String[] B = in.nextLine().split(" ");
		int ScoreA = 0;
		int ScoreB = 0;
		
		for (int i = 0; i < A.length; i++)
		{
			int a = Integer.parseInt(A[i]);
			int b = Integer.parseInt(B[i]);
			if(a < b)
				ScoreB++;
			else if(b < a)
				ScoreA++;
			else
				continue;
		}
		System.out.println(ScoreA + " " + ScoreB);
		
		in.close();
	}
}
