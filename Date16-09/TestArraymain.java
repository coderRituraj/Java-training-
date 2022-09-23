package ArrayTask;

public class TestArraymain {
	public static void main(String[] arg) {
		
	ArrayDemo obj = new ArrayDemo();
	int arr[] = {10,20,10,10,20,30,30,30,40};
    int n = arr.length;
	obj.frequency(n,arr);
}
}
