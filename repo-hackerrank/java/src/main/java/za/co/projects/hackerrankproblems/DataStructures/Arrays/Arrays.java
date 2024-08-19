package DataStructures.Arrays;

import java.util.*;

public class Arrays
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
		String out = "";
		for (int arr_i = n - 1; arr_i >= 0; arr_i--)
		{
			out += arr[arr_i] + " ";
		}
		System.out.println(out.trim());
		in.close();
	}
}