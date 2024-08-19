package Algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class TheBombermanGame
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int n = s.nextInt();
		s.nextLine();

		int totalCount = r * c;

		char[] fullBoard = new char[totalCount];
		Arrays.fill(fullBoard, 'O');

		char[] board = new char[totalCount];
		for (int i = 0, count = 0; i < r; i++)
		{
			String line = s.nextLine();
			for (int j = 0; j < c; j++)
			{
				board[count] = line.charAt(j);
				count++;
			}
		}
		
		s.close();
		
		if (n == 1)
			System.out.println(printBoard(board, c));
		else if (n % 2 == 0)
			System.out.println(printBoard(fullBoard, c));
		else if ((n + 1) % 4 == 0)
		{
			markForExplosion(board, r, c);
			complement(board);
			System.out.println(printBoard(board, c));
		}
		else
		{
			markForExplosion(board, r, c);
			complement(board);
			markForExplosion(board, r, c);
			complement(board);
			System.out.println(printBoard(board, c));
		}

	}

	public static void complement(char[] board)
	{
		for (int i = 0; i < board.length; i++)
			if (board[i] == 'O' || board[i] == 'x')
				board[i] = '.';
			else
				board[i] = 'O';
	}

	public static boolean isBomb(char[] board, int pos)
	{
		return board[pos] == 'O';
	}

	public static void markForExplosion(char[] board, int rows, int cols)
	{
		for (int i = 1; i <= board.length; i++)
		{
			// Bomb
			if (board[i - 1] == 'O')
			{
				if (i % cols != 0 && cols > 1 && board[i] != 'O')
					board[i] = 'x';
				if (i % cols != 1 && cols > 1 && board[i - 2] != 'O')
					board[i - 2] = 'x';
				if (((double) i / cols) > 1 && rows > 1 && board[i - cols - 1] != 'O')
					board[i - cols - 1] = 'x';
				if (((double) i / cols) <= (rows - 1) && rows > 1 && board[i - 1 + cols] != 'O')
					board[i - 1 + cols] = 'x';
			}
		}
	}

	public static String printBoard(char[] board, int lineLength)
	{
		int total = board.length;
		String output = "";
		for (int i = 1; i <= total; i++)
		{
			output += board[i - 1];
			if (i != total && (i % lineLength == 0))
				output += "\n";
		}
		return output;
	}
}
