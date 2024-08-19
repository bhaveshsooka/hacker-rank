package Algorithms.Implementation;

import java.util.Scanner;

public class ServiceLane
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] Firstline = in.nextLine().split(" ");
		int n = Integer.parseInt(Firstline[0]);
		int t = Integer.parseInt(Firstline[1]);

		String[] swidth = in.nextLine().split(" ");
		int width[] = new int[n];
		for (int width_i = 0; width_i < n; width_i++)
		{
			width[width_i] = Integer.parseInt(swidth[width_i]);
		}
		for (int a0 = 0; a0 < t; a0++)
		{
			String[] line = in.nextLine().split(" ");
			int i = Integer.parseInt(line[0]);
			int j = Integer.parseInt(line[1]);
			int min = width[i];
			for (int k = i; k <= j; k++)
			{
				if (width[k] < min)
					min = width[k];
			}
			System.out.println(min);
		}

		in.close();
	}
}
