package Algorithms.Implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ACM_ICPCTeam
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextInt();
		BigInteger topic[] = new BigInteger[n];
		for (int topic_i = 0; topic_i < n; topic_i++)
		{
			topic[topic_i] = new BigInteger(in.next(), 2);

		}
		int max = 0;
		int count = 0;
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				int v = topic[i].or(topic[j]).bitCount();
				if (v > max)
				{
					count = 0;
					max = v;
				}
				if (v == max)
					count++;
			}
		}

		System.out.println(max);
		System.out.println(count);

		in.close();
	}


}
