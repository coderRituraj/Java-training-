package Com.bhavna.task1;
import java.util.*;
public class SelectionSort {
	private int arr[];
	private int size;
	protected int[] getArr() {
		return arr;
	}
	protected void setArr(int[] arr) {
		this.arr = arr;
	}
	protected int getSize() {
		return size;
	}
	protected void setSize(int size) {
		this.size = size;
	}
	public SelectionSort(int size) {
		super();
		Scanner sc = new Scanner(System.in);
		//this.arr = arr;
		this.size = size;
		System.out.println("Enter the element of array");
		for(int i = 0; i<size;i++) {
			arr[i]=sc.nextInt();
			sc.close();
		}
		
	}
	public void SortDisplay() {
		for(int i=0;i<size;i++) {
			for(int j =0 ; j <size; j++) {
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
				
			}
		}
		public void display() {
		for(int a : arr) {
			System.out.println(a+" ");
			
		}
		}
	}
	
	

}
