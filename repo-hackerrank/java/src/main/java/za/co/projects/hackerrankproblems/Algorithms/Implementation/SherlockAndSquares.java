package Algorithms.Implementation;

import java.util.Scanner;

public class SherlockAndSquares
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		String[] arr = new String[t];
		for (int i = 0; i < t; i++)
		{
			String line = in.nextLine();
			arr[i] = line;
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			String[] line = arr[i].split(" ");
			double high = Math.floor(Math.sqrt(Integer.parseInt(line[1])));
			double low = Math.ceil(Math.sqrt(Integer.parseInt(line[0])));
			int count = (int) (high - low + 1);
			System.out.println(count);
		}

		in.close();
	}
}
