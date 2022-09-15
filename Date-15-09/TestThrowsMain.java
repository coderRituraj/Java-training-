package Com.bhavna.task1;

public class TestThrowsMain {

	public static void main(String[] args) {
		try {
			ThrowDemo obj = new ThrowDemo();
			obj.reader();
		}
catch(Exception e) {
	System.out.println(e);
}
	}

}
