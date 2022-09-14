
/*
 * Write Program to create new array list , add some animals name in it as String and display each element by using
-simple for -Advanced for - Iterator -ListIterator
 */
//import java.util.List;
//import java.util.ArrayList;
import java.util.*;
public class MyArrayList {
public void display() {
 List<String> lst = new ArrayList<String>();
 lst.add("Elephant");
 lst.add("Cat");
 lst.add("Dog"); 
 lst.add("Fox");
 lst.add("Tiger"); 
 lst.add("Lion");
 //System.out.println();
 System.out.println("Using Simple for loop");
 for(int i =0; i<lst.size();i++) {
	 System.out.println(lst.get(i));
 }
 System.out.println();
 System.out.println("Using For each loop");
 for(String l : lst ) {
	 System.out.println(l);
	 
 }
 System.out.println();
 System.out.println("Using Iterator");
 Iterator<String> iter =lst.iterator();
 while(iter.hasNext()) {
	 System.out.println(iter.next()+" ");
 }
 System.out.println();
 System.out.println("Using List-Iterator");
 ListIterator ltr = lst.listIterator();
 while(ltr.hasNext()) {
	 String animal_name =(String)ltr.next();
	 System.out.println(animal_name+" ");
 }
}
 
}
