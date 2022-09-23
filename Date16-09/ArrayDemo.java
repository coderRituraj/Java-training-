package ArrayTask;

import java.util.Arrays;

public class ArrayDemo {
	public void frequency(int size,int arr[]) {
	
		boolean[] travers = new boolean[size];

	  //  Arrays.fill(travers, false);
		for(int i =0;i<size;i++) {
			if(travers[i] == true) 
				continue;
			int count=1;
				for(int j=i+1;j<size;j++) {
					if(arr[i]==arr[j]) {
						travers[j] = true;
						count++;
					}
					
				
				
			}
				System.out.println(arr[i]+" "+count);
			
		}
		
		
	}

}
