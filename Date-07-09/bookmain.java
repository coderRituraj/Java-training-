package Com.bhavna.task1;
import java.util.*;


public class bookmain {

	public static void main(String[] args) {
		book obj[];
		int size = 6;
		Scanner sc = new Scanner(System.in);
		obj = new book[size];
		System.out.println("Enter the following details:-\nBook id\nBook Name \nAuthor Name \nBook Price ");
		for(int i = 0;i<size;i++) {
			int id = sc.nextInt();
			String name = sc.next();
			String author = sc.next();
			double price = sc.nextDouble();
			Date date = new Date();
			obj[i] = new book(id,name,author,price,date);	
		}
		// For display all details book.
		for(book b1 : obj) {
	    	b1.display();
	    }
		 Arrays.sort(obj);
		 for(book b :obj) {
			 b.display();
		 }
		System.out.println("Seaching a particular book by name");
	    
	    for(book b : obj) {
	    	if(b.getBookname().equalsIgnoreCase("Mathematics")) {
	    		b.display();
	    	}
	    }

	    
	}

}
