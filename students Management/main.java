
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		course obj1 = new course();
		obj1.enroll("Abhay","B.tech");
		obj1.upt_out("Komal", 2022, "Bsc");
		
		Firstyear obj = new Firstyear();
		obj.disc("NIkhil");
		obj.activityview();
		
		secondyear obj2 = new secondyear();
		obj2.disc("NIkhil Roy");
		obj2.activityview();
		
		finalyear obj3 = new finalyear();
		obj3.disc("Karan");
		obj3.activityview();

	}

}
