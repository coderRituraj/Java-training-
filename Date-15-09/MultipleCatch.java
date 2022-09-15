package Com.bhavna.task1;

public class MultipleCatch {
	public void division(int val1, int val2) {
		try {
			int result = val1 / val2;
			System.out.println(result);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
