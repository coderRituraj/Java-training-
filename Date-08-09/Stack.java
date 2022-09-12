package Com.bhavna.task1;
import java.util.*;
public class Stack {
	//private Nodes head;
	private Nodes top;
	int size;
	
	public Stack() {
		//head = null;
		top = null;
	}
	public void PushStack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much element that you want to push on Stak.\nEnter the lenght of stack");
		size = sc.nextInt();
		System.out.println("Enter the "+size+" element that you want to push in stack");
		do {
			String data = sc.next();
			Nodes node = Nodes.getNode(data);
			if(top == null) {
				top = node;
				//node.setNxt(top);
				//top.setNxt(top.getNxt());
			}
			 else if (size == 1) {
				 System.out.println("Overflow Condition");
				
			}
			size--;
		}while(size > 0);
		
	}
	public String  peek() {
		return this.top.getData();
	}
	public String Pop() {
		if(size == 0) {
			return "Underflow Condition";
		}
		else {
		String TopPop = this.top.getData();
		this.top = this.top.getNxt();
		return TopPop;
		
			
		}
	}
}

