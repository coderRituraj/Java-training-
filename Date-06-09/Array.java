package Com.bhavna.task1;
import java.util.*;
/*
Write Program to accept elements for integer array and
1. Display All elements
2.Display Sum of all elements
3. Display sum of even elements and odd elements
Use method Overloading and Constructor
*/

public class Array {
	int Arr[];
	int size;
	Scanner sc = new Scanner(System.in);

	//Constructor
	public Array(int size)
	{
		super();
		this.size = size;
		Arr = new int[size];
		System.out.println("Enter element of array");
	    for(int i=0;i<size;i++) 
	    {
	    	Arr[i]= sc.nextInt();
	    }
	}
	
	public void sum()
	{
		int SumEven =0;
		int SumOdd =0;
		for(int i =0; i<size; i+=1)
		{
			if(Arr[i]%2 == 0) 
			{
			SumEven = Arr[i]+SumEven;
			}
			
			else 
			{	
			SumOdd = Arr[i]+SumOdd;	
		
			}
		System.out.println("Sum of Odd Position elements of array "+SumEven);
		System.out.println("Sum of even Position elements of array "+SumOdd);
	}
	}
	
	// Fuction Overloading 
	public void sum(String s)
	{int sum =0;
		for(int num:Arr)
		{
			sum=num+sum;
		}
		System.out.println("Sum of all elements of array "+sum );
	}
	
	
	

}
