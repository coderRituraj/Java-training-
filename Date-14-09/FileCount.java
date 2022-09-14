/*
  Write program to count total number of files and folders in perticular folder

 */
package Com.bhavna.task1;
import java.io.*;

public class FileCount {

	public static void main(String[] args) {
		int subdirectory = 0;
		int file1=0;
	try {
		File file = new File("C:\\Users\\Rituraj.singh\\Documents\\master");
	/*	while(true) {
		if(file.exists()) {
			count += 1;
			if(!file.exists()) {
				break;
				
			}
			
		} */
		/*String Arr[] = file.list();
		  int ln=Arr.length;
		System.out.println("Number Of file present in this folder "+ln);
  */
		
		File arr[] = file.listFiles();
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].isDirectory()) {
				subdirectory += 1;
			}
			else if(arr[i].isFile()) {
				file1 += 1;
		}
		}
		System.out.println("Total Number of directory "+subdirectory);
		System.out.println("Total Number of file "+file1);
	} 
	
	catch(Exception e) {
		System.out.println("No File and folder available");
	}



	}

}
