package Com.bhavna.task1;
import java.util.*;

public class TestStackMain {

	public static void main(String[] args) {
	Stack obj = new Stack();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter '1' for Push \nEnter '2' for Pop");
	int n = sc.nextInt();
	if(n ==1 ) {
	obj.PushStack();
	}
	else if(n==2) {
	obj.Pop();
	}
	else
		System.out.println("Wrong Option");

}
}
