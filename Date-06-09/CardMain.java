package Com.bhavna.task2;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardDetails obj;
		obj = new Membership("Abhay","2212XXXXXXXX1900","12/25",6);
		obj.display();
		System.out.println();
		obj = new PayBack("Abhay","2212XXXXXXXX1900","12/25",10000,1000221);
		obj.display();
	}

}
