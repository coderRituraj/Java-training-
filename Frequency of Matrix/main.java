package frequencyOfMatrix;
import java.util.*;
public class main {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
	    System.out.print("Enter the length of array");
		int row =n.nextInt();
		System.out.print("Enter the element of array");
		int m[] = new int[row];
		
		int res[] = new int[row];
		// take input from user side 
		for(int i=0; i< row; i++)
		{
			m[i]=n.nextInt();
		}
		
		// for check frequency of array
		
		while( row > 0) {
			int flag=0;
			int j=0;
			for(int i=0; i<row; i++) 
			{
			if(m[j]==m[i])
			{
				flag =flag+1;
				res[j]=flag;
				
			}
			else 
				continue;
			
			}
			flag =0;
			j++;
			
		}
		for(int i=0; i< res.length; i++) {
			System.out.println(res[i]);
		}
		
	}

}
