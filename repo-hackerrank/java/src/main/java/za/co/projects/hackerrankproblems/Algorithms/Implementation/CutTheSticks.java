package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class CutTheSticks
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++)
		{
			arr[arr_i] = in.nextInt();
		}
		while (true)
		{
			/*-------------------------------------*/
			//Terminating case
			/*-------------------------------------*/
			int count = 0;
			for (int i = 0; i < arr.length; i++)
			{
				if (arr[i] == 0)
					count++;
			}
			if (count == arr.length)
				break;
			
			/*-------------------------------------*/
			//Get Min
			/*-------------------------------------*/
			int min = 1001;
			for (int i = 0; i < arr.length; i++)
			{
				if (arr[i] < min && arr[i] != 0)
					min = arr[i];
			}
			
			/*-------------------------------------*/
			//Get Number Of Sticks Cut
			/*-------------------------------------*/
			count = 0;
			for (int i = 0; i < arr.length; i++)
			{
				if (arr[i] != 0)
				{
					arr[i] -= min;
					count++;
				}
			}
			System.out.println(count);
		}

		in.close();
	}

	public static int Cut_The_Sticks(ArrayList<Integer> List, int cutops)
	{
		if (List.isEmpty())
			return cutops;
		int min = List.get(0);
		for (int i = 0; i < List.size(); i++)
		{
			if (List.get(i) < min)
				min = List.get(i);
		}
		int count = 0;
		for (int i = 0; i < List.size(); i++)
		{
			List.set(i, List.get(i) - min);

			if (List.get(i) == 0)
				List.remove(i);
			count++;
		}
		System.out.println(count - 1);
		cutops++;
		return Cut_The_Sticks(List, cutops);
	}
}
