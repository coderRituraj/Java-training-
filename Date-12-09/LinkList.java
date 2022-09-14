
/*
 * Write Program to create link list add Country names in it as String. 
 * Create new array list similar with link list. Display content of both using Iterator
 */
package task1;
import java.util.*;

public class LinkList {
	public void display() {
		List<String> link = new LinkedList<String>(); //  Generic way for String only.
		
		link.add("India");
		link.add("Russia");
		link.add("Canada");
		link.add("USA");
		link.add("UK");
		
		System.out.println(link);
		
		List<String> lnk = new ArrayList<String>();
		lnk.add("India");
		lnk.add("Russia");
		lnk.add("Canada");
		lnk.add("USA");
		lnk.add("UK");
		
		System.out.println(lnk);
		
		System.out.println("Using Iterator");
		
		Iterator iter = link.iterator();
		while(iter.hasNext()) {
			
			System.out.println(iter+" ");
			
		}
		
		Iterator iter1 = lnk.iterator();
		while(iter.hasNext()) {
			System.out.println(iter1+" ");
		}
		
	}

}
