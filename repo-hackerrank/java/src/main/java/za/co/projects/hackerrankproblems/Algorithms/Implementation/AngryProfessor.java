package Algorithms.Implementation;

import java.util.Scanner;

public class AngryProfessor
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++)
		{
			int N = in.nextInt();
			int K = in.nextInt();
			int[] A = new int[N];
			int count = 0;
			for (int j = 0; j < N; j++)
			{
				A[j] = in.nextInt();
				if (A[j] <= 0)
					count++;
			}
			if (count < K)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		in.close();
	}
}
