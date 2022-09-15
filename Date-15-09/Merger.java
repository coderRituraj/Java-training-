package Com.bhavna.task1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Merger {
	public void merge(File f1,File f2) {
		 try {
	            FileWriter writer=new FileWriter("D://result.txt",true);
	            if(f1.exists() && f1.isFile() && f2.exists() && f2.isFile()) {
	                FileReader reader = new FileReader(f1);
	                FileReader reader1 = new FileReader(f2);
	                while(true) {
	                    int i=reader.read();
	                    int j=reader1.read();
	                    if(i==-1 && j==-1) {
	                        break;
	                    }
	                    writer.write((char)i);
	                    writer.write((char)j);
	                }



	           }
	            writer.close();
	            System.out.println("Merge successful");
	        }catch(Exception e) {
	            
	        }
	    }
		
		
	}

