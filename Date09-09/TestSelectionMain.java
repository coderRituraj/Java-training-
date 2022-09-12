package Com.bhavna.task1;
import java.util.*;
public class TestSelectionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		
		int size1 =sc.nextInt();
		SelectionSort obj = new SelectionSort(size1);
		obj.setSize(5);
		obj.SortDisplay();
		
	}

}
