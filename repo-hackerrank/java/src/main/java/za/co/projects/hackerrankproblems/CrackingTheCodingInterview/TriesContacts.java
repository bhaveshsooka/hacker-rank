package CrackingTheCodingInterview;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TriesContacts
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		TreeSet<String> contacts = new TreeSet<String>();

		for (int a0 = 0; a0 < n; a0++)
		{
			String op = in.next();
			String contact = in.next();

			if (op.compareTo("add") == 0)
				contacts.add(contact);
			else
			{
				int count = 0;

				if (contacts.contains(contact))
					count++;

				// Return the next element that's higher than contact.
				String name = contacts.higher(contact);

				if (name != null)
				{
					TreeSet<String> set = new TreeSet<String>();

					// Return a tail set starting with String elements
					// greater than contact.
					set = (TreeSet<String>) contacts.tailSet(name);

					Iterator<String> iter = set.iterator();

					while (iter.hasNext())
					{
						name = (String) iter.next();

						if (name.startsWith(contact))
							count++;
						else
							break;
					}
				}

				System.out.println(count);
			}
		}
		in.close();
	}
}