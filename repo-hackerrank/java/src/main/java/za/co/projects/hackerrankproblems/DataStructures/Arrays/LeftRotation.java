package DataStructures.Arrays;

import java.util.Scanner;

public class LeftRotation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int skipPart[] = new int[d];
		int j = 0;
        for (int i = 0; i < n; i++)
        {
            if (i >= d)
            {
                System.out.print(in.nextInt() + " ");
            } 
            else 
            {
                skipPart[j] = in.nextInt();
                j++;
            }
        }
        for (int i = 0; i < skipPart.length; i++) 
        {
            System.out.print(skipPart[i] + " ");
        }
		
		in.close();
	}
}
