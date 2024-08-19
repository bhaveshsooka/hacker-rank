package Algorithms.Implementation;

import java.util.Scanner;

public class CavityMap
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[][] map = new int[n][n];
		String[][] cavity = new String[n][n];
		for (int i = 0; i < n; i++)
		{
			String line = in.next();
			for (int j = 0; j < n; j++)
			{
				map[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
				if(i == 0 || j == 0 || i == (n-1) || j == (n-1))
					cavity[i][j] = String.valueOf(map[i][j]);
			}
		}
		
		for (int i = 1; i < map.length-1; i++)
		{
			for (int j = 1; j < map.length-1; j++)
			{
				int centre = map[i][j];
				int left = map[i-1][j];
				int right = map[i+1][j];
				int up = map[i][j-1];
				int down = map[i][j+1];
				if( (centre > left) && (centre > right) && (centre > up) && (centre > down))
					cavity[i][j] = "X";
				else
					cavity[i][j] = String.valueOf(map[i][j]);
			}
		}
		for (int i = 0; i < cavity.length; i++)
		{
			for (int j = 0; j < cavity.length; j++)
			{
				System.out.print(cavity[i][j]);
			}
			System.out.println("");
		}
		
		

		in.close();
	}
}
