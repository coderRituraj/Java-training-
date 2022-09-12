package Com.bhavna.task1;
import java.util.*;
public class DoublyLinkList {
	private Nodes head;
	private Nodes prev;
	private Nodes tail;
	private Nodes temp =tail;
	
	public DoublyLinkList() {
		head = null;        
		prev = null;
		tail = null;
	}
	
	public void createdll() {
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(" Enter the data ");
			String data = sc.next();
			Nodes node = Nodes.getNode(data);
			if(head == null) {
				head = node;
				tail = node;
				prev = null;	
			}
			else{
				tail.setNxt(node);
				node.setPrv(tail);
				tail=node;
				tail.setNxt(null);	
			}
			System.out.println("Do want to add more element yes/no");
			choice = sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		
	}
	public void displaydl() {
		if(head == null) {
			System.out.println("Dll is empty");
		}else {
			Nodes ref = head;
			while(ref != null) {
				System.out.println();
				System.out.print(ref.getData()+"  ");
				ref = ref.getNxt();
			}
		}
	}
	

}
