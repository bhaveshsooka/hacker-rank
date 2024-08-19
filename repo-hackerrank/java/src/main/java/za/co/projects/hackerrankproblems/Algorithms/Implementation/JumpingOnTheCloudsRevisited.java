package Algorithms.Implementation;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++)
		{
			c[c_i] = in.nextInt();
		}
		
		int E = 100;
		int cloud = (0 +k) % n;
		if(c[cloud] == 1)
			E-=3;
		else
			E--;
		while(cloud != 0)
		{
			//System.out.println("c = " + cloud + " energy = " + E);
			cloud = (cloud +k) % n;
			if(c[cloud] == 1)
				E-=3;
			else
				E--;
		}
		System.out.println(E);
		
		in.close();
	}
}
