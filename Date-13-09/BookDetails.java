/*
 Write program to create get details of book (bookId,name,price,Author) store it into set.
1. display all book details
2. Display books in descending order  of price
 */

package Com.bhavna.task1;

public class BookDetails implements Comparable<BookDetails> {
	private int bookId;
	private String name;
	private int price;
	private String authorName;

	protected int getBookId() {
		return bookId;
	}

	protected void setBookId(int bookId) {
		this.bookId = bookId;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getPrice() {
		return price;
	}

	protected void setPrice(int price) {
		this.price = price;
	}

	protected String getAuthorName() {
		return authorName;
	}

	protected void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public BookDetails(int bookId, String name, int price, String authorName) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.price = price;
		this.authorName = authorName;
	}

	public void display() {
		System.out.println(bookId + "\t" + name + "\t" + price + "\t" + authorName);

	}

	public int compareTo(BookDetails b) {
		if (this.getPrice() > b.getPrice())
			return -1;
		else if (this.getPrice() < b.getPrice())
			return 1;
		else
			return 0;
	}

	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		BookDetails book = (BookDetails) obj;

		return (book.name == this.name && book.bookId == this.bookId);
	}

	@Override
	public int hashCode() {

		return this.bookId;
	}

}
