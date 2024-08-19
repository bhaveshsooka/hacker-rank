package DataStructures.Arrays;

import java.util.*;

public class SparseArrays
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] Strings = new String[n];
		for (int arr_i = 0; arr_i < n; arr_i++)
		{
			Strings[arr_i] = in.nextLine();
		}
		
		int q = Integer.parseInt(in.nextLine());
		for (int arr_i = 0; arr_i < q; arr_i++)
		{
			String CurrentQuery = in.nextLine();
			int Count = 0;
			for (int i = 0; i < Strings.length; i++)
			{
				if(Strings[i].equals(CurrentQuery))
					Count++;
			}
			System.out.println(Count);
		}
		
		
		in.close();
	}
}