package Algorithms.Implementation;

import java.util.Scanner;

public class SockMerchant
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		
		int n = in.nextInt();
		int c[] = new int[n];		
		for (int c_i = 0; c_i < n; c_i++)
		{
			c[c_i] = in.nextInt();
		}

		boolean[] checked = new boolean[n];
		int count = 0;
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				if(i == j)
					continue;
				if( (c[i] == c[j]) && (checked[i] == false) && (checked[j] == false) ) 
				{
					checked[i] = true;
					checked[j] = true;
					count++;
				}
			}
		}
		System.out.println(count);
		in.close();
	}
}
