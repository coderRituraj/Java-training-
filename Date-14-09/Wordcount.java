package Com.bhavna.task1;
import java.io.*;
import java.util.*;

public class Wordcount {
	public void Word() {
		int wordcount = 1;
		try {
			File file = new File("C:\\Users\\Rituraj.singh\\Documents\\master\\raj.txt");
			
				
					Scanner scan = new Scanner(file);
					while(scan.hasNextLine()) {
						String text = scan.nextLine();
						for(int i = 0; i<text.length();i++) {
							if(text.charAt(i) ==' ' && text.charAt(i-1)!=' ') {
								wordcount++;
							}
						}
					}
								
					System.out.println("Number of Word in this file is :- "+wordcount);
			
			
		}
		catch(Exception e) {
			System.out.println("Exception is found"+e);
		}
	}

}
