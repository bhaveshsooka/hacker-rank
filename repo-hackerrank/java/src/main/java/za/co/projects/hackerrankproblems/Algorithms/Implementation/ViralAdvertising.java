package Algorithms.Implementation;

import java.util.Scanner;

public class ViralAdvertising
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int PeopleWhoLiked = 0;
		int total = 0;
		int NumAtStartOfDay = 5;
		while(n-- > 0)
		{
			PeopleWhoLiked = (int) Math.floor(NumAtStartOfDay / 2);
			NumAtStartOfDay = PeopleWhoLiked * 3;
			total += PeopleWhoLiked;
			PeopleWhoLiked = 0;
		}
		System.out.println(total);

		in.close();
	}
}
