package Algorithms.Implementation;

import java.util.Scanner;

public class LisasWorkbook
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int special_prob_count = 0;
		int page = 1;
		
		for (int i = 0; i < n; i++)
		{
			int t = in.nextInt();
			for (int problem = 1; problem <= t; problem++)
			{
				if(page == problem)
					special_prob_count++;
				if(problem % k == 0)
					page++;
			}
			if(t % k != 0)
				page++;
		}
		System.out.println(special_prob_count);

		in.close();
	}
}
