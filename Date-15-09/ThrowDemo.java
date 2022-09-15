package Com.bhavna.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.AccessException;

public class ThrowDemo {
	public void reader() throws IOException,FileNotFoundException  {
		File file = new File("C:\\Users\\Rituraj.singh\\Documents\\master\\raj2.txt");
		FileReader read = new FileReader(file);
		while(true) {
			int i =read.read();
			System.out.println(i);
		}
	}

}
