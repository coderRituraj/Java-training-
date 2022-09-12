package Com.bhavna.task1;
import java.util.*;
import java.lang.*;
/*
 
Whrite Java program to accept record of Books and store in array of object.
1. Display All Records
2. Search book by name
3. Display All Book Record Sorted by price and Name of Book
4. Display Record  of all Books in decending order of date.

 */

public class book implements Comparable<book>  {
	private int bid;
	private String bookname;
	private String author;
	private double price;
	 Date date =new Date();
	 
	 public int compareTo(book obj){
		 if(this.price>obj.price) {
			 return 1;
		 }
		 else if (this.price<obj.price) {
			 return -1;
		 }
			 else 
				 return 0;
	 }
	 
	protected int getBid() {
		return bid;
	}
	protected void setBid(int bid) {
		this.bid = bid;
	}
	protected String getBookname() {
		return bookname;
	}
	protected void setBookname(String bookname) {
		this.bookname = bookname;
	}
	protected String getAuthor() {
		return author;
	}
	protected void setAuthor(String author) {
		this.author = author;
	}
	protected double getPrice() {
		return price;
	}
	protected void setPrice(double price) {
		this.price = price;
	}
	protected Date getDate() {
		return date;
	}
	protected void setDate(Date date) {
		this.date = date;
	}
	public book(int bid, String bookname, String author, double price,Date date) {
		super();
		this.bid = bid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.date = date;
	
	}
	
	public void display() {
		System.out.println(this.bid+" "+this.bookname+" "+this.author+" "+this.price+" "+this.date);
	}
	

}
