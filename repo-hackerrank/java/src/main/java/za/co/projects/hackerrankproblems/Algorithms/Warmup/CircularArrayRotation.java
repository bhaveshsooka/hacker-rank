package Algorithms.Warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class CircularArrayRotation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < 76; i++)
		{
			list.add(in.nextInt());
			sum += list.get(i);
		}

		for (int i = 0; i < list.size(); i++)
		{
			for (int j = 0; j < list.size(); j++)
			{
				if(i == j)
					continue;
				if(list.get(i) + list.get(j) == 17217)
					System.out.println(list.get(i) + " " + list.get(j));
			}
		}

		System.out.println(sum);

		in.close();
	}
}
