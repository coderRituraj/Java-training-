package Com.bhavna.task1;

import java.util.*;

public class BookMain {

	public static void main(String[] args) {

		HashSet<BookDetails> hs = new HashSet<BookDetails>();
		hs.add(new BookDetails(1, "Ramayan", 1000, "Balmiki"));
		hs.add(new BookDetails(2, "Gita", 434, "Balmiki"));
		hs.add(new BookDetails(3, "Meluha", 133, "Amish"));
		hs.add(new BookDetails(4, "Sita The Warrior", 753, "Amish"));
		hs.add(new BookDetails(5, "Power of Now", 948, "Richard"));
		hs.add(new BookDetails(6, "Mindset", 132, "Paul"));
		hs.add(new BookDetails(7, "Psychology of money", 532, "tom cury"));
		hs.add(new BookDetails(8, "Silence", 231, "Kalam"));
		hs.add(new BookDetails(9, "Who move my maze", 134, "R.s"));
		hs.add(new BookDetails(10, "Now", 131, "Mind"));

		System.out.println("Book_ID\tName\t\t\tPrice\tAuthor");
		for (BookDetails b : hs) {
			b.display();
		}
		System.out.println();

		List<BookDetails> lst = new ArrayList<BookDetails>(hs);
		Collections.sort(lst);
		System.out.println("Book_ID\tName\t\t\tPrice\tAuthor");
		for (BookDetails b : lst) {
			b.display();

		}

	}
}
