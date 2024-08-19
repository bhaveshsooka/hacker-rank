package Algorithms.Implementation;

import java.util.Scanner;

public class DesignerPDFViewer
{
	/*
	 * 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
	 * abc
	 * */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
					'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		int n = 26;
		int[] h = new int[n];
		for (int i = 0; i < n; i++)
		{
			h[i] = in.nextInt();
		}
		String word = in.next();
		int maxheight = 0;
		for (int c : word.toCharArray())
		{
			int idx = -1;
			for (int i = 0; i < alphabet.length; i++)
			{
				if(c == alphabet[i])
				{
					idx = i;
					break;
				}
			}
			if(idx != -1)
			{
				if(h[idx] > maxheight)
					maxheight = h[idx];
			}
		}
		System.out.println(maxheight * word.length());
		
		in.close();
	}
}
