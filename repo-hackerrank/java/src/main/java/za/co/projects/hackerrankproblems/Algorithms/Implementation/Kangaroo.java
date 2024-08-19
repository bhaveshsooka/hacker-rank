package Algorithms.Implementation;

import java.util.Scanner;

public class Kangaroo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();

		int x2 = in.nextInt();
		int v2 = in.nextInt();

		int dist1 = x1 + v1;
		int dist2 = x2 + v2;
		
		while (!(dist1 == dist2) && dist1 > 0 && dist2 > 0)
		{
			dist1 += v1;
			dist2 += v2;
			if (dist1 >= dist2)
				break;
		}
		if (dist1 == dist2)
			System.out.println("YES");
		else
			System.out.println("NO");

		in.close();
	}
}
