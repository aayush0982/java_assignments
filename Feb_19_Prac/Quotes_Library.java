/*
 Problem Statement
Create a Java console-based application called Digital Library for Quotes & Sayings that
uses file handling to store and manage a collection of quotes. All quotes must be saved in a
text file named quotes.txt. The system should allow users to add quotes, view all quotes,
search quotes by keyword, sort quotes alphabetically, and generate a random “Quote of the
Day”.

Functional Requirements

1. Add a New Quote
• The user should be able to enter a quote.
• The program must append the quote to quotes.txt.
• Display a confirmation message after saving.

2. View All Quotes
• The program should read all lines from quotes.txt.
• Display every quote to the user, one per line.

3. Search Quotes by Keyword
• The user should enter a keyword.
• The program must search the file (case-insensitive).
• Display all quotes that contain the keyword.
• If no quote matches, display “No results found.”

4. Sort Quotes Alphabetically
• Read all quotes from quotes.txt.
• Sort them alphabetically (A to Z).
• Display the sorted list.
• (Optional) Update quotes.txt with the sorted list.

5. Generate “Quote of the Day”
• Select a random quote from quotes.txt.
• Display it as the “Quote of the Day”.
Expected Output Examples
Adding a Quote
Enter quote: The purpose of our lives is to be happy.
Quote added successfully!
Viewing All Quotes

---- All Quotes ----
1. Believe you can and you're halfway there.
2. The purpose of our lives is to be happy.
3. Stay hungry, stay foolish.
Searching by Keyword
Enter keyword: stay
---- Search Results ----
Stay hungry, stay foolish.
Alphabetical Sorting
---- Sorted Quotes ----
1. Believe you can and you're halfway there.
2. Stay hungry, stay foolish.
3. The purpose of our lives is to be happy.
Quote of the Day
---- Quote of the Day ----
Stay hungry, stay foolish
 */

package Feb_19_Prac;

import java.util.*;
import java.io.*;

class LibQoutes {
	File f;

	LibQoutes() {
		f = new File("Quotes.txt");
	}

	void addQuotes(String quote) {
		try {
			FileWriter fw = new FileWriter(f, true);
			fw.append(quote + "\n");
			fw.close();
			System.out.println("Successfully Written in the file");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	void viewAllQuote() {
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String temp = sc.nextLine();
				System.out.println(temp);
			}
			sc.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	void searchQuote(String word) {
		try {
			Scanner sc = new Scanner(f);
			boolean found = false;
			while (sc.hasNextLine()) {
				String temp = sc.nextLine();
				if ((temp.toLowerCase()).contains((word.toLowerCase()))) {
					found = true;
					System.out.println(temp);
				}
			}
			if (!found) {
				System.out.println("Can't Find The Quote Starting With: " + word);
			}
			sc.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	ArrayList<String> sortQuotes() {
		ArrayList<String> list = new ArrayList<>();
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String temp = sc.nextLine();
				list.add(temp);
			}
			sc.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		list.sort((a, b) -> a.compareTo(b));
		return list;
	}

	void quoteOfTheDay(List<String> list) {
		int n = (int) Math.round(list.size()*1.0) * 1000;
		n = n % list.size();
		System.out.println("Quote of the day is: " + list.get(n));
	}
}

public class Quotes_Library {
	public static void main(String[] args) {
		LibQoutes lb = new LibQoutes();
		lb.addQuotes("Believe you can and you're halfway there.");
		lb.addQuotes("The purpose of our lives is to be happy.");
		lb.addQuotes("Stay hungry, stay foolish.");

		lb.searchQuote("stay");
		lb.searchQuote("saty");

		ArrayList<String> list = lb.sortQuotes();
		for (String i : list) {
			System.out.println(i);
		}

		lb.quoteOfTheDay(list);
		
		try {
			new FileWriter(lb.f).close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
