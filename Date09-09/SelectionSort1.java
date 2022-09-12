package Com.bhavna.task1;

public class SelectionSort1 {
	
	    void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	        {
	            
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 
	    // Driver code to test above
	    public static void main(String args[])
	    {
	        SelectionSort1 ob = new SelectionSort1();
	        int arr[] = {90,25,57,22,34};
	        ob.sort(arr);
	        System.out.println("Sorted array");
	        ob.printArray(arr);
	    }
	}


