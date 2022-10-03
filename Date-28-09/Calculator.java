package Com.Bhavna.Maven.Junit;

public class Calculator {
	public int addition(int value1, int value2) {
		return value1 + value2;
	}

	public double addition(double value1, double value2) {
		return value1 + value2;
	}

	public String addition(String sValues, String sValues1) {
		return sValues + sValues1;
	}

	public int substraction(int value1, int value2) {
		return value1 - value2;
	}

	public int multiplication(int value1, int value2) {
		return value1 * value2;

	}

	public int division(int value1, int value2) {
		int result=0;
		try {
			result = value1 / value2;
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		return result;
	}

}
