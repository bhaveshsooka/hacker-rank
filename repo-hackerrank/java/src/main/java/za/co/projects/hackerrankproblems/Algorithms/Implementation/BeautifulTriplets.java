package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulTriplets
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int d = in.nextInt();

		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
		{
			int t = in.nextInt();
			a.add(t);
		}

		int count = 0;
		for (int i = 0; i < n; i++)
		{
			if (a.contains(a.get(i) + d) && a.contains(a.get(i) + d + d))
				count++;
		}
		System.out.println(count);
		
		in.close();
	}
}
