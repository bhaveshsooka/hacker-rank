package CrackingTheCodingInterview;

import java.util.Scanner;

public class DFSConnectedCellInAGrid
{
	public static int getBiggestRegion(int[][] matrix)
	{
		int[][] alreadyVisited = new int[matrix.length][matrix[0].length];
		
		int bigRegion = 0;
		int size = 0;
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[0].length; col++)
			{
				if (alreadyVisited[row][col] == 0)
				{
					size = getRegionSize(matrix, alreadyVisited, row, col);
					bigRegion = Math.max(bigRegion, size);
				}
			}
		}
		return bigRegion;
	}

	static int getRegionSize(int[][] matrix, int[][] alreadyVisited, int row, int col)
	{
		if (row >= matrix.length || col >= matrix[0].length || row < 0 || col < 0)
			return 0;
		if (alreadyVisited[row][col] == 1)
			return 0;
		alreadyVisited[row][col] = 1;

		if (matrix[row][col] == 0)
			return 0;

		int count = 0;
		if (matrix[row][col] == 1)
			count = 1;
		count += getRegionSize(matrix, alreadyVisited, row + 1, col);
		count += getRegionSize(matrix, alreadyVisited, row, col + 1);
		count += getRegionSize(matrix, alreadyVisited, row + 1, col + 1);
		count += getRegionSize(matrix, alreadyVisited, row - 1, col);
		count += getRegionSize(matrix, alreadyVisited, row, col - 1);
		count += getRegionSize(matrix, alreadyVisited, row - 1, col - 1);
		count += getRegionSize(matrix, alreadyVisited, row - 1, col + 1);
		count += getRegionSize(matrix, alreadyVisited, row + 1, col - 1);
		return count;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int grid[][] = new int[n][m];
		for (int grid_i = 0; grid_i < n; grid_i++)
		{
			for (int grid_j = 0; grid_j < m; grid_j++)
			{
				grid[grid_i][grid_j] = in.nextInt();
			}
		}
		System.out.println(getBiggestRegion(grid));

		in.close();
	}
}
