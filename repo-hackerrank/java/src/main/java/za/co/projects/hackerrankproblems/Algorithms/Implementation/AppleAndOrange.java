package Algorithms.Implementation;

import java.util.Scanner;
/*
 * 7 11
 * 5 15
 * 3 2
 * -2 2 1
 * 5 -6
 * */
public class AppleAndOrange
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		
		//apple
		int apple_count = 0;
		for (int i = 0; i < m; i++)
		{
			int apple = in.nextInt();
			if( ((apple + a) >= s) && ((apple + a) <= t) )
				apple_count++;
		}
		
		//orange
		int orange_count = 0;
		for (int i = 0; i < n; i++)
		{
			int orange = in.nextInt();
			if( ((orange + b) >= s) && ((orange + b) <= t) )
				orange_count++;
		}
		
		System.out.println(apple_count);
		System.out.println(orange_count);
		
		in.close();
	}
}
