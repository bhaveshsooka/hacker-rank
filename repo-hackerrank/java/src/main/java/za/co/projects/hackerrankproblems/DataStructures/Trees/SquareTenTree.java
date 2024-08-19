package DataStructures.Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareTenTree
{
	static class pair
	{
		int		i;
		String	s;

		public pair(int integer, String str)
		{
			i = integer;
			s = str;
		}
	}

	static int		N	= 1 << 22;
	static boolean	borrow_flag;

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		String L = in.nextLine();
		String R = in.nextLine();
		//System.out.println("here");
		String sL = repeat_string("0", N - L.length()) + L;
		String sR = repeat_string("0", N - R.length()) + R;
		
		char[] cL = reverse(sL).toCharArray();
		char[] cR = reverse(sR).toCharArray();

		decrement(cL, 0);
		
		ArrayList<pair> ans_l = new ArrayList<pair>(), ans_r = new ArrayList<pair>();
		for (int d = 0; d <= 20; d++)
		{
			
			String prev_L = L;
			String prev_R = R;

			move_next(cL, power2(d + 1));
			move_prev(cR, power2(d + 1));
			
			String tmp = subtract(R, L);
			if(borrow_flag || normalize(tmp).equals("0"))
			{
				String num = normalize(subtract(prev_R, prev_L).substring(power2(d)));
				if(!num.equals("0"))
					ans_l.add(new pair(d, num));
				break;
			}
			else
			{
				String num_l = normalize(subtract(L, prev_L).substring(power2(d)));
				String num_r = normalize(subtract(prev_R, R).substring(power2(d)));
	            if (num_l != "0")
	            	ans_l.add(new pair(d, num_l));
	            if (num_r != "0") 
	            	ans_r.add(new pair(d, num_r));
			}
		}
		
		ans_r = reverse(ans_r); 
	    for (pair p : ans_r)
			ans_l.add(p);
	    
	    System.out.println(ans_l.size());
	    for (pair x : ans_l) 
	    	System.out.println(x.i + " " + x.s );

		in.close();
	}

	static String normalize(String a)
	{
		int i = a.length() - 1;
		while (i >= 0 && a.charAt(i) == '0')
			i--;
		if (i == -1)
			return "0";
		a = a.substring(0, i + 1);
		String res = reverse(a);
		return res;
	}

	static void increment(char[] s, int k)
	{
		for (int i = k; i < s.length; i++)
		{
			s[i]++;
			if ((s[i] - '0') == 10)
				s[i] -= 10;
			else
				break;
		}
	}

	static void decrement(char[] s, int k)
	{
		for (int i = k; i < s.length; i++)
		{
			s[i]--;
			if ((s[i] - '0') < 0)
				s[i] += 10;
			else
				break;
		}
	}

	static void move_next(char[] s, int pos)
	{
		boolean any = false;
		for (int i = 0; i < pos; i++)
		{
			any |= s[i] != '0';
			s[i] = '0';
		}
		if (any)
			increment(s, pos);
	}

	static void move_prev(char[] s, int pos)
	{
		// boolean any = false;
		for (int i = 0; i < pos; i++)
		{
			// any |= s[i] != '0';
			s[i] = '0';
		}
	}

	static String subtract(String a, String b)
	{
		char[] aChar = a.toCharArray();
		char[] bChar = b.toCharArray();

		int borrow = 0;
		for (int i = 0; i < aChar.length; i++)
		{
			aChar[i] -= (bChar[i] - '0') + borrow;
			if (aChar[i] < '0')
			{
				aChar[i] += 10;
				borrow = 1;
			}
			else
				borrow = 0;
		}
		if (borrow == 1)
			borrow_flag = true;
		else
			borrow_flag = false;
		return aChar.toString();
	}

	static int power2(int d)
	{
		if (d == 0)
			return 0;
		return 1 << (d - 1);
	}

	static String reverse(String a)
	{
		String res = "";
		int i = a.length() - 1;
		while (i >= 0)
		{
			res += a.charAt(i);
			i--;
		}
		return res;
	}
	
	static ArrayList<pair> reverse(ArrayList<pair> list)
	{
		ArrayList<pair> res = new ArrayList<pair>();
		for(int i = list.size() -1; i >= 0; i--)
		{
			res.add(list.get(i));
		}
		return res;
	}

	static String repeat_string(String a, int num)
	{
		String res = "";
		for (int i = 0; i < num; i++)
		{
			res += a;
		}
		return res;
	}
}
